/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela
o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. 
A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:
*/

package atividade_pratica3;
import java.util.Scanner;

public class Lista2Ex3 {
  public static void main (String [] args){
    Scanner leia = new Scanner(System.in);
    
//Variaveis    
 int idade,idademenor = 0,idademaior = 0,cont=0;
 
 //While
 
 while(true){
 
 for(cont=0;cont<=10;cont++){
 System.out.println("Digite a sua idade(valores negativos, resultam no fim da operacao):");
 idade = leia.nextInt();
  
 if(idade < 0){
 System.out.println("Operacao invalida");
 break;
 }
 
   if(idade >= 21 ){
 idademenor++;
 }else {
 idademaior++;
  }
}
 
 //Resultado
 System.out.println("Total de pessoas menores de 21 anos: " + idademenor);
 System.out.println("Total de pessoas maiores de 50 anos: " + idademaior);
 break;

        
 
 
 }
 
}
}

