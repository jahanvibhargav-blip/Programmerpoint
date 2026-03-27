import java.util.*; 
class Pk 
{
 public static void main(String[] args) 
 {
 HashMap<String, Integer> grades = new HashMap<>();
 ArrayList<String> pass=new ArrayList<>(); 
 ArrayList<String> fail=new ArrayList<>(); 
 int total=0;
 int highm=0;
 String hname=null;
 grades.put("Rahul", 72);
 grades.put("Priya", 85);
 grades.put("Arjun", 40);
 grades.put("Sneha", 91);
 grades.put("Vikram", 55);
  for(Map.Entry<String,Integer> entry : grades.entrySet())
 {
  String name=entry.getKey();
 int marks=entry.getValue();
 total=total+marks;
 if(highm<marks)
 {
   highm=marks;
   hname=name;
 }
 if(marks>=50)
 {
  pass.add(name);
 }
 else
  {
   fail.add(name);
  }
 }
 System.out.println("Average:"+total/5);
 System.out.println("pass student:"+pass);
 System.out.println("fail student:"+fail);
System.out.println("topper of class:-"+hname+" marks is"+highm);
 }
}