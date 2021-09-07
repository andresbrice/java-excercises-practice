package interfacesConGeometria;

import java.util.Objects;

public class Cuadrado extends Figura {
  private double lado;

  public Cuadrado(Punto inferiorIzquierdo, Double lado) throws InvalidCuadradoException{
    super(inferiorIzquierdo);
    setLado(lado);
  }

  public void setLado(double lado) {
    if (lado <= 0) {
      throw new InvalidCuadradoException("Lado negativo o cero");
    }
    this.lado = lado;
  }

  @Override
  public Double getArea() {
    return lado * lado;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Cuadrado)) return false;
    if (!super.equals(o)) return false;
    Cuadrado cuadrado = (Cuadrado) o;
    return Double.compare(cuadrado.lado, lado) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), lado);
  }
}
