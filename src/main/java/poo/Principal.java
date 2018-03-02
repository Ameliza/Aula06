package poo;

import java.util.Scanner;

public class Principal {

    /**
     * Esse método faz a soma de dois inteiros
     * @return  soma dos dois inteiros
     */

    public static void main(String[] args) {
        System.out.println("Olá mundo");
        Scanner teclado = new Scanner(System.in);
        int a, b;

        Aritmetica p = new Aritmetica();

        System.out.printf("Entre com um número: ");
        a = teclado.nextInt();
        System.out.printf("Entre com um número: ");
        b = teclado.nextInt();

        //Principal p = new Principal(); //há dois métodos em "p" -> soma e main

        System.out.println("O resultado da soma é " + p.soma(a,b));
        System.out.println("O resultado da subtração é " + p.sub(a,b));
        System.out.println("O resultado da multiplicação é " + p.mult(a,b));
        System.out.println("O resultado da divisão é " + p.div(a,b));
    }

}
