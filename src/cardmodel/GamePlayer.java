/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 15june,2019
 */
package CardModel;

/**
 *
 * @author iamra
 */
public class GamePlayer {
    
    public static void main (String [] args){
        
        CardHand c = new CardHand();
        
        c.generate();
        
        for(CardModel ch : c.deck){
            
            System.out.println(ch.getSuit() + " " + ch.getValue());
        }
        
    }
    
}
