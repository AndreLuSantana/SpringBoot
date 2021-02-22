package br.com.andre.springbootcourse.userrepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andre.springbootcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
