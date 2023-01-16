package javaExamplesLambdaExpressions.ex_001_lambdaExpression.lambdaExpression;

import static java.lang.System.out;

public class Main {
    public static void fire(Object sender) {
        out.println("Fire!!!");
    }

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
        // message = "Fire";

        /* Лямбда выражение
            1) Если у нас 1 параметр, то мы можем не указывать тип параметра
            2) Круглые скобки можно опустить
        */
        sw.addElectricityListener(sender -> out.println(message));

//        sw.addElectricityListener(sender ->
//        {
//            out.print("Пожар");
//            out.println("!!!");
//        });

//        sw.addElectricityListener((Object sender) -> out.println("Пожар"));

// ============================================================

//        sw.addElectricityListener(s -> Main.fire(s));

        // :: - в данном случае указывает на то, что используем именно метод fire
        // сокращение с "::" возможно тогда, когда в методе кол-во параметров совпадает с лямбда-выражением
        sw.addElectricityListener(Main::fire);

        sw.switchOn();
    }
}
