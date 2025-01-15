package com.Empsal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpsalDao {
@Autowired
EmpsalRepository er;
public String postall(List<Empsal> e)
{
	er.saveAll(e);
	return "posted successfully";
}
public List<Empsal> getall()
{
	return er.findAll();
}
}
