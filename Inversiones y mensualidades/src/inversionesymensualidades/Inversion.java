package inversionesymensualidades;

public class Inversion {

    private final double monto;
    private final double interes;
    private final int cantidadanios;

    public Inversion(double monto, double interes, int cantidadanios) {
        this.monto = monto;
        this.interes = interes;
        this.cantidadanios = cantidadanios;
    }

    public double getMonto() {
        return monto;
    }

    public double getInteres() {
        return interes;
    }

    public int getCantidadanios() {
        return cantidadanios;
    }

    public double[] calcularInversion(){
        double[] salida = new double[this.getCantidadanios()];

        for (int i = 1; i < this.getCantidadanios(); i++) {
            if (i == 1){
                salida[i] = (this.getMonto()*this.getInteres()) + this.getMonto();
            }else {
                salida[i] = (salida[i] * this.getInteres()) + salida[i];
            }
        }
        return salida;
    }

}
