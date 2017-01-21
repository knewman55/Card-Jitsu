package CardJitsu;

public class Main {
    public static void main(String[] args) {
        Dealer deal = new Dealer();
        User use = new User();
        Player play = null;
        Card winner;
        Logistics log = new Logistics();
        
        boolean[][] uinitElementList = new boolean[3][3];
        boolean[][] dinitElementList = new boolean[3][3];
        for(int i=0;i<uinitElementList.length;i++){
            for(int j=0;j<uinitElementList[i].length;j++){
                uinitElementList[i][j] = false;
                dinitElementList[i][j] = false;
            }
        }
        use.initElementList(uinitElementList);
        deal.initElementList(dinitElementList);
        
        Window window = new Window();
        System.out.println("Welcome to Card-Jitsu: Alpha 0.0");
        while(play == null){
        	System.out.println("\nYour Deck: ");
            use.printDeck();
            Card userChoice = use.chooseCard();
            Card dealerChoice = deal.chooseCard();
            winner = log.roundWinner(userChoice, dealerChoice, use, deal);
            if(winner == userChoice){
            	System.out.println("You won that round!");
            }else if(winner == dealerChoice){
            	System.out.println("Opponent won that round!");
            }else{
            	System.out.println("Tie!");
            }
            play = log.gameWinnerSameEl(use, deal);
            play = log.gameWinnerDifEl(use, deal);
            System.out.println("You have : " + use.printElementList());
            System.out.println("Opponent has : " + deal.printElementList());
            System.out.println(use.printWater());
        }
        System.out.println(play.getWinDeclaration());
    }
}