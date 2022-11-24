package com.richard.springdatajpa.io.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "address")
public class AddressEntity extends BaseEntity {

  private static final long serialVersionUID = 1905122041950251207L;

  @Column(length=30, nullable=false)
	private String addressId;
	
	@Column(length=15, nullable=false)
	private String city;
	
	@Column(length=15, nullable=false)
	private String country;
	
	@Column(length=100, nullable=false)
	private String streetName;
	
	@Column(length=7, nullable=false)
	private String postalCode;
	
	@Column(length=10, nullable=false)
	private String type;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private AccountEntity userDetails;

}
