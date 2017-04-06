package net.company.strategy;


import net.company.action.Action;
import net.company.action.impl.PaperAction;
import net.company.action.impl.RockAction;
import net.company.action.impl.ScissorAction;
import net.company.strategy.impl.PSRActionPKStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for {@link PSRActionPKStrategy}
 */
public class PSRActionPKStrategyTest {
    @Test
    public void testPK() {
        ActionPKStrategy strategy = PSRActionPKStrategy.INSTANCE();
        Action paper = new PaperAction(strategy, "paper");
        Action rock = new RockAction(strategy, "rock");
        Action scissor = new ScissorAction(strategy, "scissor");

        assertEquals(0, strategy.pk(paper, paper));
        assertEquals(1, strategy.pk(paper, rock));
        assertEquals(-1, strategy.pk(paper, scissor));
        assertEquals(0, strategy.pk(rock, rock));
        assertEquals(-1, strategy.pk(rock, paper));
        assertEquals(1, strategy.pk(rock, scissor));
        assertEquals(0, strategy.pk(scissor, scissor));
        assertEquals(1, strategy.pk(scissor, paper));
        assertEquals(-1, strategy.pk(scissor, rock));
    }

    @Test(expected = RuntimeException.class)
    public void testPKWithUnknownAction() {
        Action action = new Action() {
            @Override
            public int pk(Action action) {
                return 0;
            }

            @Override
            public String getName() {
                return "hahaha";
            }
        };

        PSRActionPKStrategy.INSTANCE().pk(new PaperAction(null, "paper"), action);
    }
}
