package com.online.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_tab")
public class UserRegister {
	@GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq",initialValue = 100,allocationSize = 100)
	@Column(name="id_col")
	private Long id;
	@Column(name="name_col")
	private String name;
	@Column(name="email_col")
	private String email;
	@Column(name="contact_col")
	private String contact;

}
