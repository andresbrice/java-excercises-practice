package interfacesConGeometria;

import java.util.Objects;

public abstract class Figura implements Desplazable,Comparable<Figura>{

  private Punto punto;

  public Figura(Punto punto) {
    this.punto = punto;
  }

  public abstract Double getArea();

  @Override
  public void desplazar(double deltaX, double deltaY){
    this.punto.desplazar(deltaX,deltaY);
  }

  public int compareTo(Figura f){
    return this.getArea().compareTo(f.getArea());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Figura)) return false;
    Figura figura = (Figura) o;
    return Objects.equals(punto, figura.punto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(punto);
  }
}
