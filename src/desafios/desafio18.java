package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio18 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);


        List<Integer> numPrimos = numeros.stream()
                .filter(desafio14::ehPrimo)
                .collect(Collectors.toList());

        System.out.printf("Lista de numeros primos: " + numPrimos);
    }
}
