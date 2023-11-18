import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Fish extends Animal{
    private double length; // additional field

    Fish(String name, double weight, int age, String place, double length){
        super(name, weight, age, place);
        this.length = length;
    }
    Fish(String name, double weight, int age, double length){
        super(name, weight, age);
        this.length = length;
    }

    @Override
    public void eat() {
        System.out.println("The fish eats");
    }

    @Override
    public void getVoice() {
        System.out.println("The fish makes noises");
    }

    // Additional method
    public void sprint(){
        System.out.println("The fish sprints");
    }
}
