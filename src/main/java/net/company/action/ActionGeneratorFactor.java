package net.company.action;


import net.company.action.impl.PSRActionCommandLineGenerator;
import net.company.action.impl.PSRActionRandomGenerator;

/**
 * Factory to provide action generator for each player.
 */
public class ActionGeneratorFactor {
    public static ActionGenerator getPSRRandomGenerator() {
        return new PSRActionRandomGenerator();
    }

    public static ActionGenerator getPSRCommandLineGenerator() {
        return new PSRActionCommandLineGenerator();
    }
}
