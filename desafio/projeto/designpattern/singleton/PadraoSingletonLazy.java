package desafio.projeto.designpattern.singleton;

public class PadraoSingletonLazy {

    private static PadraoSingletonLazy instancia;

    private PadraoSingletonLazy() {
        super();
    }

    public static PadraoSingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new PadraoSingletonLazy;
        }
        return instancia;
    }
}
