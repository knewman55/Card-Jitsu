package CardJitsu;

public abstract class Player {
    
    private boolean[] hasElement = {false, false, false};
    private Card[][] deck;
    
    public boolean[] getElementList(){
        return this.hasElement;
    }
    public void setElementList(int index){
        this.hasElement[index] = true;
    } 
    public void initElementList(boolean[] ElementList){
        this.hasElement = ElementList;
    }
    public void createDeck(){
        CardGenerator cg = new CardGenerator();
        this.deck =  cg.Deck();
    }
    public Card[][] getDeck(){
        return this.deck;
    }
}
