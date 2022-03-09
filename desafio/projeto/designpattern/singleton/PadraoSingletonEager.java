package desafio.projeto.designpattern.singleton;

public class PadraoSingletonEager {

    private static PadraoSingletonEager instancia = new SingletonEager;

    private PadraoSingletonEager() {
        super();
    }

    public static PadraoSingletonEager getInstancia() {



        return instancia;
    }
}
