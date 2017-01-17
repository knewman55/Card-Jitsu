package CardJitsu;

public class Main {
    public static void main(String[] args) {
        Dealer deal = new Dealer();
        User use = new User();
        Player play = null;
        Card winner;
        Logistics log = new Logistics();
        
        boolean[] uinitElementList = {false, false, false};
        boolean[] dinitElementList = {false, false, false};
        use.initElementList(uinitElementList);
        deal.initElementList(dinitElementList);
        
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
            play = log.gameWinner(use, deal);
            System.out.println("You have : " + use.printElementList());
            System.out.println("Opponent has : " + deal.printElementList());
        }
        System.out.println(play.getWinDeclaration());
    }
}