package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);


        long multi = numeros.stream()
                .mapToLong(n -> (long) n)//converter o int em Long por conta do Overflow do tamanho do inteiro
                .reduce(1L, (armazenador, n) -> armazenador * n);


        System.out.printf("O valor do produto da lista é de : " + multi);


    }
}
