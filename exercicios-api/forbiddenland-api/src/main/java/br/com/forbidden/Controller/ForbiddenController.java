package br.com.forbidden.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.forbidden.Service.ForbiddenService;
import br.com.forbidden.domain.Player;

@RestController
@RequestMapping("/game")
public class ForbiddenController {

	@Autowired
	ForbiddenService forbiddenService;

	// Listar todos os jogadores do banco de dados
	// http://localhost:8080/forbiddenland-api/game/player/all
	@GetMapping("/player/all")
	public List<Player> findAll() {
		return forbiddenService.findAll();

	}

	// Achar jogador por id do banco de dados
	// http://localhost:8080/forbiddenland-api/game/player/find/{id}
	@GetMapping("/player/find/{id}")
	public Player findPlayer(@PathVariable Integer id) {
		return forbiddenService.getPlayerById(id);
	}

	// Editar Informações do jogador
	// http://localhost:8080/forbiddenland-api/game/player/edit/{id}
	@PutMapping("/player/edit/{id}")
	public Player editPlayer(@PathVariable(value = "id") Integer id, @RequestParam String classe,
			@RequestParam Integer level, @RequestParam String nickname, @RequestParam Integer damage,
			@RequestParam Integer defense) {
		return forbiddenService.updatePlayer(id, classe, level, nickname, damage, defense);
	}

	// Remover jogador
	// http://localhost:8080/forbiddenland-api/game/player/remove/{id}
	@DeleteMapping("/player/remove/{id}")
	public Player deletePlayer(@PathVariable Integer id) {
		return forbiddenService.deletePlayer(id);
	}

	// Adicionar Jogadores
	// http://localhost:8080/forbiddenland-api/game/player/add
	@PostMapping("/player/add")
	public Player addPlayer(@RequestBody Player playerRequest) {
		Player player = forbiddenService.addPlayer(playerRequest.getHealth(), playerRequest.getMana(),
				playerRequest.getNickname(), playerRequest.getLevel(), playerRequest.getClasse(),
				playerRequest.getDamage(), playerRequest.getDefense(), playerRequest.getIsActive());

		return player;
	}

}