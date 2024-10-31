/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:
*/

package atividade_pratica3;
import java.util.Scanner;

public class Lista1Ex2 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     
//variaveis    
int num;
int totalimpares = 0;
int totalpares = 0;
     
//Entrada de dados
for(int cont= 1; cont <= 10; cont++){
System.out.println("Digite o " +cont+ " numero:");
num = scanner.nextInt();


//par ou impar

if(num %2 == 0){
totalpares++;
}else{
totalimpares++;
}
}

//resultado

System.out.println("Total de numeros pares:" +totalpares);
System.out.println("Total de numeros impares:" +totalimpares);

scanner.close();
}
}
