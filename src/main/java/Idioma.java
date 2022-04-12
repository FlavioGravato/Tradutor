public class Idioma {
    private String sigla;
    private String descricao;

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
// commentario
    public String toString(){
        return String.format("Sigla: %d --- Descricao: %d%n",this.sigla,this.descricao);
    }


}
