package CardJitsu;

public abstract class Player {
    
    private boolean[][] hasElement;
    private Card[][] deck;
    protected String winDeclaration;
    
    public boolean[][] getElementList(){
        return this.hasElement;
    }
    public void setElementList(int i){
        int nextTrue = 0;
        for(int j=0; j<this.hasElement[i].length; j++){
            if(this.hasElement[i][j]==false){
                nextTrue = j;
                break;
            } 
        }
        this.hasElement[i][nextTrue] = true;
    } 
    public void initElementList(boolean[][] ElementList){
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
            if(hasElement[i][0] == true){
    		list = list + element;
            }
    	}
    	list = list + ")";
    	return list;
    }
    public int printWater(){
        int count = 0;
        for(int i=0;i<this.hasElement[1].length;i++){
            if(this.hasElement[1][i] == true){
                count++;
            }
        }
        return count;
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