package desafio.projeto.designpattern;

import desafio.projeto.designpattern.singleton.ComportamentoAgressivo;
import desafio.projeto.designpattern.singleton.PadraoSingletonEager;
import desafio.projeto.designpattern.singleton.PadraoSingletonLazy;
import desafio.projeto.designpattern.singleton.PadraoSingletonLazyHolder;
import desafio.projeto.designpattern.strategy.Comportamento;
import desafio.projeto.designpattern.strategy.ComportamentoDefensivo;
import desafio.projeto.designpattern.strategy.ComportamentoNormal;

public class Teste {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton:

        PadraoSingletonLazy lazy = PadraoSingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = PadraoSingletonLazy.getInstancia();
        System.out.println(lazy);

        PadraoSingletonEager eager = PadraoSingletonEager.getInstancia();
        System.out.println(eager);
        eager = PadraoSingletonEager.getInstancia();
        System.out.println(eager);

        PadraoSingletonLazyHolder lazyholder = PadraoSingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = PadraoSingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
    }

    // Testes relacionados ao Design Pattern Strategy:

    Comportamento  defensivo = new ComportamentoDefensivo;
    Comportamento normal = new ComportamentoNormal;
    Comportamento agressivo = new ComportamentoAgressivo;

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();

    // Testes relacionados ao Design Pattern Facdade:
    Facade facade = new Facade();
    facade.migrarCleinte("Jair", "88354030");
}
