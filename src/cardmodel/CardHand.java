/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Rajkaran Singh
 *Dhami
 */
package CardModel;

/**
 *
 * @author iamra
 */
public class CardHand {
    
    private int size=52;
    
    public CardModel [] deck = new CardModel[size];//array
    
    public void generate(){
        
        int counter=0;
        
        for(CardModel.Suit s : CardModel.Suit.values()){  //for each loop & s is a variable & reading data from CardModel array & Suit enum
            
            for(CardModel.Value v : CardModel.Value.values()){
                
                //CardModel c = new CardModel(s,v);
                //deck[counter]= c;
                
                deck[counter]=new CardModel(s,v);
                counter++;
                
            }
            
        }
    }
    
    
    
}
