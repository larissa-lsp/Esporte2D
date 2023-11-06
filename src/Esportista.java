public class Esportista extends Pessoa {

    private int idFederacao;

    // Construtor

    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }

    // Getters e setter

    public int getIdFederacao() {
        return idFederacao;
    }

    public void setIdFederacao(int idFederacao) {
        this.idFederacao = idFederacao;
    }
    public String sacar(){
        return "Sacando ...";
    }
}
