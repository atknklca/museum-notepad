package com.example.museumnotepad.Nesne;

import java.util.List;

public class muze {
    int id;
    String muzeAdi;
    String muzeAciklamasi;
    String muzeKart;
    String muzeRehberlik;
    String muzeMagaza;
    String muzeOtomat;
    String muzeCafe;
    String muzeSehir;
    String muzeAdres;
    String muzeUcret;

    public muze() {

    }

    public muze(int id, String muzeAdi, String muzeAciklamasi, String muzeKart, String muzeRehberlik, String muzeMagaza, String muzeOtomat, String muzeCafe, String muzeSehir, String muzeAdres, String muzeUcret) {
        this.id = id;
        this.muzeAdi = muzeAdi;
        this.muzeAciklamasi = muzeAciklamasi;
        this.muzeKart = muzeKart;
        this.muzeRehberlik = muzeRehberlik;
        this.muzeMagaza = muzeMagaza;
        this.muzeOtomat = muzeOtomat;
        this.muzeCafe = muzeCafe;
        this.muzeSehir = muzeSehir;
        this.muzeAdres = muzeAdres;
        this.muzeUcret = muzeUcret;
    }

    public String toString(){
        return ""+id+"-"+muzeAdi+"-"+muzeAciklamasi+"-"+muzeKart+"-"+muzeRehberlik+"-"+muzeMagaza+"-"+muzeOtomat+"-"+muzeCafe+"-"+muzeSehir+"-"+muzeAdres+"-"+muzeUcret;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMuzeAdi() {
        return muzeAdi;
    }

    public void setMuzeAdi(String muzeAdi) {
        this.muzeAdi = muzeAdi;
    }

    public String getMuzeAciklamasi() {
        return muzeAciklamasi;
    }

    public void setMuzeAciklamasi(String muzeAciklamasi) {
        this.muzeAciklamasi = muzeAciklamasi;
    }

    public String getMuzeKart() {
        return muzeKart;
    }

    public void setMuzeKart(String muzeKart) {
        this.muzeKart = muzeKart;
    }

    public String getMuzeRehberlik() {
        return muzeRehberlik;
    }

    public void setMuzeRehberlik(String muzeRehberlik) {
        this.muzeRehberlik = muzeRehberlik;
    }

    public String getMuzeMagaza() {
        return muzeMagaza;
    }

    public void setMuzeMagaza(String muzeMagaza) {
        this.muzeMagaza = muzeMagaza;
    }

    public String getMuzeOtomat() {
        return muzeOtomat;
    }

    public void setMuzeOtomat(String muzeOtomat) {
        this.muzeOtomat = muzeOtomat;
    }

    public String getMuzeCafe() {
        return muzeCafe;
    }

    public void setMuzeCafe(String muzeCafe) {
        this.muzeCafe = muzeCafe;
    }

    public String getMuzeSehir() {
        return muzeSehir;
    }

    public void setMuzeSehir(String muzeSehir) {
        this.muzeSehir = muzeSehir;
    }

    public String getMuzeAdres() {
        return muzeAdres;
    }

    public void setMuzeAdres(String muzeAdres) {
        this.muzeAdres = muzeAdres;
    }

    public String getMuzeUcret() {
        return muzeUcret;
    }

    public void setMuzeUcret(String muzeUcret) {
        this.muzeUcret = muzeUcret;
    }




}
