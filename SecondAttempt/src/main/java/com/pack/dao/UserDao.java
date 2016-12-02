package com.pack.dao;

import com.pack.bean.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface UserDao {
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(@Param("id") int id);
    List selectAll();
    List twosel();
    List selectLimit(@Param("offset") Integer offset, @Param("limit") Integer limit);
    int update(int userId);
    int update2(User user);
    int delete(User user);
    int getCount();
    int somedel(Integer[] arr);
    void traninsert(User users);
    User sele(User user);
    String getPermission(@Param("name")String username);
    String getRole(@Param("name")String username);
    
}