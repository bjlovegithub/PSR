package net.company.strategy;

import net.company.action.Action;

/**
 * Common interface for action strategy, used to check which action will win the pk. For example, in Paper-Scissors-Rock,
 * the strategy will rule out that paper win rock, rock win scissor, scissor win paper.
 */
public interface ActionPKStrategy {
    /**
     * Check which action will win for input actions.
     *
     * @param firstAction Action
     * @param secondAction Action
     * @return 0 if two actions are fair, 1 if first action wins, -1 if second action win.
     */
    int pk(Action firstAction, Action secondAction);
}
