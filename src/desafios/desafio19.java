package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        List<Integer> numReptidos = numeros.stream()
                .filter(n -> numeros.indexOf(n) != numeros.lastIndexOf(n))
                .distinct()
                .collect(Collectors.toList());

        System.out.printf(":" + numReptidos);



    }
}
