package coronaCircular;

public class CoronaCircular {
    private double radioInterno;
    private double radioExterno;

    public CoronaCircular(double radioInterno, double radioExterno) {
        if (radioInterno >= radioExterno){
            throw new RuntimeException("El radio interior debe ser menor al radio exterior");
        }
        this.setRadioInterno(radioInterno);
        this.setRadioExterno(radioExterno);
    }

    public double getRadioInterno() {
        return radioInterno;
    }

    public double getRadioExterno() {
        return radioExterno;
    }

    public double getPermitero(){
        return (this.getRadioInterno() + this.getRadioExterno())*2*Math.PI;
    }

    public double getSuperficie(){
        return Math.PI * (Math.pow(this.getRadioExterno(),2) - Math.pow(this.getRadioInterno(),2));
    }

    public void setRadioInterno(double radioInterno) {
        if (radioInterno <= 0) {
            throw new RuntimeException("No se aceptan radios negativos");
        }
        this.radioInterno = radioInterno;
    }

    public void setRadioExterno(double radioExterno) {
        if (radioExterno <= 0) {
            throw new RuntimeException("No se aceptan radios negativos");
        }
            this.radioExterno = radioExterno;
    }
}
