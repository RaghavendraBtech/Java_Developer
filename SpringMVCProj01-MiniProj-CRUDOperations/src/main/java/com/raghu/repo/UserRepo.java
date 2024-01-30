package com.raghu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raghu.model.User;
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
