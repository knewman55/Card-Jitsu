package CardJitsu;

public class Dealer extends Player{

	public Dealer(){
		this.winDeclaration = "The opponent has won the game!";
	}
    public Card chooseCard() {
        this.createDeck();
        Card[][] deck=getDeck();
        
        boolean hasNoElements = true;
        
        for(int i=0;i<this.getElementList().length;i++){
            if(this.getElementList()[i][0] == true){
                hasNoElements = false;
                break;
            }
            hasNoElements = true;
        }
        
        Card highestCard = deck[0][0];
        for(int k=1; k<deck.length;k++){
            if(deck[k][0].getStrength() > deck[k-1][0].getStrength()){
                highestCard = deck[k][0];
            }
        }
        
        for(int i=0;i<this.getElementList().length;i++){
            if(this.getElementList()[i][0] == false){
                for(int j=0; j<deck.length; j++){
                    if(highestCard.getElementNum() != i && hasNoElements == false){
                        highestCard = deck[j][0];
                    }
                    else if((deck[j][0].getElementNum() == i) && (deck[j][0].getStrength() > highestCard.getStrength())){
                        highestCard = deck[j][0];
                    }
                }
            }
        }
        System.out.println("\n\nOpponent's Card: " + highestCard.getElement() + " " + highestCard.getStrength());
        return highestCard;
    }    
}