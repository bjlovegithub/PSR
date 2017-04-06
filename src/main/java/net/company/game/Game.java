package net.company.game;

/**
 * Common interface for all games. A game may container multiple {@link net.company.player.Player}. Each player
 * may have a set of {@link net.company.action.Action}. For each round, actions from all players will
 * be judged.
 */
public interface Game {
    /**
     * Happily start playing...
     */
    void play();
}
