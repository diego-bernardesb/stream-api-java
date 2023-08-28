package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        int soma = numeros.stream()
                .mapToInt(Integer::intValue) //mapeia os elementos da lista para inteiros
                .sum(); //soma todos os inteiros

        System.out.printf("A soma dos numeros é de: " + soma);
    }
}
