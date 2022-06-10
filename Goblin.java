package pkg;
import java.util.*;


public class Goblin{
  String name;
  int  BaseDmg;
  int health;
    public Goblin(){
    health = 9;
    BaseDmg = 1;
    name = "Goyle";
  }
     public void Fight(Dude prot){
    Scanner sc = new Scanner(System.in);
    int g;
    int Answer;
     System.out.println("You are aproached by "+name);
    while(health>0){
   System.out.println("The Goblin goes to swipe at you\n(1 to Dodge left or 2 to Dodge right)");
      Answer = sc.nextInt();
       g = (int)(Math.random()*2)+1;
    if(Answer==g){
      System.out.println("Nice Dodge");
         System.out.println("Quick now that the Goblin is off balance attack it\n(1 for a Light Attack and 2 for a Heavy one)");
      Answer = sc.nextInt();
      if(Answer == 1){
        System.out.println("You lunge forward dealing "+prot.getDmg()+" damage to "+name+"\n +2 Stamina");
        health = health - prot.getDmg();
           prot.useStam(2,false);
        prot.printStats();
      }else if(Answer == 2){
        if(prot.getStam()>=4){
      System.out.println("You lurch to the left bringing your weapon down on "+name+" inflicting "+(prot.getDmg()+(prot.getDmg()/3))+" Damage but you feel more tired\n -4 Stamina");
         health = health - (prot.getDmg()+(prot.getDmg()/3));
          prot.useStam(4,true);
          prot.printStats();
      }else{
           System.out.println("You stumble to the right clumsily flailing your weapon barely hitting  "+name+"s leg inflicting "+prot.getDmg()/3+"Damage");
           health = (health - (prot.getDmg()/3));
      }
        }
      
    }else{
      System.out.println("Ouch! Try to stay on top of this Adventurer");
      prot.takeDmg(BaseDmg);
    }
   
      
      }
    
  }

}
  
