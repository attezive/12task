package Builder;

public class BuilderTest {
    public static boolean test(){
        /*
        Переписать в соответствии с паттерном (Использовать вложенный (внутри тела) класс ItemBuilder в Item)
        Тесты можно добавлять новые, или оставить текущий переписав в соответствии с паттерном
         */
        Item item = new Item();

        item.setFirstParam(1);
        item.setSecondParam(2);
        item.setThirdParam(4);
        item.sumAndWriteParams();

        return item.getThirdParam()==3;
    }
}
