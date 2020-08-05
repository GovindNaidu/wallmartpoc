package in.bushansirgur.springboot.crudapi.service;

import java.util.List;

import in.bushansirgur.springboot.crudapi.dto.EmployeeDTO;
import in.bushansirgur.springboot.crudapi.model.Employee;

public interface EmployeeService {
	
	List<EmployeeDTO> get();
	
	EmployeeDTO get(int id);
	
	void save(EmployeeDTO employee);
	
	void delete(int id); 
}
