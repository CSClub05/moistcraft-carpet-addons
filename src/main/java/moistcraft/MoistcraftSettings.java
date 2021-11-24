package moistcraft;

import carpet.settings.ParsedRule;
import carpet.settings.Rule;
import carpet.settings.Validator;
import net.minecraft.server.command.ServerCommandSource;

import static carpet.settings.RuleCategory.CREATIVE;
import static carpet.settings.RuleCategory.SURVIVAL;
import static carpet.settings.RuleCategory.COMMAND;

import com.mojang.brigadier.Command;

public class MoistcraftSettings
{
    @Rule(desc="Endstone can be instamined", category = {SURVIVAL, "moistcraft"})
    public static boolean endstoneInstamine = false;

    @Rule(desc="Lets non ops whitelist", category = {COMMAND, "moistcraft"})
    public static boolean commandWhitelist = false;
    
}
