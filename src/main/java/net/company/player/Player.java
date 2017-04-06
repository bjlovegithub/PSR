package net.company.player;

import net.company.action.Action;

/**
 * Interface for all players. A player can play in the {@link net.company.game.Game} world.
 * For each round of the game, all players will get actions through {@link Player#nextAction()}, then
 * actions will be judged by {@link net.company.strategy.ActionPKStrategy} to determine the result.
 */
public interface Player {
	/**
	 * Get the next {@link Action} for the coming rounds.
	 *
	 * @return An action.
	 */
    Action nextAction();
}
