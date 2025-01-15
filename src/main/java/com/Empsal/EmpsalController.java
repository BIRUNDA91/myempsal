package com.Empsal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpsalController {
@Autowired
EmpsalService es;
@PostMapping(value="/postall")
public String postall(@RequestBody List<Empsal> e)
{
	return es.postall(e);
}
@GetMapping(value="/getall")
public List<Empsal> getall()
{
	return es.getall();
}
}
