public class HelloWorld {
  public static void primero(String[] saludos) {
    segundo(saludos);
  }

  private static void segundo(String[] saludos) {
    int i = 0;
    while (i < 4) {
      try {
        System.out.println(saludos[i]);
      }catch (ArrayIndexOutOfBoundsException a){
        System.err.println("Fuera de los limites del arreglo");
      }
      i++;
    }
  }

  public static void main(String[] args) {
    String [] saludos = {
          "Hola Mundo!",
          "No, en serio!",
          "HOLA MUNDO!",

    };
    primero(saludos);
  }
}
