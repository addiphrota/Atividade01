public class PerguntaME extends Pergunta {
    private String[] alternativas;

    @Override
    public boolean estaCorreta(String resposta) {
        // Implementação
        return false;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }
}