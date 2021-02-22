package br.com.andre.springbootcourse.userrepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.andre.springbootcourse.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
