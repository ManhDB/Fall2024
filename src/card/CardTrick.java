/* name: Bui Duc Manh
student ID: 991741839
*/
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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            int minValue = 1;
            int maxValue = 13;
            int randomValue = rand.nextInt(maxValue - minValue + 1) + minValue;
            c.setValue(randomValue);
            int minSuit = 0;
            int maxSuit = 3;
            int randomNumber = rand.nextInt(maxSuit - minSuit + 1) + minSuit;
            String randomSuit = "";
            if(randomNumber == 0){
                randomSuit = "Hearts";
            }else if(randomNumber == 1){
                randomSuit = "Diamonds";
            }else if(randomNumber == 2){
                randomSuit = "Clubs";
            }else{
                randomSuit = "Spades";
            }
            c.setSuit(randomSuit);
            System.out.println(c.getSuit() + " " +c.getValue());
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
       
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a card value (1 - 13): ");
        int userValue = scan.nextInt();
        System.out.println("Enter a suit (0 - 3 where 0 = Hearts, 1 = Diamonds, 2 = Clubs, 3 = Spades)");
        int userSuit = scan.nextInt();
        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        System.out.println(luckyCard.getValue() + " " + luckyCard.getSuit);
 
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
