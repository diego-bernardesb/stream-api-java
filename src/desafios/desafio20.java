package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio20 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 15);


        int sumNum = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 ==0)
                .reduce(Integer::sum)
                .orElseThrow(()-> new RuntimeException("A lista não possui valores divisiveis por 3 ou 5"));

        System.out.printf("A soma dos numeros divisiveis por 3 e 5 é : " + sumNum);
    }
}
