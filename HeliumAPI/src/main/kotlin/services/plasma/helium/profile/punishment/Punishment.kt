package services.plasma.helium.profile.punishment

import java.util.UUID

class Punishment(val id: UUID, val type: PunishmentType) {

    var addedBy: UUID? = null
    var addedTo: UUID? = null
    var addedReason: String? = null
    var addedServer: String? = null
    var pardonedBy: UUID? = null
    var pardonedReason: String? = null
    var pardonedServer: String? = null
    var isSilent: Boolean = false
    var isPardoned: Boolean = false
    var isRollback: Boolean = false

    private var addedAtValue: Long = 0
    private var durationValue: Long = 0
    private var expiresAtValue: Long? = null
    private var pardonedAtValue: Long = 0

    fun getAddedAt(): Long = addedAtValue

    fun setAddedAt(addedAt: Long) {
        addedAtValue = addedAt
        expiresAtValue = null
    }

    fun getDuration(): Long = durationValue

    fun setDuration(duration: Long) {
        durationValue = duration
        expiresAtValue = null
    }

    fun getPardonedAt(): Long = pardonedAtValue

    fun setPardonedAt(pardonedAt: Long) {
        pardonedAtValue = pardonedAt
    }

    fun getExpiresAt(): Long = expiresAtValue ?: deriveExpiresAt(addedAtValue, durationValue)

    fun setExpiresAt(expiresAt: Long?) {
        expiresAtValue = expiresAt
    }

    fun isPermanent(): Boolean = durationValue == Long.MAX_VALUE

    fun hasExpired(): Boolean {
        if (isPermanent()) return false
        return System.currentTimeMillis() >= getExpiresAt()
    }

    fun isActive(): Boolean {
        if (isPardoned || isRollback) return false
        return !hasExpired()
    }

    fun getRemaining(): Long = getExpiresAt() - System.currentTimeMillis()

    fun isUnresolved(): Boolean {
        if (isPardoned || isRollback) return false
        return !hasExpired()
    }

    override fun equals(other: Any?): Boolean = other is Punishment && other.id == id

    override fun hashCode(): Int = id.hashCode()

    companion object {
        @JvmStatic
        fun deriveExpiresAt(addedAt: Long, duration: Long): Long {
            if (duration == Long.MAX_VALUE) return Long.MAX_VALUE
            if (duration < 0L) return addedAt - 1L

            val candidate = addedAt + duration
            if (candidate < addedAt) return Long.MAX_VALUE

            return candidate
        }
    }
}
