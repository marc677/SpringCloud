package com.test1.repository;

import com.test1.entity.Student;

import java.util.Collection;

//定义实体的接口方法
public interface StudentRepository {
    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);
}