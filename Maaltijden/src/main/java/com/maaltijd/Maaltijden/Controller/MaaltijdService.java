package com.maaltijd.Maaltijden.Controller;


import com.maaltijd.Maaltijden.Domain.Maaltijd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Transactional
public class MaaltijdService {
    @Autowired
    private MaaltijdRepository maaltijdRepository;



    public Maaltijd save(Maaltijd meal){
        return maaltijdRepository.save(meal);
    }

    public Maaltijd findById(Long id){
        return maaltijdRepository.findById(id).get();

    }
    public Iterable<Maaltijd> findAll(){
        Iterable<Maaltijd> result = maaltijdRepository.findAll();
        return result;
    }

    public void delete(Long id){
        maaltijdRepository.deleteById(id);
    }
}	
