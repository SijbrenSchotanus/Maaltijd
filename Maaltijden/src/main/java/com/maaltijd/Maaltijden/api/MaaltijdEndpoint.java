package com.maaltijd.Maaltijden.api;

import com.maaltijd.Maaltijden.Domain.Maaltijd;
import com.maaltijd.Maaltijden.Controller.MaaltijdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@RestController
public class MaaltijdEndpoint {
    @Autowired
    MaaltijdService maaltijdService;

    @GetMapping("/alleMaaltijden")
    public Iterable<Maaltijd> geefMaaltijd(){
        return maaltijdService.findAll();
    }

    @PostMapping("/alleMaaltijden")
    public Maaltijd nieuweMaaltijd(@RequestBody Maaltijd maal){
        Maaltijd toegevoegdeMaaltijd = maaltijdService.save(maal);
        System.out.println("Maaltijd toegevoegd");
        return toegevoegdeMaaltijd;
    }

    @DeleteMapping("/maaltijd/{id}/delete")
    public void deleteMaaltijd(@PathVariable("id") Long id){
        maaltijdService.delete(id);
        System.out.println("Maaltijd verwijderd");
    }

    @PatchMapping("/maaltijd/{id}")
    public Maaltijd updateMaaltijd(@RequestBody Maaltijd maal, @PathVariable Long id){
        maal.setId(id);
        Maaltijd updateMaaltijd = maaltijdService.save(maal);
        System.out.println("Maaltijd aangepast");
        return updateMaaltijd;
    }



}
