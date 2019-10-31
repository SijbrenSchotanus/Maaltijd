package com.maaltijd.Maaltijden.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.maaltijd.Maaltijden.Domain.User;


@Component
public interface UserRepository extends CrudRepository<User,Long> {

}
