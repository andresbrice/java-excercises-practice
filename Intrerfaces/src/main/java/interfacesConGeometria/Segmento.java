package interfacesConGeometria;

import java.util.Objects;

public class Segmento implements Comparable<Segmento>, Desplazable, EsParalelo {

  private Punto puntoA;
  private Punto puntoB;

  public Segmento(Punto puntoA, Punto puntoB) {
    this.puntoA = puntoA;
    this.puntoB = puntoB;
  }

  public Double getLargo() {
    return this.puntoA.distancia(puntoB);
  }

  @Override
  public void desplazar(double deltaX, double deltaY) {
    this.puntoA.desplazar(deltaX, deltaY);
    this.puntoB.desplazar(deltaX, deltaY);
  }

  @Override
  public boolean esParaleloX() {
    return this.puntoA.getY() == this.puntoB.getY();
  }

  @Override
  public boolean esParaleloY() {
    return this.puntoA.getX() == this.puntoB.getX();
  }

  @Override
  public boolean esParalelo(EsParalelo otroSegmento) {
    if (otroSegmento instanceof Segmento) {
      Segmento otro = (Segmento) otroSegmento;

      double a = this.puntoB.getY() - this.puntoA.getY();
      double b = this.puntoB.getX() - this.puntoA.getX();
      double c = otro.puntoB.getY() - otro.puntoA.getY();
      double d = otro.puntoB.getX() - otro.puntoA.getX();

      return (a / b == c / d);
    }
    return false;
  }

  @Override
  public int compareTo(Segmento o) {
    return this.getLargo().compareTo(o.getLargo());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Segmento)) return false;
    Segmento segmento = (Segmento) o;
    return Objects.equals(puntoA, segmento.puntoA) &&
          Objects.equals(puntoB, segmento.puntoB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(puntoA, puntoB);
  }
}
