package net.company.action.impl;


import net.company.action.AbstractAction;
import net.company.strategy.ActionPKStrategy;

/**
 * Rock in Paper-Scissor-Rock game
 */
public class RockAction extends AbstractAction {
    public RockAction(ActionPKStrategy strategy, String name) {
        super(strategy, name);
    }
}
