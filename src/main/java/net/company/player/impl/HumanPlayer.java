package net.company.player.impl;


import net.company.action.ActionGeneratorFactor;
import net.company.player.AbstractPlayer;

/**
 * A human player inputting action through a command line.
 */
public class HumanPlayer extends AbstractPlayer {
    public HumanPlayer() {
        super(ActionGeneratorFactor.getPSRCommandLineGenerator());
    }
}
