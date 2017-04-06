package net.company.action.impl;


import net.company.action.AbstractAction;
import net.company.strategy.ActionPKStrategy;

/**
 * Scissor in Paper-Scissor-Rock game
 */
public class ScissorAction extends AbstractAction {
    public ScissorAction(ActionPKStrategy strategy, String name) {
        super(strategy, name);
    }
}
