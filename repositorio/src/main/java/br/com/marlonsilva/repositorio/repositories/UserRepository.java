package br.com.marlonsilva.repositorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marlonsilva.repositorio.domain.user.User;

public interface UserRepository extends JpaRepository<User, String>{
    
}
