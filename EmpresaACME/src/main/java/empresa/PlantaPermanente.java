package empresa;

public class PlantaPermanente extends Empleado {
  private final int aniosDeAntiguedad;
  private static final double VALOR_HORA = 3000;
  private static final double VALOR_ANIO_ANTIGUEDAD = 1000;

  public PlantaPermanente(int horasTrabajadas, int cantidadHijos, boolean casado, int aniosDeAntiguedad) {
    super(horasTrabajadas, cantidadHijos, casado);
    this.aniosDeAntiguedad = aniosDeAntiguedad;
  }

  @Override
  public double getSalario() {
    return super.getHorasTrabajadas() * PlantaPermanente.VALOR_HORA + this.aniosDeAntiguedad * PlantaPermanente.VALOR_ANIO_ANTIGUEDAD + super.getSalarioFamiliar();
  }

  protected int getAniosDeAntiguedad() {
    return aniosDeAntiguedad;
  }
}