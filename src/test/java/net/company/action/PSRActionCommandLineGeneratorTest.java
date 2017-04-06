package net.company.action;

import net.company.action.impl.PSRActionCommandLineGenerator;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test cases for {@link PSRActionCommandLineGenerator}
 */
public class PSRActionCommandLineGeneratorTest {
    @Test
    public void test() throws Exception {
        InputStream mockInput = new ByteArrayInputStream("paper\nrock\nscissor\nhahaha\npaper".getBytes(Charset.forName("UTF-8")));
        InputStream old = System.in;
        try {
            System.setIn(mockInput);

            ActionGenerator generator = new PSRActionCommandLineGenerator();
            Action action = generator.getAction();
            assertNotNull(action);
            assertEquals("paper", action.getName());

            action = generator.getAction();
            assertNotNull(action);
            assertEquals("rock", action.getName());

            action = generator.getAction();
            assertNotNull(action);
            assertEquals("scissor", action.getName());

            action = generator.getAction();
            assertNotNull(action);
            assertEquals("paper", action.getName());
        } finally {
            System.setIn(old);
        }
    }
}
