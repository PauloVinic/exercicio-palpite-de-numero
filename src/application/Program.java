/* 
Exercicio: Fazer uma classe Ex2Sorteio para:
• Sortear um número de 0 a 1000 (dica: usar Math.random())
• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
menor do que o número sorteado.
• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
quantas tentativas ele acertou. */

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Ex2Sorteio;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numSorteado = (int) (Math.random() * (1000 - 0 + 1)) + 0;
		Ex2Sorteio sorteio = new Ex2Sorteio(numSorteado);
		System.out.println(numSorteado);
		Boolean sorteado = false;
		int palpite;

		do {
			try {
				System.out.println("Dê seu palpite para o sorteio (entre 0 e 1000) ");
				palpite = sc.nextInt();
				if (palpite < 0 || palpite > 1000) {
					throw new IllegalArgumentException("O número digitado deve estar entre 0 e 1000.");
				}
				sorteio.testePalpiteString(palpite);
				sorteado = sorteio.acertou(palpite);
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Digite apenas números inteiros.");
				sc.next(); // limpar o buffer do scanner
				palpite = -1;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				palpite = -1; // para evitar loop infinito
			}
		} while (sorteado == false);
		sc.close();
	}
}
