package net.company.action.impl;

import net.company.action.Action;
import net.company.action.ActionBuilder;
import net.company.action.ActionGenerator;
import net.company.strategy.impl.PSRActionPKStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * An action generator generating actions based on console input from user.
 */
public class PSRActionCommandLineGenerator implements ActionGenerator {
    /** All actions come from builder */
    private final ActionBuilder builder;

    /** To read user input from console */
    private final BufferedReader br;

    public PSRActionCommandLineGenerator() {
        this.builder = new PSRActionBuilder(PSRActionPKStrategy.INSTANCE());
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public Action getAction() {
        while (true) {
            System.out.print("Enter an action[paper, rock, scissor]: ");
            try {
                String name = br.readLine();

                if (PSRActionBuilder.ROCK.equals(name)) {
                    return builder.build(name);
                }
                else if (PSRActionBuilder.PAPER.equals(name)) {
                    return builder.build(name);
                }
                else if (PSRActionBuilder.SCISSOR.equals(name)) {
                    return builder.build(name);
                }
                else {
                    System.out.println("Unknown action: " + name + ", only support: paper, rock, scissor");
                }
            }
            catch (IOException e) {
                System.err.println("Error: " + e);
            }
        }
    }
}
