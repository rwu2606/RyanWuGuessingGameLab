package RyanWu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello what is your name?");
        String name = input.nextLine();
        System.out.println("Can you guess my secret number " + name + "?");
        double randomNumber1 = Math.floor(Math.random() * 10);
        int num = input.nextInt();
        while (!(num == randomNumber1)) {
            System.out.println("Try Again");
            num = input.nextInt();
        }
        System.out.println("You guessed the right number, " + name + "!");
        System.out.println("Now it's my turn to guess your number!");
        int higher = 100;
        int lower = 1;
        String Answer = "";
        do {
            int randomNumber2 = (higher + lower + 1) / 2;
            System.out.println("Is it " + randomNumber2 + "?");
            Answer = input.nextLine();
            if (Answer.equals("too low")) {
                lower = randomNumber2 + 1;
            }
            else {
                if (Answer.equals("too high")) {
                    higher = randomNumber2 - 1;
                }
            }
        }
        while (!Answer.equals("correct")) ;
        input.close();
        System.out.println("I told you I would guess it " + name + "!");
    }
}
