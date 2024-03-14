public class PerguntaVF extends Pergunta {
    private boolean respostaCorreta;

    @Override
    public boolean estaCorreta(String resposta) {
        // Converte a resposta do usuário para booleano
        boolean respostaUsuario = Boolean.parseBoolean(resposta);
        // Compara com a resposta correta
        return respostaUsuario == this.respostaCorreta;
    }

    public void setRespostaCorreta(boolean respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public String getRespostaCorreta() {
        return Boolean.toString(this.respostaCorreta);
    }
}
