package in.bushansirgur.springboot.crudapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.bushansirgur.springboot.crudapi.dao.EmployeeDAO;
import in.bushansirgur.springboot.crudapi.dto.EmployeeDTO;
import in.bushansirgur.springboot.crudapi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO; 
	
	@Transactional
	@Override
	public List<EmployeeDTO> get() {
		List<Employee> emplist=employeeDAO.get();
		
		List<EmployeeDTO> dtolist=new ArrayList<>();
		for(Employee entityObj:emplist) {
			
		EmployeeDTO dtoobj=new EmployeeDTO();
		dtoobj.setId(entityObj.getId());
		dtoobj.setFirstname(entityObj.getFirstname());
		dtoobj.setLasttname(entityObj.getLasttname());
		dtoobj.setDepartment(entityObj.getDepartment());
		dtoobj.setAge(entityObj.getAge());
		dtoobj.setSalary(entityObj.getSalary());
		dtoobj.setDob(entityObj.getDob());
		dtoobj.setDoj(entityObj.getDoj());
		dtolist.add(dtoobj);
		}
		return dtolist;
	}

	@Transactional
	@Override
	public EmployeeDTO get(int id) {
		Employee entityObj=employeeDAO.get(id);
		EmployeeDTO dtoobj=null;
		if(entityObj!=null) {
			dtoobj=new EmployeeDTO();
		dtoobj.setId(entityObj.getId());
		dtoobj.setFirstname(entityObj.getFirstname());
		dtoobj.setLasttname(entityObj.getLasttname());
		dtoobj.setDepartment(entityObj.getDepartment());
		dtoobj.setAge(entityObj.getAge());
		dtoobj.setSalary(entityObj.getSalary());
		dtoobj.setDob(entityObj.getDob());
		dtoobj.setDoj(entityObj.getDoj());
		}
		return dtoobj;
	}

	@Transactional
	@Override
	public void save(EmployeeDTO employee) {
		
		Employee empEntity=new Employee();
		if(employee.getId()!=null)
		{
			empEntity.setId(employee.getId());	
		}
		empEntity.setFirstname(employee.getFirstname());
		empEntity.setLasttname(employee.getLasttname());
		empEntity.setDepartment(employee.getDepartment());
		empEntity.setAge(employee.getAge());
		empEntity.setSalary(employee.getSalary());
		empEntity.setDob(employee.getDob());
		empEntity.setDoj(employee.getDoj());
		
		employeeDAO.save(empEntity);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDAO.delete(id);
	}

}
