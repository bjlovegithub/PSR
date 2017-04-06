package net.company.action;


import net.company.action.impl.PSRActionBuilder;
import net.company.action.impl.RockAction;
import net.company.strategy.impl.PSRActionPKStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for {@link RockAction}
 */
public class RockActionTest {
    @Test
    public void testPK() {
        ActionBuilder builder = new PSRActionBuilder(PSRActionPKStrategy.INSTANCE());
        Action rock = builder.build("rock");
        assertEquals(0, rock.pk(rock));

        Action paper = builder.build("paper");
        assertEquals(-1, rock.pk(paper));

        Action scissor = builder.build("scissor");
        assertEquals(1, rock.pk(scissor));
    }

    @Test(expected = NullPointerException.class)
    public void testPKWithNull() {
        Action rock = new RockAction(PSRActionPKStrategy.INSTANCE(), "rock");
        rock.pk(null);
    }

    @Test(expected = NullPointerException.class)
    public void testPKWithNullName() {
        new RockAction(PSRActionPKStrategy.INSTANCE(), null);
    }
}
