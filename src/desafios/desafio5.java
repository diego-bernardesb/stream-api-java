package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



        System.out.println(numeros.stream()
                .filter(n -> n > 5)//separa os numeros maiores q 5
                .mapToInt(Integer::intValue)//mapeia os numeros maiores que 5 para ser calculada a media
                .average());//calcula a media e retorna um optionalDouble
    }
}
