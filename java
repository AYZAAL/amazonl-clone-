import java.util.*;

class Student
{
      int rollno,age;
      String name;
 Student(int rollno,String name,int age)
 {
       this.rollno = rollno;
       this.name = name;
       this.age = age;
}
}
 public class ArrayList_UDT
{
   public static void main(String args[])
  {
        Student s1 = new Student(1,"Druti",20);
       Student s2 = new Student(2,"Vidhisha",21);
       Student s3 = new Student(3,"Ardhaya",22);
       ArrayList<Student> list = new ArrayList<Student>();
       list.add(s1);
       list.add(s2);
       list.add(s3);
     
        for(Student st:list)
        {
           Student std = (Student)st;
          System.out.println(" "+std.rollno+" "+std.name+" "+std.age);
         }

     ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(10);
    intList.add(70);
    intList.add(99);
    intList.add(34);
   for(int i:intList)
   {
        System.out.println(i);
   
}
System.out.println("**** Iterator Demo *****");

  Iterator itr = intList.iterator();
  while(itr.hasNext())
  {
    System.out.println(" "+itr.next());
}
 itr.remove();
while(itr.hasNext())
  {
    System.out.println(" "+itr.next());
}
}
}