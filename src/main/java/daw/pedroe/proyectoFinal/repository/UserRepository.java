package daw.pedroe.proyectoFinal.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import daw.pedroe.proyectoFinal.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByUsername(String username);
}
