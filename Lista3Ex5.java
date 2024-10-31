/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo
*/
package atividade_pratica3;
import java.util.Scanner;

public class Lista3Ex5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    
//Variaveis        
        
        int numero,positivo=0;
        float soma = 0;
        
//Entrada de dados
 
 do { 
 System.out.println("Digite um numero:");
 numero = leia.nextInt();
 
 if(numero>0){
 soma+=numero;}else{}
 
 
  }while(numero != 0);
  
  System.out.println("A soma dos numeros positivos e: " +soma);
  
  }
  }