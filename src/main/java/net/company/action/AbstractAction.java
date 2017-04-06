package net.company.action;

import net.company.strategy.ActionPKStrategy;

/**
 * Abstract base class for all actions.
 */
public class AbstractAction implements Action {
    private final ActionPKStrategy strategy;
    private final String name;

    public AbstractAction(final ActionPKStrategy strategy, final String name) {
        if (null == strategy) {
            throw new NullPointerException("Strategy is null");
        }
        if (null == name) {
            throw new NullPointerException("Action name is null");
        }

        this.strategy = strategy;
        this.name = name;
    }

    @Override
    public int pk(Action action) {
        return strategy.pk(this, action);
    }

    @Override
    public String getName() {
        return name;
    }
}
