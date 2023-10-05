import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fructs;

    public Box(){
        this.fructs = new ArrayList<>();
    }
    public void addFruit(T fruit){
        fructs.add(fruit);
    }

    public boolean compare(Box<?> otherBox){
        return Math.abs(this.getWeight() - otherBox.getWeight()) == 0;
    }

    public float getWeight(){
        float totalWeight = 0.0f;
        for (T fruit : fructs) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;

    }

    public void transfer(Box<T> otherBox){
        for (T fruit : fructs){
            otherBox.addFruit(fruit);
        }
        fructs.clear();
    }
}