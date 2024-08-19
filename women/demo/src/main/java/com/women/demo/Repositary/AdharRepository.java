package com.women.demo.Repository;

import com.women.demo.Entity.Adhar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdharRepository extends JpaRepository<Adhar,Long> {
}
