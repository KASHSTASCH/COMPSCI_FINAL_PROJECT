package pkg;

public class Equipment{
  int dmg;
  int health;
  String name;
  public Equipment(String name,int dmg,int health){
    
    this.dmg = dmg;
    this.health = health;
    this.name = name;
  }
  public void setDmg(int dmg){
    this.dmg = dmg;
  }
  public void setHealth(int health){
   this.health = health; 
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
 
  public int getEDmg(){
    return dmg;
  }
  public int getEHealth(){
    return health;
  }
}