/*
 Faça um programa que leia uma variável real "A" digitada pelo usuário
e apresente o resultado dos seguintes cálculos:
- o dobro de "A"
- o triplo do dobro de "A"
- a metade do triplo do dobro de "A"
- o quadrado da variável "A"
- a quinta parte do dobro de "A"
 */

import java.util.Scanner;
public class Algoritimo03 
{
    int x;
    
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("De um valor a variavel A: ");
        int x = ler.nextInt();
        
        System.out.println("O dobro de A: "+ (x*2));
        System.out.println("O triplo do dobro de A: "+ ((x*2)*3));
        System.out.println("A metade do triplo do dobro de A: "+ (((x*2)*3)/2));
        System.out.println("O quadrado da variável A: "+ (x*x));
        System.out.println("A quinta parte do dobro de A: "+ ((x*2)/5));
        
    }
    
}
