package pkg;

public class Pathways{


public int letsAdventure1(int Adv1, Dude prot){
  
  
  if(Adv1==1){
    return 1;
  }
 System.out.println("\n\n\n\n");
  int choice = (int)(Math.random()*4);
  if(choice == 1){
   Ogre a = new Ogre();
    a.Fight(prot);
  }else if (choice == 2){
   Goblin b = new Goblin();
    b.Fight(prot);
  }else if (choice >= 3){
  Troll c = new Troll();
    c.Fight(prot);

  }
  prot.setGold(choice);
  return Adv1*letsAdventure1(Adv1 - 1, prot);
}
  
}