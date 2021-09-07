package interfacesConGeometria;

import java.util.Objects;

import static java.lang.Math.*;

public class Punto implements Desplazable {
  private double x;
  private double y;

  public Punto(double x, double y) {
    this.setX(x);
    this.setY(y);

  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  private void setX(double x) {
    this.x = x;
  }

  private void setY(double y) {
    this.y = y;
  }

  public double distancia(Punto otro){
    return sqrt(pow(this.x - otro.x,2) + pow(this.y - otro.y,2));
  }

  @Override
  public void desplazar(double deltaX, double deltaY) {
    this.setX(this.getX() + deltaX);
    this.setY(this.getY() + deltaY);
  }

  @Override
  public String toString() {
    return "[" + x + ", " + y + ']';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Punto punto = (Punto) o;
    return Double.compare(punto.x, x) == 0 &&
          Double.compare(punto.y, y) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
