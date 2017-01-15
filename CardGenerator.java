package CardJitsu;

import java.util.Random;

public class CardGenerator {
    public Card[][] Deck(){
        Card[][] card = new Card[3][10]; //created the deck
        
        for(int i=0; i<card.length; i++){
            for(int j=0; j<card[i].length; j++){
                switch(i){ //Assigns element and number based on index
                    case 0: card[i][j] = new Card("FIRE", i, j, false);
                        break;
                    case 1: card[i][j] = new Card("WATER", i, j, false);
                        break;
                    case 2: card[i][j] = new Card("ICE", i, j, false);
                        break;
                }
            }
        }
        Card[][] x=Draw(card);
        return x;
    }
    public Card[][] Draw(Card[][] card){ //Randomly selects 5 cards. If they have already been used they cannot be redrawn though.
        Random rand = new Random();
        Card[][] deck= new Card[5][5];
        int randNum;//random
        int element;
        int strength; //possibly make a better algorythm
        for(int d = 0; d < 5;d++){
            
            randNum=rand.nextInt(30);
            
            //assigns the random number to an elemt and the strength
            if(randNum <= 9){
                element=0;
                strength=randNum;
            }else if(randNum > 9 && randNum < 20){
                element=1;
                strength=randNum-10;
            }else{
                element=2;
                strength=randNum-20;
            }
            if(card[element][strength].drawn()==true){
                d--;
            }else{
                deck[d][0]=card[element][strength];//deck = the element and strength
                deck[d][0].changeDrawn();//card can no longer be drawn
            }
        }
        return deck;
        
    }
}