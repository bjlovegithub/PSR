package net.company.player;

import net.company.player.impl.RobotPlayer;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Test cases for {@link RobotPlayer}
 */
public class RobotPlayerTest {
    @Test
    public void testNextPSRAction() {
        Player player = new RobotPlayer();

        assertNotNull(player.nextAction());
    }
}
