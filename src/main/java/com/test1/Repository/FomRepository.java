package com.test1.Repository;

import com.test1.Entities.Fom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface FomRepository extends JpaRepository<Fom, Long> {
}
