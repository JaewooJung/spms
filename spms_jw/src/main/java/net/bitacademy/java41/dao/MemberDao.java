package net.bitacademy.java41.dao;

import java.util.List;
import java.util.Map;

import net.bitacademy.java41.vo.Member;

public interface MemberDao {
	
	 Member getMember(Map<String,String> paramMap) throws Exception;
	
//	private List<Photo> listPhoto(String email) throws Exception;

	 int add(Member member) throws Exception;
	
	 List<Member> list() throws Exception;

	 Member get(String email) throws Exception;
	
     int changePassword(
            Map<String,String> paramMap) throws Exception;
	
     int change(Member member) throws Exception;
    
     int photoChange(Map<String,String> paramMap) throws Exception;
     
     int remove(String email) throws Exception;
     
     int remove2(String email) throws Exception;
     
     int photoRemove(String email) throws Exception;
 
	 void addPhoto(Map<String,String> paramMap) throws Exception;
	 
	 String getPhoto(String email) throws Exception;
	
}

