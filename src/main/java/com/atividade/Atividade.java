package com.atividade;

public class Atividade {


    private double metCaminhada = 5;
    private double metPularCorda = 8;
    private double metCorrida = 9;
    private double metCorridaModerada = 11.5;
    private double metCiclismoModerado = 6;
    private double metPularCordaModerado = 10;
    private double metCorridaIntensa = 13.5;
    private double metCiclismoIntenso = 12;
    private double metPularCordaIntenso = 12;


    public double getMetCorridaModerada() {
        return metCorridaModerada;
    }

    public void setMetCorridaModerada(double metCorridaModerada) {
        this.metCorridaModerada = metCorridaModerada;
    }

    public double getMetCiclismoModerado() {
        return metCiclismoModerado;
    }

    public void setMetCiclismoModerado(double metCiclismoModerado) {
        this.metCiclismoModerado = metCiclismoModerado;
    }

    public double getMetPularCordaModerado() {
        return metPularCordaModerado;
    }

    public void setMetPularCordaModerado(double metPularCordaModerado) {
        this.metPularCordaModerado = metPularCordaModerado;
    }

    public double getMetCorridaIntensa() {
        return metCorridaIntensa;
    }

    public void setMetCorridaIntensa(double metCorridaIntensa) {
        this.metCorridaIntensa = metCorridaIntensa;
    }

    public double getMetCiclismoIntenso() {
        return metCiclismoIntenso;
    }

    public void setMetCiclismoIntenso(double metCiclismoIntenso) {
        this.metCiclismoIntenso = metCiclismoIntenso;
    }

    public double getMetPularCordaIntenso() {
        return metPularCordaIntenso;
    }

    public void setMetPularCordaIntenso(double metPularCordaIntenso) {
        this.metPularCordaIntenso = metPularCordaIntenso;
    }


    public double getMetCaminhada() {
        return metCaminhada;
    }

    public void setMetCaminhada(double metCaminhada) {
        this.metCaminhada = metCaminhada;
    }

    public double getMetPularCorda() {
        return metPularCorda;
    }

    public void setMetPularCorda(double metPularCorda) {
        this.metPularCorda = metPularCorda;
    }

    public double getMetCorrida() {
        return metCorrida;
    }

    public void setMetCorrida(double metCorrida) {
        this.metCorrida = metCorrida;
    }


     public double AtividadeInicial() {
        return getMetCaminhada() + getMetCorrida() + getMetPularCorda();

     }

    public double AtividadeModerada() {
        return getMetCorridaModerada() + getMetCiclismoModerado() + getMetPularCordaModerado();

    }

    public double AtividadePesada() {
        return getMetCorridaIntensa() + getMetCiclismoIntenso() + getMetPularCordaIntenso();

    }

}

