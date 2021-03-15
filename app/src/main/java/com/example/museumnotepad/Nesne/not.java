package com.example.museumnotepad.Nesne;

public class not {
    int id;
    String not_basligi;
    String not_aciklamasi;

    public not(){

    }



    public not(int id, String not_basligi, String not_aciklamasi){
        this.id = id;
        this.not_basligi = not_basligi;
        this.not_aciklamasi = not_aciklamasi;
    }

    public String toString(){
        return ""+id+"-"+not_basligi+""+not_aciklamasi;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNot_basligi() {
        return not_basligi;
    }

    public void setNot_basligi(String not_basligi) {
        this.not_basligi = not_basligi;
    }

    public String getNot_aciklamasi() {
        return not_aciklamasi;
    }

    public void setNot_aciklamasi(String not_aciklamasi) {
        this.not_aciklamasi = not_aciklamasi;
    }
}