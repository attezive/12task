package Builder;

public class Item {
    private int firstParam;
    private int secondParam;
    private double thirdParam;

    public int getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(int firstParam) {
        this.firstParam = firstParam;
    }

    public int getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(int secondParam) {
        this.secondParam = secondParam;
    }

    public double getThirdParam() {
        return thirdParam;
    }

    public void setThirdParam(double thirdParam) {
        this.thirdParam = thirdParam;
    }

    public void sumAndWriteParams(){
        thirdParam = firstParam + secondParam;
    }
}
