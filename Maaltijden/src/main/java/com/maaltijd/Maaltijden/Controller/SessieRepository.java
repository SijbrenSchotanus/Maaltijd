package com.maaltijd.Maaltijden.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.maaltijd.Maaltijden.Domain.Sessie;

@Component

public interface SessieRepository extends CrudRepository<Sessie, Long>{

}
