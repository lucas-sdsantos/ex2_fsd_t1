import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class FactoryColecoes{


    private FactoryColecoes() {

    }
    
    private static FactoryColecoes factory = null;

    public static FactoryColecoes getInstance() {
        if (factory == null) {
            factory = new FactoryColecoes();
        }
        return factory;
    }

    public Collection<Integer> criaColecao(int tam, boolean ord, boolean rep) {
        if (tam > 0) {
            return new ArrayList<>(tam);
        }
        if (rep) {
            return new LinkedList<>();
        }
        if (ord) {
            return new TreeSet<>();
        }
        return new HashSet<>();
    }
}