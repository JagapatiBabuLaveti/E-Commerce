package com.online.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Id
	private Long id;
	
	@Column(name="name_col")
	private String name;
	@Column(name="email_col")
	private String email;
	@Column(name="password_col")
	private String password;
	@Column(name="contact_col")
	private Long contactId;

}
