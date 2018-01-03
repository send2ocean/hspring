package com.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sys.entity.TestTable;

public interface TestInterface {

	@Select("SELECT * FROM users")
	@Results({ @Result(property = "sexLable", column = "sex_lable") })
	List<TestTable> getAll();

	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({ @Result(property = "sexLable", column = "sex_lable") })
	TestTable getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(TestTable user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(TestTable user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);
}
