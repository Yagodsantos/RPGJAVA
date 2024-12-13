/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

/**
 *
 * @author YAGODOSSANTOSESOUZA
 */
public class Mago {
    private String nome;
    private int forca;
    private int vida;
    private int mana;
    private int agilidade;

    public Mago(String nome) {
        this.nome = nome;
        rolarAtributos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void rolarAtributos() {
        this.forca = Dados.rolar();
        this.vida = Dados.rolar();
        this.mana = Dados.rolarDado();
        this.agilidade = Dados.rolarDado();
    }

    @Override
    public void atacar() {
        System.out.println("O Mago ataca com força de " + forca);
    }

    @Override
    public void usarMagia() {
        System.out.println("O Mago usa magia com " + mana + " de mana.");
    }

    @Override
    public void usarItem() {
        System.out.println("O Mago usa um item.");
    }

    @Override
    public void fugir() {
        System.out.println("O Mago tenta fugir.");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Força: " + forca);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Agilidade: " + agilidade);
    }
}


