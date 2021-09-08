package puntos;

import java.util.Comparator;

public class ComparadorPorModulo implements Comparator<Punto> {

    @Override
    public int compare(Punto uno, Punto dos) {
        return uno.getModulo().compareTo(dos.getModulo());
    }
}
