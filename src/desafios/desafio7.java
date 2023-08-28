package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);


        Integer segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);


        System.out.printf("O segundo maior numero é: "+segundoMaior);

    }
}
