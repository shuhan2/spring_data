package com.example.employee.repository;

import com.example.employee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> ,CrudRepository<Employee, Long> {
//以下所有的*都代表变量

    //1.查询名字是*的第一个employee

    //2.找出Employee表中第一个姓名包含`n`字符的雇员所有个人信息

    //3.找出一个薪资最高且公司ID是*的雇员以及该雇员的姓名

    //4.实现对Employee的分页查询，每页两个数据,每页两条数据，一共三页数。
    //注意：PageRequest的构造方法已经弃用了代替的是PageRequest.of,并且最后一个参数代表按照table中的哪一个字段排序

    //5.查找**的所在的公司的公司名称

    //6.将*的名字改成*,输出这次修改影响的行数

    //7.删除姓名是*的employee
    Employee findByName(String name);
    Employee findDistinctFirstByNameContains(String name);
    Employee findTop1BySalaryAndCompanyId(int salary,long companyId);
   // List<Employee> findAll(Sort sort);

    Page<Employee> findAll(Pageable pageable);
//    String findBySalaryAndId(int id,int salary);
//
//    String findByName(Employee employee);

}
