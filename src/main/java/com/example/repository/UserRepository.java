package com.example.repository;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public class UserRepository {

	@PersistenceContext
	protected EntityManager entityManager;

	@Transactional
	public void updateUser(long id) {
		
		Query query = entityManager.createNativeQuery("UPDATE user SET created_date = NOW() WHERE id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
		
	}
	
	public User getUser(long id) {
		
		Query query = entityManager.createNativeQuery(
				"SELECT id, name, DATE_FORMAT(created_date, '%Y-%m-%d'), password " + 
				"FROM user " + 
				"WHERE id = :id");
		query.setParameter("id", id);
		List<Object[]> resultList = query.getResultList();
		Object[] record = resultList.size() > 0 ? resultList.get(0) : null;
		
		BigInteger pk = (BigInteger) record[0];
        String name = (String) record[1];
        String created_date = (String) record[2];
        String password = (String) record[3];
        User user = new User();
        user.setId(pk.longValue());
        user.setName(name);;
        user.setCreatedDate(created_date);
        user.setPassword(password);
		return user;
	}
	
}
