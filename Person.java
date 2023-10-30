import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Tabela(nome = "Tabela Pessoa")

public class Person {
    String nome;
    String sobrenome;
    int idade;
    int cpf;

    public Person(String nome, String sobrenome, int idade, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenoma) {
        this.modelo = modelo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}