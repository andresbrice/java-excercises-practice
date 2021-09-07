package interfacesConGeometria;

import java.util.Objects;

public class Circulo extends Figura {
  public double radio;

  public Circulo(Punto punto, double radio) throws InvalidRadioException {
    super(punto);
    this.setRadio(radio);
  }

  public double getRadio() {
    return radio;
  }

  public double getDiametro(){
    return this.radio * 2;
  }

  public double getPerimetro(){
    return Math.PI * this.getDiametro();
  }

  private void setRadio(double radio) {
    if (radio <= 0){
      throw new InvalidRadioException("Radio negativo o cero");
    }
    this.radio = radio;
  }

  @Override
  public Double getArea() {
    return Math.PI * Math.pow(this.radio,2);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Circulo)) return false;
    if (!super.equals(o)) return false;
    Circulo circulo = (Circulo) o;
    return Double.compare(circulo.radio, radio) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), radio);
  }
}
