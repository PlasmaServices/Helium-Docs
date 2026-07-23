package services.plasma.helium.profile.punishment

enum class PunishmentType(val context: String, val undoContext: String?, val isKick: Boolean) {
    BLACKLIST("blacklisted", "un-blacklisted", true),
    BAN("banned", "un-banned", true),
    MUTE("muted", "un-muted", false),
    WARN("warned", "un-warned", false),
    KICK("kicked", null, true)
}
