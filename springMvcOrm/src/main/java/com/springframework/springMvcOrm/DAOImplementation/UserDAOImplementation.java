package com.springframework.springMvcOrm.DAOImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.springMvcOrm.DAO.UserDAO;
import com.springframework.springMvcOrm.Entities.User;

@Repository
public class UserDAOImplementation implements UserDAO {
	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int createUser(User user) {
		// TODO Auto-generated method stub
		return (Integer) this.hibernateTemplate.save(user);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
