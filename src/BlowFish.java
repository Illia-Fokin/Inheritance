import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlowFish extends Fish{
    private String shellType; // additional field

    BlowFish(String name, double weight, int age, String place, double length, String shellType){
        super(name, weight, age, place, length);
        this.shellType = shellType;
    }

    BlowFish(String name, double weight, int age, double length, String shellType){
        super(name, weight, age, length);
        this.shellType = shellType;
    }

    @Override
    public void eat() {
        System.out.println("The blowfish eats");
    }

    @Override
    public void getVoice() {
        System.out.println("The blowfish does not make any noise, it is a fucking fish!");
    }

    // Additional method
    public void sprint(){
        System.out.println("The blowfish blows itself when it is scared");
    }
}
