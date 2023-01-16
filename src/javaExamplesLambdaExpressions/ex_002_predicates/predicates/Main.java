package javaExamplesLambdaExpressions.ex_002_predicates.predicates;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 30));
        persons.add(new Person("Андрей", 14));
        persons.add(new Person("Александр", 25));
        persons.add(new Person("Анна", 8));
        persons.add(new Person("Евгений", 23));

        // Для каждого элемента коллекции persons вызвать println
        // Также указываем фильтрацию, выводить людей, у кого возраст больше 18
        // А также при помощи interace Comparator, сортировать коллекцию по имени
        persons.stream().
                filter(p -> p.getAge() >= 18).
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                map(person -> person.getName()).
                forEach(
//                        (String name) -> System.out.println(name)
                      System.out::println
                );

//        for (Person p : persons)
//            System.out.println(p);

//        persons.stream().forEach(
//                (Person p) -> {
//                    System.out.println(p);
//                }
//        );
    }
}
