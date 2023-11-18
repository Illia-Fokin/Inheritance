import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Bird extends Animal{
    private String featherColor; // additional field

    Bird(String name, double weight, int age, String place, String featherColor){
        super(name, weight, age, place);
        this.featherColor = featherColor;
    }
    Bird(String name, double weight, int age, String featherColor){
        super(name, weight, age);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("The bird eats");
    }

    @Override
    public void getVoice() {
        System.out.println("The bird makes noises");
    }


    // Additional method
    public void fly(){
        System.out.println("The bird flies");
    }
}
