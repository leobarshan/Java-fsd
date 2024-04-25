package com.proj1.q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcEmployeeDAO implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Employee employee) {
        jdbcTemplate.update("INSERT INTO employees (name, salary) VALUES (?, ?)",
                employee.getName(), employee.getSalary());
    }

    @Override
    public Employee getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM employees WHERE id = ?",
                new Object[]{id}, (rs, rowNum) ->
                        new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
    }

    @Override
    public List<Employee> getAll() {
        return jdbcTemplate.query("SELECT * FROM employees",
                (rs, rowNum) ->
                        new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
    }
}

