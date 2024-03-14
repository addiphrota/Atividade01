public abstract class Pergunta {
    protected String enunciado;
    protected String respostaCorreta;

    public abstract boolean estaCorreta(String resposta);

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespostaCorreta() {
        return this.respostaCorreta;
    }
}
