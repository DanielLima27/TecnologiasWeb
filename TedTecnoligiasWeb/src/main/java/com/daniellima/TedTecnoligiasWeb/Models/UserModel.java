package com.daniellima.TedTecnoligiasWeb.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_usuarios")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String name;
    private String email;
    private LocalDate dataNasc;
    private String password;

    public UserModel(){

    }

    public UserModel(Long id, String name, String email, LocalDate dataNasc, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dataNasc = dataNasc;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
