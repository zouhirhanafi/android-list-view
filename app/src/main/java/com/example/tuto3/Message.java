package com.example.tuto3;

import java.io.Serializable;
import java.util.Date;
// int, float, double, boolean : types primitifs
// Integer, Float, Double, Boolean 
public class Message implements Serializable {
    private int image;
    private String nom;
    private String text;
    private Date date;
    public Message(int image, String nm, String text, Date d) {
        this.image = image;
        nom = nm;
        this.text = text;
        this.date = d;
    }
    public int getImage() { return image; }
    public void setImage(int img) { image = img; }
    public String getNom() { return this.nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    //*
    public String toString() {
        return this.nom + " - " + text + "\n" + this.date;
    }
    // */
}