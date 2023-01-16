package javaExamplesLambdaExpressions.ex_004_lambdaCalculate.calculateWithoutLambdas;

public class Main {
    public static void main(String[] args) {
        Operationable op = new Operationable() {
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = op.calculate(20, 10);
        System.out.println(z); // 30
    }
}

interface Operationable {
    int calculate(int x, int y);
}
