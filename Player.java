package CardJitsu;

public abstract class Player {
    
    private boolean[] hasElement;
    private Card[][] deck;
    protected String name;
    
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
    public String getName(){
    	return this.name;
    }
}