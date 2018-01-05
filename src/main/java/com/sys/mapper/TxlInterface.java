package com.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sys.entity.Txl;

public interface TxlInterface {

	@Select("SELECT * FROM txl")
	//@Results({ @Result(property = "sexLable", column = "sex_lable") })
	List<Txl> getAll();

	@Select("SELECT * FROM txl WHERE id = #{id}")
	//@Results({ @Result(property = "sexLable", column = "sex_lable") })
	Txl getOne(Long id);

	//@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(Txl user);

	//@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(Txl user);

	//@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);
}
