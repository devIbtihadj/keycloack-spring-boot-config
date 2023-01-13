package com.Ibtihadj.myApp.Controllers;

import com.Ibtihadj.myApp.Entities.Utilisateur;
import com.Ibtihadj.myApp.Services.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/user")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }


    @PostMapping("save")
    @PreAuthorize("hasAuthority('ADMIN_ROLE')")
    public ResponseEntity<Utilisateur> create(@RequestBody Utilisateur utilisateur){
        return new ResponseEntity<Utilisateur>(utilisateurService.create(utilisateur), HttpStatus.valueOf(202));
    }

    @GetMapping("all")
    @PreAuthorize("hasAuthority('ADMIN_ROLE')")
    public ResponseEntity<List<Utilisateur>> all(){
        return new ResponseEntity<List<Utilisateur>>(utilisateurService.all(),HttpStatus.valueOf(200));
    }

}
