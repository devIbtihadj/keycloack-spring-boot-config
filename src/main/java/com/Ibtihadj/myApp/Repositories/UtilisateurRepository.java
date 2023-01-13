package com.Ibtihadj.Test.Repositories;

import com.Ibtihadj.Test.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
