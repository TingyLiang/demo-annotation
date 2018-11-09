package pri.robin;

public class Number {

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    @NumCheck(condtion = ">")
    public void setValue(int value) {
        this.value = value;
    }

    private int value ;


}
