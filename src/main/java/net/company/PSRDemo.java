package net.company;

import net.company.game.Game;
import net.company.game.impl.HumanRobotPSRGame;

/**
 * A demo for Paper-Scissor-Rock game.
 */
public class PSRDemo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: game rounds missing");
            printUsage();
            System.exit(1);
        }

        // parse the parameters
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.err.println("Error: The parameter rounds is not valid. Error: " + e);
            printUsage();
            System.exit(1);
        }

        Game game = new HumanRobotPSRGame(num);
        game.play();
    }

    private static void printUsage() {
        System.out.println("Usage: PSRDemo [rounds]");
        System.out.println("Parameters: ");
        System.out.println("\trounds: Rounds of a game.");
    }
}
