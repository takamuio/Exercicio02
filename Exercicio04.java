/*
 Faça um algoritmo que leia dois valores reais e exiba ao final
 qual dos dois é o maior.
 */

import java.util.Scanner;
public class Exercicio04 {
    int x, y;

    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite um valor: ");
        int x = ler.nextInt();
        
        System.out.println("Digite um segundo valor: ");
        int y = ler.nextInt();
        
        if (x > y)
        {
            System.out.println("O maior numero é: "+ x);
        }
        else if (y > x)
        {
            System.out.println("O maior numero é: "+ y);
        }
            
    }
    
}
