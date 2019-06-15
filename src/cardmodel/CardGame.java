/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardModel;

/**
 *
 *  Rajkaran Singh Dhami
 */
public class CardGame {
    
    public enum Suit{SPADES, CLUBS, HEARTS, DIAMONDS};    //by using enumerator we donot need to use string
    
    private final Suit suit;  //final means value cannot be changed
    
    public enum Value{ ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    
    private Value value;

    public CardModel(Suit s, Value v){
        
        this.suit = s;
        this.value = v;
        
    }
    public Suit getSuit() {
        return suit;
    }

    
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }
    
}
