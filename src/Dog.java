import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Dog extends Mammal{
    private String breed; // additional field

    Dog(String name, double weight, int age, String place, String species, String woolColor){
        super(name, weight, age, place, woolColor);
        this.breed = species;
    }
    Dog(String name, double weight, int age, String species, String woolColor){
        super(name, weight, age, woolColor);
        this.breed = species;
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