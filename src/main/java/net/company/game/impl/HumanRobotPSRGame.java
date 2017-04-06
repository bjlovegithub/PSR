package net.company.game.impl;


import net.company.action.Action;
import net.company.game.Game;
import net.company.player.Player;
import net.company.player.impl.HumanPlayer;
import net.company.player.impl.RobotPlayer;

/**
 * A Paper-Scissor-Rock(PSR) game played by a human and a robot.
 */
public class HumanRobotPSRGame implements Game {
    /** Max number of rounds for this game */
    private final int rounds;

    /** Human player */
    private final Player humanPlayer;

    /** Robot player */
    private final Player robotPlayer;

    public HumanRobotPSRGame(int rounds) {
        this.rounds = rounds;
        this.humanPlayer = new HumanPlayer();
        this.robotPlayer = new RobotPlayer();
    }

    @Override
    public void play() {
        int currentRound = 1;
        Action humanAct;
        Action robotAct;

        while (currentRound <= rounds) {
            humanAct = humanPlayer.nextAction();
            robotAct = robotPlayer.nextAction();

            System.out.println("------\nRound:  " + currentRound);

            System.out.println("\tYour action:  " + humanAct.getName());
            System.out.println("\tRobot action: " + robotAct.getName());
            switch (humanAct.pk(robotAct)) {
                case -1:
                    System.out.println("\t[Robot wins!]");
                    break;
                case 0:
                    System.out.println("\t[Draw!]");
                    break;
                case 1:
                    System.out.println("\t[You wins!]");
                    break;
                default:
                    System.out.print("\tOooops... Something is wrong...");
                    break;
            }

            ++currentRound;
        }
    }
}
