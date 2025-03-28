package br.com.restaurante.estacionamento.models;

import java.sql.*;

public class Veiculo {
    private String placa;
    private String modelo;
    private int horasEstacionado;

    public Veiculo(String placa, String modelo, int horasEstacionado) {
        this.placa = placa;
        this.modelo = modelo;
        this.horasEstacionado = horasEstacionado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getHorasEstacionado() {
        return horasEstacionado;
    }
}