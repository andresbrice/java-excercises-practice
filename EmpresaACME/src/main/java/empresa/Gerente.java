package empresa;

public class Gerente extends PlantaPermanente {

  private static final double VALOR_HORA = 4000;
  private static final double VALOR_ANIO_ANTIGUEDAD = 1500;

  public Gerente(int horasTrabajadas, int cantidadHijos, boolean casado, int aniosDeAntiguedad) {
    super(horasTrabajadas, cantidadHijos, casado, aniosDeAntiguedad);
  }

  @Override
  public double getSalario() {
    return super.getSalarioFamiliar() + Gerente.VALOR_HORA * super.getHorasTrabajadas() + Gerente.VALOR_ANIO_ANTIGUEDAD * super.getAniosDeAntiguedad();
  }
}
