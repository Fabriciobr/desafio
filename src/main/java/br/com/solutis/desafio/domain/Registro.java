package br.com.solutis.desafio.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registro {
    @Id
    @GeneratedValue
    private Long id;
    private String string;
    private String mensagem;
    private String vogal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getVogal() {
        return vogal;
    }

    public void setVogal(String vogal) {
        this.vogal = vogal;
    }
}
