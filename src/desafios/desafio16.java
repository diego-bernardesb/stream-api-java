package desafios;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class desafio16 {

    public static long calculaFatorial(int n) {
        if (n < 0) {
            throw new RuntimeException("Número negativo não possui fatorial.");
        }
        return IntStream.rangeClosed(2, n)
                .boxed()
                .reduce(1, (factorial, num) -> factorial * num);
    }

    public static void main(String[] args) {
      int num = -5;
      long resultado = calculaFatorial(num);

        System.out.printf("O fatorial de "+num+" é : "+resultado);
    }
}
