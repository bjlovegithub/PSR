package net.company.action.impl;

import net.company.action.AbstractAction;
import net.company.strategy.ActionPKStrategy;

/**
 * Paper in Paper-Scissor-Rock game
 */
public class PaperAction extends AbstractAction {
    public PaperAction(ActionPKStrategy strategy, String name) {
        super(strategy, name);
    }
}
