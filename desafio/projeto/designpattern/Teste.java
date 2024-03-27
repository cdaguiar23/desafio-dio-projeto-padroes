package desafio.projeto.designpattern;

import desafio.projeto.designpattern.facade.Facade;
import desafio.projeto.designpattern.strategy.*;
import desafio.projeto.designpattern.singleton.SingletonEager;
import desafio.projeto.designpattern.singleton.SingletonLazy;
import desafio.projeto.designpattern.singleton.SingletonLazyHolder;
import desafio.projeto.designpattern.strategy.Robo;

public class Teste {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);


        // Testes relacionados ao Design Pattern Strategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Testes relacionados ao Design Pattern Facdade:
        Facade facade = new Facade();
        facade.migrarCliente("Jair", "88354030");
    }
}
