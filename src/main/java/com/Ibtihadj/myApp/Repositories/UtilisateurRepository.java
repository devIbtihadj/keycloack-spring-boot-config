package com.Ibtihadj.myApp.Repositories;

import com.Ibtihadj.myApp.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
