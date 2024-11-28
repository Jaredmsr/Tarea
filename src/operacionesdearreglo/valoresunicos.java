package operacionesdearreglo;

import java.util.ArrayList;

public class valoresunicos {
    public int Valoresunicos(Object[] arreglo) {
        ArrayList<Object> arregloList = new ArrayList<>();

        for (Object o : arreglo) {
            if (arregloList.contains(o)) {
                arregloList.add(o);
            }
        }
        return arregloList.size();

    }
}
