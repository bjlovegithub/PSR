package net.company.player;

import net.company.action.Action;
import net.company.player.impl.HumanPlayer;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Test cases for {@link HumanPlayer}
 */
public class HumanPlayerTest {
    @Test
    public void testNextPSRAction() throws Exception {
        InputStream mockInput = new ByteArrayInputStream("paper".getBytes(Charset.forName("UTF-8")));
        InputStream old = System.in;
        try {
            System.setIn(mockInput);

            Player player = new HumanPlayer();
            Action action = player.nextAction();
            assertNotNull(action);
            assertEquals("paper", action.getName());
        } finally {
            System.setIn(old);
        }
    }
}
