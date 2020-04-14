package com.students.studentcrm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.students.studentcrm.entity.Student;
import com.students.studentcrm.mapper.StudentMapper;
import com.students.studentcrm.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
