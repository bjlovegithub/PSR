package net.company.player;

import net.company.action.Action;
import net.company.action.ActionGenerator;

/**
 * Abstract base class for all players.
 */
public class AbstractPlayer implements Player {
    private final ActionGenerator actionGenerator;

    public AbstractPlayer(final ActionGenerator actionGenerator) {
        if (null == actionGenerator) {
            throw new NullPointerException("Action generator is null");
        }

        this.actionGenerator = actionGenerator;
    }

    @Override
    public Action nextAction() {
        return actionGenerator.getAction();
    }
}
