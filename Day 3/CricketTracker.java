import java.util.*;
class Player
 {
 String name;
 int runs;
 public Player(String name, int runs)
 {
 this.name = name;
 this.runs = runs;
 }
 public String getName()
 {
  return name;
 }
 public int getRuns()
 {
  return runs;
 }

 }
class CricketTracker
 {
 public static void main(String[] args)
 {
 ArrayList<Player> team = new ArrayList<>();
 team.add(new Player("Rohit", 83));
 team.add(new Player("Virat", 45));
 team.add(new Player("Dhoni", 67));
 team.add(new Player("Hardik", 32));
 team.add(new Player("Shubman", 91));
 int Total=0;
 int high=0;
 String hname=null;
for (Player p: team)
{
 int run=p.getRuns();
 String name=p.getName();
 Total+=run;
 if(high<run)
 {
   high=run;
   hname=name;
 }
 if(run>50)
 {
  System.out.print(name+" ("+run+") ");
 }
}
System.out.println("playars who scored more then 50");
System.out.println("Total score : "+Total);
System.out.println("Highest scored player :"+hname+" and score :"+high);
System.out.println("average score is :"+Total/5);


}
}