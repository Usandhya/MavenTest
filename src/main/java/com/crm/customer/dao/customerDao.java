package com.crm.customer.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.customer.entity.customer;

@Repository
public interface customerDao extends JpaRepository<customer, Integer> {
	

}
