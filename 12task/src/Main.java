import AbstractFactory.AbstractFactoryTest;
import Builder.BuilderTest;
import FactoryMethod.FactoryMethodTest;
import Singleton.SingletonTest;

public class Main {

    public static void main(String[] args) {
        if (SingletonTest.test()){
            System.out.println("Singleton правильный");
        } else {
            System.out.println("Singleton неправильный");
        }
        if (FactoryMethodTest.test()){
            System.out.println("FactoryMethod правильный");
        } else {
            System.out.println("FactoryMethod неправильный");
        }
        if (AbstractFactoryTest.test()){
            System.out.println("AbstractFactory правильный");
        } else {
            System.out.println("AbstractFactory неправильный");
        }
        if (BuilderTest.test()){
            System.out.println("Builder правильный");
        } else {
            System.out.println("Builder неправильный");
        }
    }
}