package com.pack.service;


import com.pack.bean.User;

import java.util.List;

public interface UserService {
	 User getUserById(int userId);
	 int insert(User user);
	 List selectAll();
	 List selectLimit(Integer offset, Integer limit);
	 int update(int userId);
	 int update2(User user);
	 int delete(User user);
	 int getCount();
	 int somedel(Integer[] arr);
	 List twosel();
	 User sele(User user);
	 String getPermissiin(String name);
	 String getRole(String name);

}
