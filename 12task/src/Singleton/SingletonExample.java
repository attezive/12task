package Singleton;

public class SingletonExample {
    private int counter;

    public SingletonExample(){
        counter = 0;
    }

    public SingletonExample(SingletonExample example){
        this.counter = example.counter;
    }

    public void changeCounter(double difference){
        counter += (int)difference;
    }

    public int getCounter(){
        return counter;
    }
}
