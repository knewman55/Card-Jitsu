package CardJitsu;

import java.util.Scanner;

public class User extends Player{
    
	public User(){
		this.winDeclaration = "You have won the game!!!";
	}
    public Card chooseCard(){
        Card[][] deck = this.getDeck();
		Scanner scan = new Scanner(System.in);
        Card choice=null;
               
        while(choice == null){
            try{
                int userInput = scan.nextInt();
                choice = deck[userInput - 1][0];
            }catch(Exception e){
                System.out.println("Choice out of range");
            }
        }
        System.out.println("\n\nYour Card: " + choice.getElement() + " " + choice.getStrength());
        return choice;
    }
    public void printDeck(){
        this.createDeck();
        for(int i=0; i<this.getDeck().length; i++){
            System.out.println(this.getDeck()[i][0].getElement() + " " + this.getDeck()[i][0].getStrength());
        }
    }
}