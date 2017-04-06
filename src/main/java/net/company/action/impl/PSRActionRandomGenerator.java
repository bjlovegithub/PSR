package net.company.action.impl;


import net.company.action.Action;
import net.company.action.ActionBuilder;
import net.company.action.ActionGenerator;
import net.company.strategy.impl.PSRActionPKStrategy;

import java.util.Random;

/**
 * A action generator which will generate actions randomly for PSR game.
 */
public class PSRActionRandomGenerator implements ActionGenerator {
    /** Number of actions in paper-scissor-rock game */
    private final int ACTION_NUMBER = 3;

    private final Random random;

    /** All actions are from this builder */
    private final ActionBuilder builder;

    public PSRActionRandomGenerator() {
        this.random = new Random();
        this.builder = new PSRActionBuilder(PSRActionPKStrategy.INSTANCE());
    }

    @Override
    public Action getAction() {
        int idx = random.nextInt(ACTION_NUMBER);

        switch (idx) {
            case 0:
                return builder.build(PSRActionBuilder.PAPER);
            case 1:
                return builder.build(PSRActionBuilder.ROCK);
            case 2:
                return builder.build(PSRActionBuilder.SCISSOR);
            default:
                return builder.build(PSRActionBuilder.PAPER);
        }
    }
}
