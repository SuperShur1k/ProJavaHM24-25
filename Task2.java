package org.example.lesson24.homework;

//2. Воспользуйтесь именами из предыдущего примера и создайте флюкс и с помощью flatMap преобразуйте его в
//"max", "MAX", "masha", "MASHA" …
//То есть, для кажого имени нужно выдавать пару элементов в нижнем и в верхем регистре.
//Соберите в Set, распечатайте Set

import reactor.core.publisher.Flux;

import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Flux<String> flux = Flux.just("Max", "Masha", "Alexander", "Olga");
        flux.flatMap(name -> Flux.just(name.toLowerCase(), name.toUpperCase()))
                .collect(Collectors.toSet())
                .subscribe(nameSet -> System.out.println("Set: " + nameSet));
    }
}
