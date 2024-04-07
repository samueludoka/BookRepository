package org.applicationsmart.data.repository;

import org.applicationsmart.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
