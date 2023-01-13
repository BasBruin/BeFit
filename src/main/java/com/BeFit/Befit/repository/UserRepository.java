package com.BeFit.Befit.repository;

import com.BeFit.Befit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findbyGroupId(int GroupID);
}
