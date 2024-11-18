package Singleton;

public class SingletonTest {
    public static boolean test(){
        /*
        Переписать в соответствии с паттерном (можно использовать Lazy реализацию)
        Тесты можно добавлять новые, или оставить текущий переписав в соответствии с паттерном
         */
        SingletonExample example1 = new SingletonExample();
        example1.changeCounter(-1);
        example1.changeCounter(9);
        SingletonExample example2 = new SingletonExample(example1);
        example2.changeCounter(-2);
        return example1.getCounter() == 6 && example2.getCounter() == 6;
    }
}
