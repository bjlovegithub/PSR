package net.company.action;

/**
 * Common interface for all actions. Each player may give out an action for each round. Action can {@link Action#pk(Action)}
 * against another action to check who is the winner.
 */
public interface Action {
    /**
     * PK with another action.
     *
     * @param action An input action.
     * @return 0 if two actions are fair, 1 if current action wins, -1 if input action win.
     */
    int pk(Action action);

    /**
     * Get action name.
     *
     * @return Action name.
     */
    String getName();
}
