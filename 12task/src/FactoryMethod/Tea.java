package FactoryMethod;

public abstract class Tea {
    protected String teaType;

    public void grindTea(){
        System.out.println("Grinding...");
    }

    public void makeTea(){
        System.out.println("Making...");
    }

    public void putIntoCup(){
        System.out.println("Putting...");
        System.out.println("Take your " + teaType + " tea");
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }
}
