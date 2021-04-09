package com.crm.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm.customer.dao.customerDao;
import com.crm.customer.entity.customer;
@RestController
public class customercontroller {
	@Autowired
	private customerDao custDao;
	@PostMapping("saveCustomer")
public void saveCustomer(@RequestBody customer cust)
{
	
	custDao.save(cust);
}
}
