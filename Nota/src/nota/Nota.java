package nota;

public class Nota {

	private int valorNota;
	
	
	public Nota(int valorInicial) {
		this.setValorNota(valorInicial);
	}

	public int obtenerValor() {
		return this.valorNota;
	}

	public boolean aprobado() {
		return this.valorNota >= 4;
	}

	public boolean desaprobado() {
		return this.valorNota < 4;
	}

	public void recuperar(int nuevoValor) {
		if (this.valorNota < nuevoValor) {
			this.valorNota = nuevoValor;
		}
	}
	
	private boolean esValorCorrecto(int valor){
		return valor >= 0 && valor <= 10;
	}
	
	private void setValorNota(int nota) {
		if (!esValorCorrecto(nota)) {
			Error notaInvalida = new Error("Nota inválida ingresada");
			throw notaInvalida;
		}
		
		this.valorNota = nota;
	}
	
	public static void main(String[] args) {
		Nota invalida = new Nota(15);
	}
	
}
