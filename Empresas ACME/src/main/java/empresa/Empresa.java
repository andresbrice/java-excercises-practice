package empresa;

public class Empresa {
  private Empleado empleados[];
  private int cantidadEmpleados;
  private int posicion;

  public Empresa(int cantidadEmpleados) {
    this.empleados = new Empleado[cantidadEmpleados];
    this.cantidadEmpleados = cantidadEmpleados;
  }

  public void agregarEmpleado(Empleado e){
    if (posicion < this.cantidadEmpleados){
      this.empleados[posicion] = e;
      posicion++;
    }else{
      throw new RuntimeException("No hay mas lugar");
    }
  }

  public double montoTotal(){
    double totalSueldos = 0;

    for (int i = 0; i < posicion ; i++) {
      totalSueldos += empleados[i].getSalario();
    }

    return totalSueldos;
  }
}
