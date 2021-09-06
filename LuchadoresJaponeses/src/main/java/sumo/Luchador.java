package sumo;

public class Luchador {

  private final int peso;
  private final int altura;

  public Luchador(int peso, int altura) {
    this.peso = peso;
    this.altura = altura;
  }

  public boolean dominaA(Luchador otro) {

    boolean superaEnPeso = this.peso > otro.peso;
    boolean superaEnAltura = this.altura > otro.altura;

    return superaEnPeso && superaEnAltura ||
           superaEnPeso && this.altura == otro.altura ||
           superaEnAltura && this.peso == otro.peso;

  }
}
