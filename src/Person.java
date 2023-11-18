import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String surname, firstName, street, zipCode, city;
    public void initialize(){
        System.out.print("Enter the surname : ");
        this.surname = scanner.nextLine();
        System.out.print("Enter the first name : ");
        this.firstName =  scanner.nextLine();
        System.out.print("Enter the street : ");
        this.street  = scanner.nextLine();
        System.out.print("Enter the zipCode : " );
        this.zipCode = scanner.nextLine();
        System.out.print("Enter the city : ");
        this.city = scanner.nextLine();
    }
    public void print(){
        System.out.println("The surname is : " + surname);
        System.out.println("The first name is : " + firstName);
        System.out.println("The street is : " + street);
        System.out.println("The zip code is : " + zipCode);
        System.out.println("The city is : " + city);
    }
}
