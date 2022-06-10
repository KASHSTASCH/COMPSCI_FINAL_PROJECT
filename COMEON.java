package pkg;
import java.util.Scanner;

public class COMEON{
   public void newGame(){
    Dude prot = new Dude();
     Pathways path = new Pathways();
    String Answer;
   Scanner sc = new Scanner(System.in);
    System.out.println("\nWelcome Traveler to the Pigs Ear Tavern\n\nYou look hungry, want some food,I've some stew only 5 Gold\n\n(Food will raise your health, type 'stats' anytime to see your health and other info)");
    System.out.println("\nPress 1 to purchase the food");
    while(true){
     Answer = sc.nextLine();
 if(Answer.equals("1")){
      System.out.println("\nEnjoy that Traveler you look healthier already\n");
   prot.Heal(5,true);
   break;
    }else if(Answer.equals("stats")||Answer.equals("Stats")){
prot.printStats();
    }else if(Answer.equals("stats")||Answer.equals("Stats")){
    
prot.printStats(); 
           }else if(Answer.equals("unequip")||Answer.equals("UneQuip")||Answer.equals("Unequip")){
    
    System.out.println("Enter the name of the Equipment you wish to remove.");
    prot.equipNames();
    Answer = sc.nextLine();
    if(Answer.equals("cancel")){
      System.out.println();
    }
    prot.unequipEquipment(Answer);
  }else if(Answer.equals("Inv")){
    prot.menuInventory();
  }
    
      }
    System.out.println("Now that your back to your full strength I have a job for you\n I need you to go to the Mermaid Cove and retirieve the Trident of Wisdom\nBut first to aid you on your periless journey take this DAGGER\n(Press 1 to accept the dagger)");
      while(true){
     Answer = sc.nextLine();
         if(Answer.equals("stats")||Answer.equals("Stats")){
prot.printStats(); 
           }else if(Answer.equals("1")){
           prot.equipEquipment("Tin Dagger",1,5);
           break;
}
  
        }
    System.out.println("\nFairwell traveler\nBut take heed these paths arent very welcoming to outsiders\n\n(press 1 to leave the tavern and start your journey)\n\n(Type \"Inv\" to enter your inventory and \"cancel\" to exit\nand try unequip to remove a piece of equipment )");
    
     while(true){
     Answer = sc.nextLine();
      if(Answer.equals("1")){
        System.out.println("You leave the tavern and start down the winding road, heading deeper into the forest as you go");
        break;
      } if(Answer.equals("stats")||Answer.equals("Stats")){
prot.printStats(); 
           }else if(Answer.equals("stats")||Answer.equals("Stats")){
    
prot.printStats(); 
           }else if(Answer.equals("unequip")||Answer.equals("UneQuip")||Answer.equals("Unequip")){
    
    System.out.println("Enter the name of the Equipment you wish to remove.");
    prot.equipNames();
    Answer = sc.nextLine();
    if(Answer.equals("cancel")){
      System.out.println();
    }
    prot.unequipEquipment(Answer);
  }else if(Answer.equals("Inv")){
    prot.menuInventory();
  }
    
        }
System.out.println("You come to a path along the side of a cliff were a sign reads\nHeed travelors Dangerous path ahead\n(Press 1 to continue)\n");

    
while(true){
     Answer = sc.nextLine();

  
  if(Answer.equals("1")){
    
    path.letsAdventure1(6,prot);
  }else if(Answer.equals("stats")||Answer.equals("Stats")){
    
prot.printStats(); 
           }else if(Answer.equals("unequip")||Answer.equals("UneQuip")||Answer.equals("Unequip")){
    
    System.out.println("Enter the name of the Equipment you wish to remove.");
    prot.equipNames();
    Answer = sc.nextLine();
    if(Answer.equals("cancel")){
      System.out.println();
    }
    prot.unequipEquipment(Answer);
  }else if(Answer.equals("Inv")){
    prot.menuInventory();
  }
    
      }
   
  }
}
