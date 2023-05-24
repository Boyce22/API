package com.game.arsenal.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "weapon")
public class Arsenal {

	@Id
	@Column(name = "wea_cd_weapon_id", nullable = false, unique = true)
	private Integer weaponId;

	@Column(name = "wea_tx_name", nullable = false)
	private String name;

	@Column(name = "wea_int_damage", nullable = false)
	private Integer damage;

	@Column(name = "wea_tx_description", nullable = false)
	private String description;

	@Column(name = "wea_tx_nature", nullable = false)
	private String nature;

	@Column(name = "wea_bl_isactive", nullable = false)
	private Boolean isActive;

	public Arsenal() {

	}

	public Arsenal(Integer weaponId, Integer damage, String description, String nature, String name, Boolean isActive) {
		this.weaponId = weaponId;
		this.damage = damage;
		this.description = description;
		this.nature = nature;
		this.name = name;
		this.isActive = isActive;
	}

	public Integer getWeaponId() {
		return weaponId;
	}

	public void setWeaponId(Integer weaponId) {
		this.weaponId = weaponId;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}