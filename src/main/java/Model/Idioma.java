package Model;

import java.util.ArrayList;

public class Idioma {
    private String sigla;
    private String descricao;
    private ArrayList<Palavra> palavras;

    public Idioma(String sigla, String descricao,ArrayList<Palavra> palavras) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.palavras = palavras;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Palavra> getPalavras() {
        return palavras;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPalavras(ArrayList<Palavra> palavras) {
        this.palavras = palavras;
    }

    public String toString(){
        return String.format("Sigla: %d --- Descricao: %d%n",this.sigla,this.descricao);
    }

    public void adicionarPalavra(Palavra novaPalavra){
        palavras.add(novaPalavra);
    }


}
