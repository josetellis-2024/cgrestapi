package vtech.Springemprestapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vtech.Springemprestapi.models.Employee;
// interface help to persist 
// crudrepo -jpa repo -pagination-sorting
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
