public class Main {
    public static void main(String[] args) {
//        Animal animal[] = new Animal[6];
////        animal[0] = new Mammal("Illia", "Ilaknds", 2, 1);
////        animal[1] = new Dog("Illia", "jkanf", 32, 2, "Koaks");
////        System.out.println(animal[0]);
////        animal[0].getVoice();
////        animal[0].eat();
////        animal[1].eat();


        Animal[] animals = new Animal[6];
        animals[1] = new Mammal();
        animals[2] = new Mammal("Illia", 12.4, 2, "Blue");
        System.out.println(animals[2].toString());


    }
}