import java.util.*;
abstract class Student
{
   int roll;
   int regno;
   abstract void course();
}
class Kiitian extends Student
{
   void course()
   {
      System.out.print("Enter course name:");
      Scanner sc=new Scanner(System.in);
      String cname=sc.nextLine();
      System.out.println("Course name is:"+cname);
   }
}
class QUESTION1
{
   public static void main(String args[])
   {
      Kiitian k=new Kiitian();
      k.course();
   }
}