/* 
Criar um programa é solicitado ao usuário que digite o valor do raio de
uma circunferência. O programa retorna o valor do diâmetro e de
1 quadrante desta circunferência.
 */

import java.util.Scanner;
public class Algoritimo02
{
    
    int raio;

    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Digite o valor do raio: ");
        int raio = ler.nextInt();
        
        System.out.println("O valor do diametro é: "+ raio*2);
        System.out.println("O valor de 1 quadrante da circunferência é: "+ raio/2);
    }
    
}
