package group_assignment;

public class Person {

 String name;
 int age;
 String city;
 double height;
 static int totalPeople = 0;


 void displayInfo() {
     System.out.println("=== Person Information ===");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("City: " + city);
     System.out.println("Height: " + height + " m");
     System.out.println();
 }

 void setHeight(double h) {

     double oldHeight = height;
     height = h;
     System.out.println(
         "Height changed from " + oldHeight + " to " + height + " m"
     );
 }

 void haveBirthday() {
     age = age + 1;
     System.out.println(
         name + " had a birthday! Now " + age + " years old."
     );
 }


 // Static method to display total number of Person objects created
 static void showTotalPeople() {
     System.out.println("Total people created: " + totalPeople);
 }
}
