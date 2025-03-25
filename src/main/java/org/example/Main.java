package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1.
        Multiplicacao multiplicacao = (a, b) -> a * b;
        System.out.println(multiplicacao.multiplicacao(5, 3));

        // 2.
        Primo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificarPrimo(11));
        System.out.println(primo.verificarPrimo(137));

        // 3.
        Maiusculo maiusculo = str -> str.toUpperCase();
        System.out.println(maiusculo.converterMaiusculo("maiusculo"));

        // 4.
        Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar"));
        System.out.println(palindromo.verificarPalindromo("palindromo"));

        // 5.
        List<Integer> listaNumeros = Arrays.asList(0, 1, 2, 3, 4);
        listaNumeros.replaceAll(n -> n * 3);
        System.out.println(listaNumeros);

        // 6.
        List<String> listaStrings = Arrays.asList("qwerty","asdfgh","zxcvbn");
        listaStrings.sort((a,b) -> a.compareTo(b));
        System.out.println(listaStrings);

        // 7.
        Divisao divisao = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisão por zero");
            return a / b;
        };

        try {
            System.out.println(divisao.dividir(1000, 25));
            System.out.println(divisao.dividir(1000, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }
}