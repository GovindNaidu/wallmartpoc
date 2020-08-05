package in.bushansirgur.springboot.crudapi.dto;

import java.util.List;

import lombok.Data;

@Data
public class ApiResponse {

	private Integer statusCode;
	private List<EmployeeDTO> emplist;
	private String message;
	private EmployeeDTO employeeObj;
	
}
