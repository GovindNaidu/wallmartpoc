package in.bushansirgur.springboot.crudapi.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeDTO {

	private Integer id;
	private String firstname;
	private String lasttname;
	private String department;
	private Integer age;
	private Integer salary;
	private Date dob;
	private Date doj;

	 
}
