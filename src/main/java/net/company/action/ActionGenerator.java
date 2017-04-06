package net.company.action;

/**
 * Action generator provides actions for {@link net.company.player.Player}s.
 */
public interface ActionGenerator {

    /**
     * Offer an action to the player.
     *
     * @return An action. Should never be null.
     */
    Action getAction();
}
