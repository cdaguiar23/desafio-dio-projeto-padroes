package desafio.projeto.designpattern.singleton;

import desafio.projeto.designpattern.strategy.Comportamento;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
