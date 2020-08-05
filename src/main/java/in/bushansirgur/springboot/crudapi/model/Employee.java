package in.bushansirgur.springboot.crudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_employee")
@Data
public class Employee {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String firstname;
	@Column
	private String lasttname;
	@Column
	private String department;
	@Column
	private Integer age;
	@Column
	private Integer salary;
	@Column
	private Date dob;
	@Column
	private Date doj;

	
	
}
