package br.com.forbidden.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.forbidden.domain.Player;

@Repository("Forbidden")
public interface ForbiddenRepository extends JpaRepository<Player, Integer> {

}