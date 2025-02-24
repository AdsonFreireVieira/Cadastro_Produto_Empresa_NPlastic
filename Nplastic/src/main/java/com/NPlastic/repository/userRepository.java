package com.NPlastic.repository;

import com.NPlastic.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<User,Integer>{
}
