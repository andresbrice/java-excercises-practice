public class AddArguments {
  public static void main(String[] args) {

    int suma = 0;
    for (int i = 0; i < args.length; i++) {
      try {
        suma += Integer.parseInt(args[i]);
      } catch (NumberFormatException e) {
        System.err.println("One of the command-line arguments '" + args[i] + "' is not an Integer");
      }
    }
    System.out.println("Suma: " + suma);
  }
}
