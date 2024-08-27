package com.softelse.solutis.car.model;

import com.softelse.solutis.car.model.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
//@Table(name = "funcionarios")
public class Funcionario extends Pessoa{

    private String matricula;

    public Funcionario(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario(Integer id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String matricula) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                "} " + super.toString();
    }
}
