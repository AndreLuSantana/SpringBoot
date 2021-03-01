package br.com.andre.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.andre.springbootcourse.entities.User;
import br.com.andre.springbootcourse.services.exceptions.DatabaseException;
import br.com.andre.springbootcourse.services.exceptions.ResourceNotFoundException;
import br.com.andre.springbootcourse.userrepositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void deleteById(Long id) {
		try {
		repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	public User update(Long id, User user) {
		
		try {
		User entity = repository.getOne(id);//Instacia obj monitorado, porém sem ir buscar no BD de forma imediata. 
		updateData(entity, user);
		return repository.save(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User user) {
		
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
}
