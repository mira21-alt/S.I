package group_assignment;

public class PersonTest {

 public static void main(String[] args) {


     Person p1 = new Person();
     p1.name = "Alice";
     p1.age = 25;
     p1.city = "New York";
     p1.height = 1.65;
     Person.totalPeople++;
     p1.displayInfo();

     Person p2 = new Person();
     p2.name = "Bob";
     p2.age = 30;
     p2.city = "London";
     p2.height = 1.75;
     Person.totalPeople++;
     p2.displayInfo();

     Person p3 = new Person();
     p3.name = "Charlie";
     p3.age = 22;
     p3.city = "Paris";
     p3.height = 0.0;
     Person.totalPeople++;
     p3.displayInfo();


     System.out.println("--- Setting Heights ---");
     p1.setHeight(1.68);
     p2.setHeight(1.82);
     System.out.println();


     System.out.println("--- Birthday Time! ---");
     p1.haveBirthday();
     System.out.println();


     System.out.println("--- Creating 5 more people ---");

     for (int i = 1; i <= 5; i++) {

         Person p = new Person();

         p.name = "Person" + i;
         p.age = 20 + i;
         p.city = "City" + i;
         p.height = 1.70;
         Person.totalPeople++;
         p.displayInfo();
     }

     Person.showTotalPeople();
 }
}

