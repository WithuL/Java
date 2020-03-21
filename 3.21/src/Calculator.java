class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        int tmp = num1 + num2;
        return tmp;
    }

    public int sub() {
        int tmp = num1 - num2;
        return tmp;
    }

    public int multi() {
        int tmp = num1 * num2;
        return tmp;
    }

    public double division() {
        double tmp = (num1 / num2);
        return tmp;
    }
}
