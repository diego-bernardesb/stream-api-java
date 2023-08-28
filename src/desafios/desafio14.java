package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class desafio14 {

    public static boolean ehPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);



        int primos = numeros.stream()
                .filter(desafio14::ehPrimo)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Lista não possui numeros primos!"));

        System.out.printf("O maior numero primo é : " + primos);
    }
}
