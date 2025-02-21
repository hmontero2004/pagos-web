package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Pago;

@Repository
public class PagoDAOImpl implements PagoDAO {
 
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Pago> findALL() {
Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Pago", Pago.class).getResultList();
		
	}

	@Override
	public Pago findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Pago pago) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Pago pago) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
