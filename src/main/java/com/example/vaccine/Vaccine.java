package com.example.vaccine;

import java.sql.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.stereotype.Controller;

@Controller
public class Vaccine {
	@NotNull(message = "Không Được bỏ trống")
	@Size(min=2, message = "Không dưới 2 ký tự" )
	private String name;
	
	@NotNull(message = "Không được bỏ trống")
	@Min(value = 18, message = "Phải lớn hơn hoặc bằng 18")
	private Integer age;
	
	@NotNull(message = "Không được bỏ trống")
	@Size(min = 10 , message = "SĐT Phải bằng 10 và không được hơn")
	private String number;
	
	@NotNull(message = "Không được bỏ trống")
	@Size(min=2,message = "Không dưới 2 ký tự" )
	private String address;
	
	@NotNull(message = "Phải chọn giới tính")
	private Gender gender;
	
	@NotNull
	private Date birthday;
	
	public enum Gender{
			Male, Female
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



}
