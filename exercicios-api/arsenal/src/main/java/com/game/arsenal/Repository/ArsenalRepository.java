package com.game.arsenal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.arsenal.Domain.Arsenal;

@Repository("Arsenal")
public interface ArsenalRepository extends JpaRepository<Arsenal, Integer> {

}
