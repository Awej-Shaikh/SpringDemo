package com.MiniProject.Repository;

import com.MiniProject.entityClasses.Members;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Members, Long> {
    // The method name must match the entity field name for automatic query generation
    List<Members> findByAddress(String address);
}
