package com.spark.blog.repositories;

import com.spark.blog.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    // TODO : pagination
    // JpaRepository for CRUD related operations and to implement pagination


}
