package CardJitsu;

public class Logistics {
    
    public Card roundWinner(Card user, Card dealer){
        Dealer deal = new Dealer();
        User use = new User();
        String userChoiceE = user.getElement();
        String dealerChoiceE = dealer.getElement();
        
        int userChoiceS = user.getStrength();
        int dealerChoiceS = dealer.getStrength();
        
        if(userChoiceE.equalsIgnoreCase("FIRE") && dealerChoiceE.equalsIgnoreCase("ICE")){
            use.setElementList(0);
            return user;
        }else if(userChoiceE.equalsIgnoreCase("WATER") && dealerChoiceE.equalsIgnoreCase("FIRE")){
            use.setElementList(1);
            return user;
        }else if(userChoiceE.equalsIgnoreCase("ICE") && dealerChoiceE.equalsIgnoreCase("WATER")){
            use.setElementList(2);
            return user;
        }else if(dealerChoiceE.equalsIgnoreCase("FIRE") && userChoiceE.equalsIgnoreCase("ICE")){
            deal.setElementList(0);
            return dealer;
        }else if(dealerChoiceE.equalsIgnoreCase("WATER") && userChoiceE.equalsIgnoreCase("FIRE")){
            deal.setElementList(1);
            return dealer;
        }else if(dealerChoiceE.equalsIgnoreCase("ICE") && userChoiceE.equalsIgnoreCase("WATER")){
            deal.setElementList(2);
            return dealer;
        }else{
            if(userChoiceS > dealerChoiceS){
                use.setElementList(user.getElementNum());
                return user;
            }else if(dealerChoiceS > userChoiceS){
                use.setElementList(dealer.getElementNum());
                return dealer;
            }else{
                return null;
            }
        }
    }
    public Player gameWinner(){
        Dealer deal = new Dealer();
        User use = new User();
        
        boolean userHasWon = false;
        boolean dealerHasWon = false;
        
        for(int i=0;i<use.getElementList().length;i++){
            if(use.getElementList()[i] == false){
                userHasWon = false;
                break;
            }
            userHasWon = true;
        }
        for(int i=0;i<deal.getElementList().length;i++){
            if(deal.getElementList()[i] == false){
                dealerHasWon = false;
                break;
            }
            dealerHasWon = true;
        }
        if(userHasWon == true){
            return use;
        }else if (dealerHasWon == true){
            return deal;
        }else{
            return null;
        }
    }
}
