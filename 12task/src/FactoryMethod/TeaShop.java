package FactoryMethod;

public class TeaShop {
    public Tea orderTea(TeaType type){
        Tea tea = null;

        switch (type){
            case GreenTea:
                tea = new GreenTea();
                break;
            case BlackTea:
                tea = new BlackTea();
                break;
            case FruitTea:
                tea = new FruitTea();
                break;
        }

        tea.grindTea();
        tea.makeTea();
        tea.putIntoCup();

        return tea;
    }
}
