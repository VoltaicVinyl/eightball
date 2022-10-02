/*
 * A simple Eightball Program
 * @author Kaelan Baker
 * @date 10/02/2022
 */
public class Eightball {

    private String answer;

    public Eightball() {
    }

    public String getAnswer() {
        double randDouble = Math.random() * 20;
        int rand = (int) randDouble;


        //Good answers
        if (rand == 0) {
            answer = "Crit success!";
        }

        if (rand == 1) {
            answer = "it is decidedly so.";
        }

        if (rand == 2) {
            answer = "Without a doubt.";
        }

        if (rand == 3) {
            answer = "Yes definitely.";
        }

        if (rand == 4) {
            answer = "You may rely on it.";
        }

        if (rand == 5) {
            answer = "As i see it, yes.";
        }

        if (rand == 6) {
            answer = "Most likely.";
        }

        if (rand == 7) {
            answer = "Outlook good.";
        }

        if (rand == 8) {
            answer = "Yes.";
        }

        if (rand == 9) {
            answer = "Signs point to yes.";
        }

        // non-commital answers

        if (rand == 10) {
            answer = "Reply hazy, ask again.";
        }

        if (rand == 11) {
            answer = "Ask again later.";
        }

        if (rand == 12) {
            answer = "Better not tell you now.";
        }

        if (rand == 13) {
            answer = "Cannot predict now.";
        }

        if (rand == 14) {
            answer = "Concentrate and ask again";
        }


        //bad answers
        if (rand == 15) {
            answer = "Don't count on it.";
        }

        if (rand == 16) {
            answer = "My reply is no.";
        }

        if (rand == 17) {
            answer = "My sources say no.";
        }

        if (rand == 18) {
            answer = "Outlook not so good.";
        }

        if (rand == 19) {
            answer = "Very Doubtful.";
        }

        if (rand == 20) {
            answer = "Crit Fail.";
        }
        return answer;
    }
}