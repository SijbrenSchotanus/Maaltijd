package com.maaltijd.Maaltijden.Controller;


import com.maaltijd.Maaltijden.Domain.Maaltijd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface MaaltijdRepository extends CrudRepository<Maaltijd, Long> {



}
