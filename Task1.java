package org.example.lesson24.homework;

//1. Создайте флюкс из нескольких имен - например, "Max", "Masha", "Alexander", "Olga"
//Преобразуйте строки в их длину и соберите длины в список целых.
//Распечатайте список, подписавшись на этот флюкс

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Flux<String> flux = Flux.just("Max", "Masha", "Alexander", "Olga");
        flux.map(String::length)
                .collectList()
                .subscribe(l -> System.out.println("Length: " + l));
    }
}
