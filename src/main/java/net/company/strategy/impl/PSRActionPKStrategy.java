package net.company.strategy.impl;

import net.company.action.Action;
import net.company.strategy.ActionPKStrategy;

import static net.company.action.impl.PSRActionBuilder.PAPER;
import static net.company.action.impl.PSRActionBuilder.ROCK;
import static net.company.action.impl.PSRActionBuilder.SCISSOR;

/**
 * Action pk strategy for Paper-Scissor-Rock game. Paper wins rock, rock wins scissor, scissor wins paper.
 */
public class PSRActionPKStrategy implements ActionPKStrategy {
    /**
     * PK result matrix. Index 0 for paper, 1 for rock, 2 for scissor.
     */
    private final static int[][] PK_MATRIX = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};

    private static PSRActionPKStrategy INSTANCE;

    /**
     * Disable creating a new instance.
     */
	private PSRActionPKStrategy() {}

    /**
     * Get the singleton instance of PSRActionPKStrategy.
     *
     * @return An instance of PSRActionPKStrategy.
     */
    public static ActionPKStrategy INSTANCE() {
        if (null == INSTANCE) {
            INSTANCE = new PSRActionPKStrategy();
        }

        return INSTANCE;
    }

    @Override
    public int pk(Action firstAction, Action secondAction) {
        int firstIdx = getIdx(firstAction.getName());
        int secondIdx = getIdx(secondAction.getName());

        if (-1 == firstIdx || -1 == secondIdx) {
            throw new RuntimeException("Unsupported action type, name: " + firstAction.getName() + ", " + secondAction.getName());
        }

        return PK_MATRIX[firstIdx][secondIdx];
    }

    private int getIdx(String name) {
        if (PAPER.equals(name)) {
            return 0;
        }
        else if (ROCK.equals(name)) {
            return 1;
        }
        else if (SCISSOR.equals(name)) {
            return 2;
        }
        else {
            return -1;
        }
    }
}
