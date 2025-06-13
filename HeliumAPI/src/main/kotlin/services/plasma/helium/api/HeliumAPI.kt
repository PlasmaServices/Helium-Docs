package services.plasma.helium.api

import java.util.UUID

enum class HeliumAPI {
    INSTANCE;

    @Throws(RuntimeException::class)
    fun isServerOnline(server: String): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getServerState(server: String): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getOnlinePlayers(server: String): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getMaxPlayers(server: String): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getRankName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getRankDisplayName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getRankPrefix(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getRankSuffix(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getRankPriority(uuid: UUID): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getRankColor(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getTagName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getTagDisplayName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getCoins(uuid: UUID): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isAdminChat(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isStaffChat(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }
    
    @Throws(RuntimeException::class)
    fun isManagementChat(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    
    @Throws(RuntimeException::class)
    fun isDevChat(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    
    @Throws(RuntimeException::class)
    fun isDonatorChat(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }
    
    @Throws(RuntimeException::class)
    fun isSynced(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isMuted(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isBanned(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isBlacklisted(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isJailed(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getJailPoints(uuid: UUID): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isDisguised(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getNotes(uuid: UUID): List<String> {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isFrozen(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getFriendCount(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getOnlineFriends(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isVanished(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun isCommandBlocked(command: String): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun refreshPlayer(uuid: UUID) {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun refreshAllPlayers() {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

}
