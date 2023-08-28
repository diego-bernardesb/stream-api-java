package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        long listaSemRepetidos = numeros.stream().distinct().count();
        boolean hasRepetidos = listaSemRepetidos != numeros.size();


        if(hasRepetidos){
            System.out.printf("Existe numeros repetidos na lista");
        } else {
            System.out.printf(" " + listaSemRepetidos);
        }
    }
}
