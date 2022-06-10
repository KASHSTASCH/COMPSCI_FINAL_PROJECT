package pkg;

public class Inventory{
  int dmg;
  int health;
  String name;
public Inventory(String name, int dmg,int health){
  this.health = health;
  this.name = name;
  this.dmg = dmg;
}
public String getName(){
  return name;
}
public int getDmg(){
  return dmg;
}
 public int getHealth(){
   return health;
 }
public void setName(String name){
this.name = name;
}

  
}