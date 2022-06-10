package pkg;
import java.util.ArrayList;
import java.util.Scanner;
public class Dude{
 Equipment[] stuff = new Equipment[3];
public ArrayList<Inventory> Bag = new ArrayList<Inventory>();

  String name;
  int BaseMaxHealth;
  int MaxHealth;
  int  BaseDmg;
  int EDMG;
  int gold;
  int health;
  int numE;
  int stam;
  int baseStam;
  public Dude(){
    gold = 50;
    health = 15;
    BaseMaxHealth = 20;
    MaxHealth = 0;
    BaseDmg = 5;
    EDMG = 0;
    numE = 0;
    stam = 10;
    baseStam = 10;
  }
 // public void addEquipment(){
     
//switch(  (Math.random()*8)(int)  ){
  
// case 1:  Bag.add(new Inventory("Excalibur",4,0));
// case 2:  Bag.add(new Inventory("Wooden Shield",0,10));
// case 3:  Bag.add(new Inventory("Metal Shield",0,12));
// case 4:  Bag.add(new Inventory("Spiked Shield",1,8));
// case 5:  Bag.add(new Inventory("Greg's Knife",2,3));
// case 6:  Bag.add(new Inventory("Greg's Shield",0,1));
// case 7:  Bag.add(new Inventory("Armor",0,15));
// case 8:  Bag.add(new Inventory("Greg's Sword",1,3));
//}
  }
  public void Heal(int heals, boolean cost){
    if((heals+this.health)>getMaxHealth()){
      heals = heals-(heals+this.health-this.MaxHealth);
    }
    if(cost){
    System.out.println("Health +"+ heals+" -"+heals+" Gold");
    this.gold = this.gold - heals;
      }else {
       System.out.println("Health +"+ heals);

      }
    this.health = this.health + heals;
  }

  public void takeDmg(int DMGG){
    health = health - DMGG;
    if(health<=0){
      System.out.println("\n\nGAME OVER\n\n\n");
      COMEON X = new COMEON();
      X.newGame();
    }
    System.out.println("-"+DMGG+"Health");
  }
    
  public void setGold(int gold){
    this.gold = this.gold+gold;
  }
public  void SetName(String name){
  this.name = name;
}
  
  public  void SetHealthDmg(int MaxHealth, int BaseDmg){
    this.BaseDmg = BaseDmg;
    this.MaxHealth =  MaxHealth;
  }
  public int getHealth(){
    return health;
  }
  public int getStam(){
    return stam;
  }
  public int getBStam(){
    return baseStam;
  }
  public void useStam(int change,boolean either){
    if(either){
      stam = stam-change;
      if(stam<0){
        stam = 0;
      }
    }else{
      stam = stam+change;
      if(stam>10){
        stam =10;
      }
    }
  }
  public int getGold(){
    return gold;
  }
  public String getName(){
    return name;
  }
public int getMaxHealth(){
  return MaxHealth+BaseMaxHealth;
}
public int getBaseDmg(){
  return BaseDmg;
}
  
  public void printStats(){
   System.out.println("Health: "+getHealth()+"/"+getMaxHealth() + " Damage: "+getDmg()+" Purse: "+getGold()+" Stamina: "+getStam()+"/"+getBStam());
    equipInfo();
    }
public void equipInfo(){
System.out.println("You are using "+getNumEquipments()+" Equiment(s) and can Equip "+(stuff.length-getNumEquipments())+" more\n\n");
}
  public void equipNames(){
    for(int x = 0; getNumEquipments()>x;x++){
    System.out.println(stuff[x].getName());
      }
  }
public int getNumEquipments(){
  int count = 0;
  for(int x = 0;x<2; x++){
    if(stuff[x]!=null){
      count++;
    }
  }
  return count;
}
  public int getDmg(){
    return BaseDmg+EDMG;
  }
  public void setEDMG(int EDMG,boolean ON){
    if(ON){
      this.EDMG = this.EDMG+EDMG;
    }else{
      this.EDMG = this.EDMG - EDMG;
    }
  }
  public void setMaxHealth(int MaxHealth,boolean ON){
    if(ON){
      this.MaxHealth = this.MaxHealth+MaxHealth;
    }else{
      this.MaxHealth = this.MaxHealth -MaxHealth;
    }
  }
  public void equipEquipment(String Ename,int ED,int EH){
  if(numE>2){
  System.out.println("Your Equipment slots are full Try unequiping somthing.");
  }else {
    stuff[numE] = new Equipment(Ename,ED,EH);
   setMaxHealth(stuff[numE].getEHealth(),true);
    setEDMG(stuff[numE].getEDmg(),true);
  numE++;
    }
  }
  public void unequipEquipment(String Ename){
   for(int x = 0; getNumEquipments()>x; x++){
     if(Ename.equals(stuff[x].getName())){   
    setMaxHealth(stuff[x].getEHealth(),false);
    setEDMG(stuff[x].getEDmg(),false);
       Bag.add(new Inventory(stuff[x].getName(),stuff[x].getEDmg(),stuff[x].getEHealth()));
       stuff[x] = null;
       numE--;
     }
   }
  }
  public void menuInventory(){
    System.out.println("Welcome to the inventory \n1 to see whats in your inventory\nOr 2 to equip of unequip items you have");
    Scanner sc = new Scanner(System.in);
    String Answer =sc.nextLine();
    
    if(Answer.equals("1")){
      for(int bruh = 0; bruh<Bag.size();bruh++){
        System.out.println((Bag.get(bruh)).getName()); 
      }
    }else if(Answer.equals("2")){
      System.out.println("Enter the name of the Equipment you wish to Equip.");
    equipNames();
      while(true){
    Answer = sc.nextLine();
    if(Answer.equals("cancel")){
      System.out.println();
      break;
      }else{
      for(int a = 0; a<Bag.size(); a++){
        if(Answer.equals((Bag.get(a)).getName())){
          equipEquipment((Bag.get(a)).getName(),(Bag.get(a)).getDmg(),(Bag.get(a)).getHealth());
          Bag.remove(a);
        }
      }
      }
    }
    }
  }
}

