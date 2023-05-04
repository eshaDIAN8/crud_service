package com.citi.converter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CONVERT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Convert {

	@Id
	@Column(name="FROM_UNIT_TO_UNIT")
	private String fromUnit_toUnit;
	
	@Column(name="NAME")
	private String name;
	
	/*@Column(name ="INCHTOMETER")
	private double inchToMeter;
	
	@Column(name ="FOOTTOMETER")
	private double footToMeter ;
	
	@Column(name ="MILETOMETER")
	private double mileToMeter ;

	@Column(name ="MMTOMETER")
	private double mmToMeter ;

	@Column(name ="CMTOMETER")
	private double cmToMeter ;

	@Column(name ="KMTOMETER")
	private double kmToMeter ;
*/}
