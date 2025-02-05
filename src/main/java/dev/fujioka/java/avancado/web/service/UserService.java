package dev.fujioka.java.avancado.web.service;

import dev.fujioka.java.avancado.web.domain.User;
import dev.fujioka.java.avancado.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements CrudInterface<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> save(User entity) {
        return Optional.of(userRepository.save(entity));
    }

    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(User entity) {
        userRepository.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    public List<User> getListByFirstName(String firstName){
        return userRepository.findUserByFirstName(firstName);
    }

    public List<User> getListByUserId(Long id) {
        return userRepository.findUserById(id);
    }

    public List<User> getListByLastName(String lastName){
        return userRepository.findUserByLastName(lastName);
    }

    public List<User> getListByLogin(String login){
        return userRepository.findUserByLogin(login);
    }


}
