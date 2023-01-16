package javaExamplesLambdaExpressions.ex_001_lambdaExpression.withoutLambdaExpression;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Подписка на событие(Подписываемся 1 раз и не зависимо сколько раз
        // вызовется включение лампы, столько раз будет вызыватся метод лампы)
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        // Захват переменных, можем передать в анонимный класс/лямбда выражение
        String message = "Пожар";
        // Если изменяем значение переменной - ошибка компиляции
//        message = "Fire";


        // Громоздкая запись для 1 метода
//        class Fire implements ElectricityConsumer {
//            public void electricityOn(){
//                out.println("Пожар");
//            }
//        }

        // Анонимный класс
        sw.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn(Object sender) {
                        out.println(message);
                    }
                }
        );
        sw.switchOn();
    }
}
