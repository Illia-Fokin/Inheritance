import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Mammal extends  Animal{
    private String woolColor; // additional field

    Mammal(String name, double weight, int age, String place, String woolColor){
        super(name, weight, age, place);
        this.woolColor = woolColor;
    }
    Mammal(String name, double weight, int age, String woolColor){
        super(name, weight, age);
        this.woolColor = woolColor;
    }
    @Override
    public void eat() {
        System.out.println("The mammal eats");
    }

    @Override
    public void getVoice() {
        System.out.println("The mammal makes noises");
    }

    // Additional method
    public void giveBirth(){
        System.out.println("Mammals give birth by the process is initiated by hormones which cause the muscular walls of the uterus to contract, " +
                           "expelling the fetus at a developmental stage when it is ready to feed and breathe ");
    }
}