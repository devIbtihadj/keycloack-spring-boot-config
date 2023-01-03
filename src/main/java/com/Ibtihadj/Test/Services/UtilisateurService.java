package com.Ibtihadj.Test.Services;

import com.Ibtihadj.Test.Entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur create(Utilisateur u);
    List<Utilisateur> all();
}
