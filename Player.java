package CardJitsu;

public abstract class Player {
    
    private boolean[] hasElement;
    private Card[][] deck;
    protected String winDeclaration;
    
    public boolean[] getElementList(){
        return this.hasElement;
    }
    public void setElementList(int index){
        this.hasElement[index] = true;
    } 
    public void initElementList(boolean[] ElementList){
        this.hasElement = ElementList;
    }
    public String printElementList(){
    	String element = null;
    	String list = "(";
    	for(int i=0; i<hasElement.length; i++){
    		switch(i){
    			case 0: element = " FIRE ";
    				break;
    			case 1: element = " WATER ";
    				break;
    			case 2: element = " ICE ";
    				break;
    		}
    		if(hasElement[i] == true){
    			list = list + element;
    		}
    	}
    	
    	list = list + ")";
    	return list;
    }
    public void createDeck(){
        CardGenerator cg = new CardGenerator();
        this.deck =  cg.Deck();
    }
    public Card[][] getDeck(){
        return this.deck;
    }
    public String getWinDeclaration(){
    	return this.winDeclaration;
    }
}