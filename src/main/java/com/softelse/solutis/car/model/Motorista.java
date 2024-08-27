package com.softelse.solutis.car.model;

import com.softelse.solutis.car.model.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
//@Table(name = "motoristas")
public class Motorista extends Pessoa{

    private String numeroCNH;

    public Motorista(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public Motorista(Integer id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCNH) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.numeroCNH = numeroCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "numeroCNH='" + numeroCNH + '\'' +
                "} " + super.toString();
    }
}
