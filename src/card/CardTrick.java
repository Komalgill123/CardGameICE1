/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modified: KomalpreetKaur
 * Student id: 991797098
 * Date: 27 May,2025
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);             // random value 1-13
            c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);  // random suit
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            for (Card card : magicHand) {
                System.out.println(card);
        }
       Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a card value (1 to 13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.print("Pick a card suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
        }
    }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is NOT in the magic hand.");
    }

        scanner.close();
}
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    

