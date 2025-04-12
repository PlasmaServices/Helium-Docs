package services.plasma.helium.api;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * API for managing custom settings in Helium's settings menu.
 * This interface allows plugins to add their own settings that
 * will be displayed in the /settings menu.
 */
public interface SettingsAPI {

    /**
     * Registers a boolean setting that can be toggled on/off
     *
     * @param plugin      The plugin registering this setting
     * @param key         Unique identifier for this setting within your plugin
     * @param displayName Display name shown in the settings menu
     * @param description Short description of what this setting does
     * @param icon        Material to use as the button icon
     * @param defaultValue Default value for this setting
     * @param onChange    Action to perform when the setting is changed
     * @return True if registration was successful
     */
    boolean registerBooleanSetting(
            Plugin plugin,
            String key,
            String displayName,
            String description,
            Material icon,
            boolean defaultValue,
            BiConsumer<Player, Boolean> onChange
    );

    /**
     * Registers a string setting with multiple options that cycle on click
     *
     * @param plugin      The plugin registering this setting
     * @param key         Unique identifier for this setting within your plugin
     * @param displayName Display name shown in the settings menu
     * @param description Short description of what this setting does
     * @param icon        Material to use as the button icon
     * @param options     List of options to cycle through
     * @param defaultValue Default value for this setting (must be in options list)
     * @param onChange    Action to perform when the setting is changed
     * @return True if registration was successful
     */
    boolean registerMultiChoiceSetting(
            Plugin plugin,
            String key,
            String displayName,
            String description,
            Material icon,
            List<String> options,
            String defaultValue,
            BiConsumer<Player, String> onChange
    );

    /**
     * Gets the current boolean setting value for a player
     *
     * @param player    The player to get the setting for
     * @param plugin    The plugin that registered the setting
     * @param key       The setting key
     * @param defaultValue The default value if not set
     * @return The current setting value
     */
    boolean getBooleanSetting(Player player, Plugin plugin, String key, boolean defaultValue);

    /**
     * Gets the current string setting value for a player
     *
     * @param player    The player to get the setting for
     * @param plugin    The plugin that registered the setting
     * @param key       The setting key
     * @param defaultValue The default value if not set
     * @return The current setting value
     */
    String getStringSetting(Player player, Plugin plugin, String key, String defaultValue);

    /**
     * Directly updates a boolean setting for a player
     *
     * @param player    The player to update the setting for
     * @param plugin    The plugin that registered the setting
     * @param key       The setting key
     * @param value     The new value
     * @return True if the setting was updated successfully
     */
    boolean updateBooleanSetting(Player player, Plugin plugin, String key, boolean value);

    /**
     * Directly updates a string setting for a player
     *
     * @param player    The player to update the setting for
     * @param plugin    The plugin that registered the setting
     * @param key       The setting key
     * @param value     The new value
     * @return True if the setting was updated successfully
     */
    boolean updateStringSetting(Player player, Plugin plugin, String key, String value);

    /**
     * Unregisters all settings for a plugin
     * Typically called when the plugin is disabled
     *
     * @param plugin The plugin to unregister settings for
     */
    void unregisterSettings(Plugin plugin);
}