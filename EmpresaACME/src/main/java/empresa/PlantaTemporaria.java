package empresa;

public class PlantaTemporaria extends Empleado {
  private static final double VALOR_HORA = 2000;

  public PlantaTemporaria(int horasTrabajadas, int cantidadHijos, boolean casado) {
    super(horasTrabajadas, cantidadHijos, casado);
  }

  @Override
  public double getSalario() {
    return super.getHorasTrabajadas() * PlantaTemporaria.VALOR_HORA + super.getSalarioFamiliar();
    //no se le pone this a VALOR_HORA porque es una variable de la clase y es static.
    // Para usar this debe ser una variable de instancia
  }
}