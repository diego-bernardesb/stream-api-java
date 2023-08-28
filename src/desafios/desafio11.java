package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);



        int numAoQadrado = numeros.stream()
                .map(n -> n * n)
                .reduce(Integer::sum)
                .orElseThrow(() -> new RuntimeException("Lista está vazia!"));

        System.out.println("A soma da lista elevada ao quadrado é : " + numAoQadrado);
    }
}
