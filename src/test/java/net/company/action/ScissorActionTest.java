package net.company.action;

import net.company.action.impl.PSRActionBuilder;
import net.company.action.impl.ScissorAction;
import net.company.strategy.impl.PSRActionPKStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for {@link ScissorAction}
 */
public class ScissorActionTest {
    @Test
    public void testPK() {
        ActionBuilder builder = new PSRActionBuilder(PSRActionPKStrategy.INSTANCE());
        Action scissor = builder.build("scissor");
        assertEquals(0, scissor.pk(scissor));

        Action rock = builder.build("rock");
        assertEquals(-1, scissor.pk(rock));

        Action paper = builder.build("paper");
        assertEquals(1, scissor.pk(paper));
    }

    @Test(expected = NullPointerException.class)
    public void testPKWithNull() {
        Action scissor = new ScissorAction(PSRActionPKStrategy.INSTANCE(), "scissor");
        scissor.pk(null);
    }

    @Test(expected = NullPointerException.class)
    public void testPKWithNullName() {
        new ScissorAction(PSRActionPKStrategy.INSTANCE(), null);
    }
}
