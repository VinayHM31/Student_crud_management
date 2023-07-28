package com.StudentDemo;

import java.time.LocalDateTime;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	private String name;
	@NonNull
	private String email;
	@NonNull
	private String phonenumber;
	@NonNull
	private String address;
	@NonNull
	private String fathername;
	@NonNull
	private String fees;
	@NonNull
	private int age;
	private LocalDateTime createdDate;

	public void prePersist() {
		this.createdDate = LocalDateTime.now();
	}

	public Student() {
	}

	public Long getId() {
		return id;
	}

	public Student(Long id, String name, String email, String phonenumber, String address, String fathername,
			String fees, int age, LocalDateTime createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.fathername = fathername;
		this.fees = fees;
		this.age = age;
		this.createdDate = createdDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", address=" + address + ", fathername=" + fathername + ", fees=" + fees + ", age=" + age
				+ ", createdDate=" + createdDate + "]";
	}
}
