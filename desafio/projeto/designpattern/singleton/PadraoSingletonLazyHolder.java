package desafio.projeto.designpattern.singleton;

public class PadraoSingletonLazyHolder {

    private static class  InstanceHolder {
        public static PadraoSingletonLazyHolder instancia = new PadraoSingletonLazyHolder();
    }

    private PadraoSingletonLazy() {
        super();
    }

    public static PadraoSingletonHolder getInstancia() {

        return InstanceHolder.instancia;
    }
}
