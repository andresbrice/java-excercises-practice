package semana;

public enum Dia {

  DOMINGO(0, "Dom"),
  LUNES(1, "Lun"),
  MARTES(2, "Mar"),
  MIERCOLES(3, "Mier"),
  JUEVES(4, "Jue"),
  VIERNES(5, "Vie"),
  SABADO(6, "Sab");


  private final int indice;
  private String abbr;

  Dia(int indice, String abbr) {
    this.abbr = abbr;
    this.indice = indice;
  }

  public String getAbbr() {
    return this.abbr;
  }

  public boolean anteriorA(Dia otro) {
    return Integer.compare(indice, otro.indice) < 0;
  }

  public Dia manana(){
    return switch (indice) {
      case 0 -> LUNES;
      case 1 -> MARTES;
      case 2 -> MIERCOLES;
      case 3 -> JUEVES;
      case 4 -> VIERNES;
      case 5 -> SABADO;
      case 6 -> DOMINGO;
      default -> throw new IllegalArgumentException("Valor inesperado: " + indice);
    };
  }
}
