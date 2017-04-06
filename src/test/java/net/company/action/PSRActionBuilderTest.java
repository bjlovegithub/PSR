package net.company.action;

import net.company.action.impl.PSRActionBuilder;
import net.company.strategy.impl.PSRActionPKStrategy;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Test cases for {@link PSRActionBuilder}
 */
public class PSRActionBuilderTest {
    @Test
    public void testBuild() {
        ActionBuilder builder = new PSRActionBuilder(PSRActionPKStrategy.INSTANCE());

        Action action = builder.build("paper");
        assertNotNull(action);
        assertEquals("paper", action.getName());

        action = builder.build("rock");
        assertNotNull(action);
        assertEquals("rock", action.getName());

        action = builder.build("scissor");
        assertNotNull(action);
        assertEquals("scissor", action.getName());

        assertNull(builder.build(null));
        assertNull(builder.build("hahaha"));
    }

    @Test(expected = NullPointerException.class)
    public void testBuilderWithNullStrategy() {
        new PSRActionBuilder(null);
    }
}
