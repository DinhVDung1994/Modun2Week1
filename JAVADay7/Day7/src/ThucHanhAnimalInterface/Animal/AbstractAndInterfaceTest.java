package ThucHanhAnimalInterface.Animal;

import ThucHanhAnimalInterface.Edible.Edible;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal x:animals) {
            System.out.println(x.makeSound());

            if(x instanceof Chicken){
                Edible edible = ((Chicken) x);
                System.out.println(edible.howToEat());
            }
        }
    }
}
