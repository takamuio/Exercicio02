/*
Crie um programa que leia um número inteiro e retorne se o mesmo
é positivo ou negativo.
 */
import java.util.Scanner;

public class Exercicio01 
{
    int x;
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Digite um valor: ");
        int x = ler.nextInt();
        
        if (x >= 0)
        {
            System.out.println("Este numero é positivo");
        }
        else
        {
            System.out.println("Este numero é negativo");
        }
    }
    
}
