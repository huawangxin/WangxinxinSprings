package com.wangxinxin2.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.wangxinxin2.entity.Student;
import com.wangxinxin2.service.StudentService;

public class StudentServiceImpl extends StudentService {

	private JdbcTemplate jdbcTemplate;

	private static StudentService instance = new StudentService();

	public static StudentService getInstance() {
		return instance;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// 添加学生信息
	public boolean addStudent(Student student) {
		try {
			jdbcTemplate.update("insert into student values(null,?,?,?)",
					new Object[] { student.getName(), student.getAge(), student.getStatus() },
					new int[] { Types.VARCHAR, Types.INTEGER, Types.VARCHAR });
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// 根据Id删除单个学生信息
	public boolean deleteStudent(int id) {
		try {
			jdbcTemplate.update("delete from student where studentId = ?", new Object[] { id },
					new int[] { Types.INTEGER });
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// 根据Id更新指定学生信息
	public boolean updateStudent(int Id, Student student) {
		try {
			jdbcTemplate.update(
					"update student set studentName = ?, studentAge = ?, studentPhone = ? where studentId = ?",
					new Object[] { student.getName(), student.getAge(), student.getStatus(), Id },
					new int[] { Types.VARCHAR, Types.INTEGER, Types.VARCHAR, Types.INTEGER });
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// 根据学生Id查询单个学生信息
	public Student getStudent(int id) {
		try {
			return (Student) jdbcTemplate.queryForObject("select * from student where studentId = ?",
					new Object[] { id }, new int[] { Types.INTEGER }, new RowMapper<Student>() {
						public Student mapRow(ResultSet rs, int arg1) throws SQLException {
							Student student = new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getLong(4),
									rs.getString(5));
							return student;
						}
					});
		}
		// 根据Id查询学生信息抛异常, 不管什么原因, 认为查询不到该学生信息, 返回null
		catch (DataAccessException e) {
			return null;
		}
	}

	// 查询所有学生信息
	public List<Student> getStudents() {
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("select * from student");
		List<Student> studentList = null;
		if (resultList != null && !resultList.isEmpty()) {
			studentList = new ArrayList<Student>();
			Map<String, Object> map = null;
			for (int i = 0; i < resultList.size(); i++) {
				map = resultList.get(i);
				Student student = new Student((String) map.get("studentId"), (String) map.get("studentName"),
						(Integer) map.get("studentAge"), (Long) map.get("studentPhone"),
						(String) map.get("studentPhone"));
				studentList.add(student);
			}
		}
		return studentList;
	}
	
}
