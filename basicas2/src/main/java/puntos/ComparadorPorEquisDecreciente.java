package puntos;

import java.util.Comparator;

public class ComparadorPorEquisDecreciente implements Comparator<Punto> {
    @Override
    public int compare(Punto uno, Punto dos) {
        return -1 * new ComparadorPorEquis().compare(uno,dos);
    }
}
