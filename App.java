import java.util.Collection;

public class App {
    public static void main(String[] args) {
        //FactoryColecoes fc = new FactoryColecoes();

        Collection<Integer> c = FactoryColecoes.getInstance().criaColecao(10, false, false);
    }
}
