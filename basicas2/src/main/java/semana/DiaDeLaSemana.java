package semana;

public enum DiaDeLaSemana {

  DOMINGO(0, "Dom"),
  LUNES(1, "Lun"),
  MARTES(2, "Mar"),
  MIERCOLES(3, "Mier"),
  JUEVES(4, "Jue"),
  VIERNES(5, "Vie"),
  SABADO(6, "Sab");


  private final int indice;
  private String abbr;

  DiaDeLaSemana(int indice, String abbr) {
    this.abbr = abbr;
    this.indice = indice;
  }

  public String getAbbr() {
    return this.abbr;
  }

  public boolean anteriorA(DiaDeLaSemana otro) {
    return Integer.compare(indice, otro.indice) < 0;
  }

  public DiaDeLaSemana manana(){
    switch (indice) {
      case 0:
        return LUNES;
      case 1:
        return MARTES;
      case 2:
        return MIERCOLES;
      case 3:
        return JUEVES;
      case 4:
        return VIERNES;
      case 5:
        return SABADO;
      case 6:
        return DOMINGO;
      default:
        throw new IllegalArgumentException("Valor inesperado: " + indice);
    }
  }
}
