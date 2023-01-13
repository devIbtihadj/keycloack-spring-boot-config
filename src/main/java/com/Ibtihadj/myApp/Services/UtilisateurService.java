package com.Ibtihadj.myApp.Services;

import com.Ibtihadj.myApp.Entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur create(Utilisateur u);
    List<Utilisateur> all();
}
