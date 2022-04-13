package Model;

public class Palavra {
    private String palavra;
    private int identificador;

    public Palavra(String palavra, int identificador) {
        this.palavra = palavra;
        this.identificador = identificador;
    }

    public String getPalavra() {
        return palavra;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String toString(){
        return String.format("Model.Palavra: %s --- Identificador: %d%n",this.palavra,this.identificador);
    }
}
