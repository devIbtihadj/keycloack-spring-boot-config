package com.Ibtihadj.myApp.Services.Implementations;

import com.Ibtihadj.myApp.Entities.Utilisateur;
import com.Ibtihadj.myApp.Repositories.UtilisateurRepository;
import com.Ibtihadj.myApp.Services.UtilisateurService;
import javax.transaction.Transactional;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UtilisateurServiceImpementation implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    private final KeycloakRestTemplate restTemplate;
    @Autowired
    public UtilisateurServiceImpementation(UtilisateurRepository utilisateurRepository, KeycloakRestTemplate restTemplate) {
        this.utilisateurRepository = utilisateurRepository;
        this.restTemplate = restTemplate;
    }


    @Override
    public Utilisateur create(Utilisateur u) {
        //TODO SAVE USER WITH KEYCLOACK_REST_TEMPLATE
        return utilisateurRepository.save(u);
    }

    @Override
    public List<Utilisateur> all() {
        return utilisateurRepository.findAll();
    }
}
