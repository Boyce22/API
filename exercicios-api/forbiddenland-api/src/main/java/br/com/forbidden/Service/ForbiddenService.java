package br.com.forbidden.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.forbidden.Repository.ForbiddenRepository;
import br.com.forbidden.domain.Player;

@Service

public class ForbiddenService {

	@Autowired
	ForbiddenRepository forbiddenRepository;

	public List<Player> findAll() {
		return forbiddenRepository.findAll();
	}

	public Player getPlayerById(Integer id) {
		Optional<Player> playerOptional = forbiddenRepository.findById(id);
		return playerOptional.orElse(null);
	}

	public Player deletePlayer(Integer id) {
		Player player = getPlayerById(id);
		if (player != null) {
			player.setIsActive(false);
			return forbiddenRepository.save(player);
		}
		return null;
	}

	public Player updatePlayer(Integer id, String classe, Integer level, String nickname, Integer damage,
			Integer defense) {
		Player player = getPlayerById(id);
		if (player != null) {
			player.setClasse(classe);
			player.setLevel(level);
			player.setNickname(nickname);
			player.setDamage(damage);
			player.setDefense(defense);
		}
		return forbiddenRepository.save(player);
	}

	public Player addPlayer(Integer health, Integer mana, String nickname, Integer level, String classe, Integer damage,
			Integer defense, Boolean isActive) {

		Player player = new Player(null, health, mana, nickname, level, classe, damage, defense, isActive);
		generateRandomId(player);
		return forbiddenRepository.save(player);
	}

	public void generateRandomId(Player player) {
		int minDigits = 7;
		Integer id = player.getId();

		if (id == null || getPlayerById(id) == null) {
			boolean idExists = true;

			while (idExists) {
				id = ThreadLocalRandom.current().nextInt((int) Math.pow(10, minDigits));
				idExists = checkIfIdExists(id);
			}

			player.setId(id);
		}
	}

	private boolean checkIfIdExists(Integer id) {
		return forbiddenRepository.findById(id).isPresent();
	}

}