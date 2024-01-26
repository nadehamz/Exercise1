package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author Hamzah Nadeem
 * @author
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomNumber());
            card.setSuit(Card.SUITS[generateRandomNumber(4)]);
            hand[i] = card;
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card! Enter value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.println("Enter suit (1-4): ");
        int userSuit = scanner.nextInt();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]);

        // Search for the user's card in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // If the guess is successful, invoke the printInfo() method
        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     *
     * @author Hamzah Nadeem
     */
    private static void printInfo() {
        System.out.println("I am done");
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Hamzah");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("Work as a database administarotr ");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("Playing sports, going to the gym");
    

        System.out.println();
    }

    /**
     * Generates a random number between 1 and 13 (inclusive).
     *
     * @return Random number
     */
    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

    /**
     * Generates a random number between 0 and max (exclusive).
     *
     * @param max Maximum value (exclusive)
     * @return Random number
     */
    private static int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
