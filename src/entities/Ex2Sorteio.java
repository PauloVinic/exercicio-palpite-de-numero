package entities;

public class Ex2Sorteio {
	Integer numSorteado;
	Integer tentativas = 0;

	public Ex2Sorteio(Integer numSorteado) {
		this.numSorteado = numSorteado;
	}
	
	public void testePalpiteString(int palpite) {
		tentativas++;
		if (palpite == numSorteado) {
			System.out.println("Parab�ns, seu palpite � o n�mero sorteado. Voc� acertou na " + tentativas + "� tentativa");
		}
		else if (palpite > numSorteado) {
			System.out.println("O n�mero sorteado � menor do que o seu palpite, tente de novo.");
		}
		else if (palpite < numSorteado) {
			System.out.println("O n�mero sorteado � maior do que o seu palpite, tente de novo.");
		}
	}
	
	public Boolean acertou(int palpite) {
		if (palpite == numSorteado) {
			return true;
		}
		else {
			return false;
		}
	}
}
