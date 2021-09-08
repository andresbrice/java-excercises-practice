public class HelloWorld2 {
  public static void main(String[] args) {
    int i = 0;
    String[] saludos = {
          "Hola Mundo!",
          "No, en serio!",
          "HOLA MUNDO!",
          "HOLA MUNDO!",
    };

    try {
      while (i < 6) {
        System.out.println(saludos[i]);
        i++;
      }
    } catch (ArrayIndexOutOfBoundsException a) {
      System.out.println("Reseteando el valor de i");
      i = 4;
    } finally {
      System.out.println("Esto siempre se imprime");
    }
  }
}
