import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Dog extends Mammal{
    private String breed; // additional field

    Dog(String name, double weight, int age, String place, String woolColor, String breed){
        super(name, weight, age, place, woolColor);
        this.breed = breed;
    }
    Dog(String name, double weight, int age, String woolColor, String breed){
        super(name, weight, age, woolColor);
        this.breed = breed;
    }
    @Override
    public void eat(){
        System.out.println("The dog eats");
    }

    @Override
    public void getVoice() {
        System.out.println("The dog barks");
    }

    // Additional method
    @Override
    public void giveBirth(){
        System.out.println("The dog gives birth.");
    }
}