package com.game.arsenal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.game.arsenal.Domain.Arsenal;
import com.game.arsenal.Service.ArsenalService;

@RestController
@RequestMapping("/game")
public class ArsenalController {

	@Autowired
	ArsenalService arsenalService;

	// Listar todas as armas do arsenal
	// http://localhost:8080/arsenal/game/all
	@GetMapping("/all")
	public List<Arsenal> getAllWeapons() {
		return arsenalService.findAll();
	}

	// Listar todas as armas do arsenal
	// http://localhost:8080/arsenal/game/{weaponId}
	@GetMapping("/{weaponId}")
	public Arsenal getWeaponById(@PathVariable Integer weaponId) {
		return arsenalService.getArsenalById(weaponId);
	}

	// Adicionar itens do Banco de Dados atraves do body
	// http://localhost:8080/arsenal/game/add
	@PostMapping("/add")
	public Arsenal addWeapon(@RequestBody Arsenal weapon) {
		return arsenalService.addArsenal(weapon.getDamage(), weapon.getName(), weapon.getDescription(),
				weapon.getNature(), weapon.getIsActive());
	}

	// Editar itens do Banco de Dados atraves do body, usando o ID da arma que quer alterar
	// http://localhost:8080/arsenal/game/edit/{weaponId}
	@PutMapping("/edit/{weaponId}")
	public Arsenal updateWeapon(@PathVariable Integer weaponId, @RequestBody Arsenal weapon) {
		return arsenalService.updateArsenal(weaponId, weapon.getName(), weapon.getDamage(), weapon.getDescription(),
				weapon.getNature());
	}

	// Remover arma do jogo, setando o atributo Boolean como falso
	// http://localhost:8080/arsenal/game/remove/{weaponId}
	@DeleteMapping("/remove/{weaponId}")
	public Arsenal deleteWeapon(@PathVariable Integer weaponId) {
		return arsenalService.deleteArsenal(weaponId);
	}
}