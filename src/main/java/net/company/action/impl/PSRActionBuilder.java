package net.company.action.impl;


import net.company.action.Action;
import net.company.action.ActionBuilder;
import net.company.strategy.ActionPKStrategy;

/**
 * A action builder to provide concrete actions based on their names.
 */
public class PSRActionBuilder implements ActionBuilder {
    /** Supported action names */
    public static final String PAPER = "paper";
    public static final String ROCK = "rock";
    public static final String SCISSOR = "scissor";

    /** Builder acts a cache, same action will be reused during the game */
    private final Action PAPER_ACTION;
    private final Action ROCK_ACTION;
    private final Action SCISSOR_ACTION;

    public PSRActionBuilder(ActionPKStrategy strategy) {
        if (null == strategy) {
            throw new NullPointerException("Strategy is null");
        }

        this.PAPER_ACTION = new PaperAction(strategy, PAPER);
        this.ROCK_ACTION = new RockAction(strategy, ROCK);
        this.SCISSOR_ACTION = new ScissorAction(strategy, SCISSOR);
    }

    @Override
    public Action build(String actionName) {
        if (null == actionName) {
            return null;
        }

        if (PAPER.equals(actionName)) {
            return PAPER_ACTION;
        }
        else if (ROCK.equals(actionName)) {
            return ROCK_ACTION;
        }
        else if (SCISSOR.equals(actionName)) {
            return SCISSOR_ACTION;
        }

        return null;
    }
}
