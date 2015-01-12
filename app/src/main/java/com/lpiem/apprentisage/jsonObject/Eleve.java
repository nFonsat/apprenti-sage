/**
 * Created by iem on 07/01/15.
 */

package com.lpiem.apprentisage.jsonObject;

import java.util.ArrayList;

public class Eleve {
    private int mAvatar;
    private String mNom;
    private String mPrenom;
    private String mUsername;
    private ArrayList<Resultat> mResultats;

    public Eleve(){ }

    public Eleve(int avatar){
        mAvatar = avatar;
    }

    public String getNom() {
        return mNom;
    }

    public void setNom(String nom) {
        mNom = nom;
    }

    public String getPrenom() {
        return mPrenom;
    }

    public void setPrenom(String prenom) {
        mPrenom = prenom;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public ArrayList<Resultat> getResultats() {
        return mResultats;
    }

    public void setResultats(ArrayList<Resultat> resultats) {
        mResultats =  resultats;
    }

    public int getAvatar(){
        return mAvatar;
    }

    public void setAvatar(int avatar){
        mAvatar = avatar;
    }
}