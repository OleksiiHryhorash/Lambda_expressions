package javaExamplesLambdaExpressions.ex_001_lambdaExpression.lambdaExpression;

public class Lamp implements ElectricityConsumer {
    public void lightOn() {
        System.out.println("Лампа зажглась");
    }

    public void electricityOn(Object sender) {
        lightOn();
    }
}
