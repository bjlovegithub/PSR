package net.company.action;

import net.company.action.impl.PSRActionBuilder;
import net.company.action.impl.PaperAction;
import net.company.strategy.impl.PSRActionPKStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for {@link PaperAction}
 */
public class PaperActionTest {
    @Test
    public void testPK() {
        ActionBuilder builder = new PSRActionBuilder(PSRActionPKStrategy.INSTANCE());
        Action paper = builder.build("paper");
        assertEquals(0, paper.pk(paper));

        Action rock = builder.build("rock");
        assertEquals(1, paper.pk(rock));

        Action scissor = builder.build("scissor");
        assertEquals(-1, paper.pk(scissor));
    }

    @Test(expected = NullPointerException.class)
    public void testPKWithNull() {
        Action paper = new PaperAction(PSRActionPKStrategy.INSTANCE(), "paper");
        paper.pk(null);
    }

    @Test(expected = NullPointerException.class)
    public void testPKWithNullName() {
        new PaperAction(PSRActionPKStrategy.INSTANCE(), null);
    }
}
