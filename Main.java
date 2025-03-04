 //Jogo de tentar adivinhar o número secreto em até cinco tentativas. O jogador deverá chutar números entre 0 e 100 e, 
//conforme a proximidade com o número, vai indicar se é maior ou menor ou se acertou qual é.

import java.util.Random;
import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        
        int tentativa = 5; //Contador de tentativas máximo
        int numeroSecreto = new Random().nextInt(100); //Randomização do número secreto.
    
        while (tentativa > 0) { //enquanto a tentativa for maior que 5, o loop do jogo irá acontecer
            System.out.println("Tente adivinhar um numero entre 0 e 100"); //Comando inicial do jogo.
            int numero = leitura.nextInt(); //leitura do "chute" onde o jogador inclui o número que deseja chutar.
    
            if (numero == numeroSecreto) {
                System.out.println("Parabéns! Você acertou na mosca!"); //Se o jogador acertar o número, independente da tentativa, vai aparecer essa mensagem.
                break; //Encerra a aplicação no caso de acerto.
            } else if (numero < numeroSecreto) {
                tentativa--; //vai diminuir o contador de tentativa se a condição do if for verdadeira, ou seja, errar o chute.
                System.out.println("O numero secreto é maior que seu chute, tente novamente. " + tentativa + " tentativas Restantes"); //Se o número for menor que o sorteado, vai transmitir a mensagem informando que o número é maior e que restam x tentativas ainda.
            } else {
                tentativa--;
                System.out.println("O numero secreto é menor que seu chute, tente novamente. " + tentativa + " tentativas Restantes");
            }
        }
        
        System.out.println("O número secreto é: " + numeroSecreto);
    }
}
    