/*
 Faça um algoritmo que leia um valor inteiro e retorne se este valor é PAR ou ÍMPAR.
 */

import java.util.Scanner;
public class Exercicio03 {
    int x;
    

    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Digite um valor: ");
        int x = ler.nextInt();
        
        int formula = x / x;
        
        if (formula == 0)
        {
            System.out.println("Este numero é par");       
        }
        else
        {
        System.out.println("Este valor é impar");        
        }
    }
}
    
    

