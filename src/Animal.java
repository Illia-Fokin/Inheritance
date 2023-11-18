import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class Animal {
    private String name;
    private double weight;
    private int age;
    private String place; // additional field

    Animal(String name, double weight, int age, String place){
        this.name = name;
        this.weight = weight;
        this. age = age;
        this.place = place;
    }
    Animal(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public abstract void eat();
    public abstract void getVoice();
}
