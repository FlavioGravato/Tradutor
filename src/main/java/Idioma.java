import java.lang.reflect.Array;
import java.util.ArrayList;

public class Idioma {
    private String sigla;
    private String descricao;
    private ArrayList<String> palavras;

    public Idioma(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return String.format("Sigla: %d --- Descricao: %d%n",this.sigla,this.descricao);
    }


}
