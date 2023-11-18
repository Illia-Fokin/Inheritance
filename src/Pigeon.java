import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pigeon extends Bird{
    private String colorOFTheEyes; // additional field

    Pigeon(String name, double weight, int age, String place, String featherColor, String colorOFTheEyes){
        super(name, weight, age, place, featherColor);
        this.colorOFTheEyes = colorOFTheEyes;
    }

    Pigeon(String name, double weight, int age, String featherColor, String colorOFTheEyes){
        super(name, weight, age, featherColor);
        this.colorOFTheEyes = colorOFTheEyes;
    }

    @Override
    public void eat() {
        System.out.println("The pigeon eats");
    }

    @Override
    public void getVoice() {
        System.out.println("The pigeon makes noise");
    }

    // Additional method
    public void fly(){
        System.out.println("The pigeon is flying!");
    }
}
