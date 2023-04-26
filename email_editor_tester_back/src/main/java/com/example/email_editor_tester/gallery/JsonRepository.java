package com.example.email_editor_tester.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonRepository extends JpaRepository<json,Long> {
}
