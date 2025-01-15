package com.Empsal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpsalService {
@Autowired
EmpsalDao ed;
public String postall(List<Empsal> e)
{
	return ed.postall(e);
}
public List<Empsal> getall()
{
	return ed.getall();
}
}
