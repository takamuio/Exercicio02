/*
 Faça um algoritmo que leia dois valores reais e informe se estes
 valores são iguais ou diferentes.
 */

import java.util.Scanner;
public class Exercicio02 {
    int x, y;

    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Digite um valor: ");
        int x = ler.nextInt();
        
        System.out.println("Digite um segundo valor: ");
        int y = ler.nextInt();
        
        if (x == y)
        {
            System.out.println("Estes valores são iguais");
        }
        else
        {
            System.out.println("Estes valores são diferentes");
        }
        }
    }
    

