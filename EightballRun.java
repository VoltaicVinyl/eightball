/*
 * A simple Eightball Program
 * @author Kaelan Baker
 * @date 10/02/2022
 */

import java.util.Scanner;

public class EightballRun {
    public static void main(String[] args) throws InterruptedException {

        int shakes;
        boolean play = true;
        Scanner keyboard = new Scanner(System.in);

        while (play == true) {
            System.out.println();
            System.out.println("What is your question?");
            keyboard.nextLine();

            System.out.println();
            System.out.println("How many times do you want to shake the ball?");
            shakes = keyboard.nextInt();

            // skipping 2 lines for legibility
            System.out.println();

            // making the ball shake
            System.out.print("shaking the ball");
            for (int i = 0; i < shakes; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }

            // skipping a line for legibility
            System.out.println();

            Eightball newroll = new Eightball();
            System.out.println(newroll.getAnswer());

            // skipping a line for legibility
            System.out.println();

            System.out.println("Do you want to play again? (true/false) ");
            play = keyboard.nextBoolean();

            // flushing the buffer
            keyboard.nextLine();

        }
        // skipping a line for legibility
        System.out.println();

        System.out.println("Have a good day!");

        keyboard.close();
    }
}