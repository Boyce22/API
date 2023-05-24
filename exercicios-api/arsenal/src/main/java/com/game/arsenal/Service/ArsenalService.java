package com.game.arsenal.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.arsenal.Domain.Arsenal;
import com.game.arsenal.Repository.ArsenalRepository;

@Service
public class ArsenalService {

	@Autowired
	ArsenalRepository arsenalRepository;

	public List<Arsenal> findAll() {
		return arsenalRepository.findAll();
	}

	public Arsenal getArsenalById(Integer weaponId) {
		Optional<Arsenal> arsenalOptional = arsenalRepository.findById(weaponId);
		return arsenalOptional.orElse(null);
	}

	public Arsenal deleteArsenal(Integer weaponId) {
		Arsenal arsenal = getArsenalById(weaponId);
		if (arsenal != null) {
			arsenal.setIsActive(false);
			return arsenalRepository.save(arsenal);
		}
		return null;
	}

	public Arsenal updateArsenal(Integer weaponId, String name, Integer damage, String description, String nature) {
		Arsenal arsenal = getArsenalById(weaponId);
		if (arsenal != null) {
			arsenal.setName(name);
			arsenal.setDamage(damage);
			arsenal.setDescription(description);
			return arsenalRepository.save(arsenal);
		}
		return null;
	}

	public Arsenal addArsenal(Integer damage, String name, String description, String nature, Boolean isActive) {
		Arsenal arsenal = new Arsenal();
		arsenal.setName(name);
		arsenal.setDamage(damage);
		arsenal.setDescription(description);
		arsenal.setNature(nature);
		arsenal.setIsActive(true);
		generateRandomId(arsenal);
		return arsenalRepository.save(arsenal);
	}

	public void generateRandomId(Arsenal arsenal) {
		int minDigits = 7;
		Integer id = arsenal.getWeaponId();

		if (id == null || getArsenalById(id) == null) {
			boolean idExists = true;

			while (idExists) {
				id = ThreadLocalRandom.current().nextInt((int) Math.pow(10, minDigits));
				idExists = checkIfIdExists(id);
			}

			arsenal.setWeaponId(id);
		}
	}

	private boolean checkIfIdExists(Integer id) {
		return arsenalRepository.findById(id).isPresent();
	}
}
