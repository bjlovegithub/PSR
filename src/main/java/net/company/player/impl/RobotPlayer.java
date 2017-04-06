package net.company.player.impl;


import net.company.action.ActionGeneratorFactor;
import net.company.player.AbstractPlayer;

/**
 * A robot playing PSR game. It will generate action randomly.
 */
public class RobotPlayer extends AbstractPlayer {
    public RobotPlayer() {
        super(ActionGeneratorFactor.getPSRRandomGenerator());
    }
}
