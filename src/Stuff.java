public class Stuff extends Person{
    private String education, position;

    public void initialize1(){
        super.initialize();
        System.out.print("Enter the education : ");
        this.education = scanner.nextLine();
        System.out.print("Enter the position : ");
        this.position = scanner.nextLine();
    }
    public void print1(){
        super.print();
        System.out.println("The education is : " + education);
        System.out.println("The position is : " + position);
    }
}
