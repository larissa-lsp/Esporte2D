import java.time.LocalDate;

public class Pessoa {
    // Atributos
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private double altura;
    private double peso;
    public int idFederacao;

    public int getIdFederacao(){
        return idFederacao;
    }
    public void setIdFederacao(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos
    public String sacar(){
        return "Não sei sacar";
    }
}
