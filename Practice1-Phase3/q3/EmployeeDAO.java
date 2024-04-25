package com.proj1.q3;

import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);
    Employee getById(int id);
    List<Employee> getAll();
}
