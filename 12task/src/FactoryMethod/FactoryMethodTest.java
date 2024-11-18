package FactoryMethod;

public class FactoryMethodTest {
    public static boolean test(){
        /*
        Переписать в соответствии с паттерном (делать ли 2 вида магазинов, как в статье не обязательно)
        Тесты можно добавлять новые, или оставить текущий переписав в соответствии с паттерном
         */
        TeaShop teaShop = new TeaShop();
        Tea tea = teaShop.orderTea(TeaType.FruitTea);
        return tea.getTeaType().equals("fruit");
    }
}
