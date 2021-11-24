package moistcraft;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.settings.SettingsManager;
import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.api.ModInitializer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

public class MoistcraftExtension implements CarpetExtension, ModInitializer {
    public static final int SETTING = 69420;
    public static void noop() { }
    static
    {
        CarpetServer.manageExtension(new MoistcraftExtension());
    }

    @Override
    public void onGameStarted()
    {
        System.out.println("Initializing Moistcraft Carpet Extension");
        CarpetServer.settingsManager.parseSettingsClass(MoistcraftSettings.class);
    }

    @Override
    public void onServerLoaded(MinecraftServer server)
    {
    }

    @Override
    public void onTick(MinecraftServer server)
    {
    }

    @Override
    public SettingsManager customSettingsManager()
    {
        return null;
    }

    @Override
    public void onPlayerLoggedIn(ServerPlayerEntity player)
    {
    }

    @Override
    public void onPlayerLoggedOut(ServerPlayerEntity player)
    {
    }

    @Override
    public void onInitialize() {
    }
}
