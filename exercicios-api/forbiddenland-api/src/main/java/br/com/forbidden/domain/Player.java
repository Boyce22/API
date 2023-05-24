package br.com.forbidden.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@Column(name = "pla_cd_id", nullable = false, unique = true)
	private Integer id;

	@Column(name = "pla_int_health", nullable = false)
	private Integer health;

	@Column(name = "pla_int_mana", nullable = false)
	private Integer mana;

	@Column(name = "pla_tx_nickname", nullable = false)
	private String nickname;

	@Column(name = "pla_int_level", nullable = false)
	private Integer level;

	@Column(name = "pla_tx_class", nullable = false)
	private String classe;

	@Column(name = "pla_int_damage", nullable = false)
	private Integer damage;

	@Column(name = "pla_int_defense", nullable = false)
	private Integer defense;

	@Column(name = "pla_bl_active", nullable = false)
	private Boolean isActive;

	public Player(Integer id, Integer health, Integer mana, String nickname, Integer level, String classe,
			Integer damage, Integer defense, Boolean isActive) {
		this.id = id;
		this.health = health;
		this.mana = mana;
		this.nickname = nickname;
		this.level = level;
		this.classe = classe;
		this.damage = damage;
		this.defense = defense;
		this.isActive = isActive;
	}

	public Player() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
