package services.plasma.helium.api

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin
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
    fun registerBooleanSetting(
        plugin: Plugin,
        key: String,
        displayName: String,
        description: String,
        icon: Material,
        defaultValue: Boolean,
        onChange: (Player, Boolean) -> Unit
    ): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun registerMultiChoiceSetting(
        plugin: Plugin,
        key: String,
        displayName: String,
        description: String,
        icon: Material,
        options: List<String>,
        defaultValue: String,
        onChange: (Player, String) -> Unit
    ): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getBooleanSetting(
        player: Player,
        plugin: Plugin,
        key: String,
        defaultValue: Boolean
    ): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun getStringSetting(
        player: Player,
        plugin: Plugin,
        key: String,
        defaultValue: String
    ): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun updateBooleanSetting(
        player: Player,
        plugin: Plugin,
        key: String,
        value: Boolean
    ): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun updateStringSetting(
        player: Player,
        plugin: Plugin,
        key: String,
        value: String
    ): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    @Throws(RuntimeException::class)
    fun unregisterSettings(plugin: Plugin) {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

}
