package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {

    public List<User> findUserByFirstName(@Param("firstName") String firstName);

    public List<User> findUserById(@Param("id") Long id);

    public List<User> findUserByLastName(@Param("lastName") String lastName);

    public List<User> findUserByLogin(@Param("login") String login);

}