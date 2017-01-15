package CardJitsu;

public class Main {
    public static void main(String[] args) {
        Dealer deal = new Dealer();
        User use = new User();
        Player play = null;
        Logistics log = new Logistics();
        
        boolean[] initElementList = {false, false, false};
        use.initElementList(initElementList);
        deal.initElementList(initElementList);
        
        while(play == null){
            use.printDeck();
            Card userChoice = use.chooseCard();
            Card dealerChoice = deal.chooseCard();
            log.roundWinner(userChoice, dealerChoice, use, deal);
            play = log.gameWinner(use, deal);
        }
        System.out.println("The " + play.name + " has won!");
    }
}