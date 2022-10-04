package com.primesoft.MiniProject.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.primesoft.MiniProject.entity.Plan;
import com.primesoft.MiniProject.repo.PlanRepo;

@Component
public class PlanDAO implements CommandLineRunner{

	@Autowired
	PlanRepo pl;
	
	@Override
	public void run(String... args) throws Exception {
		
		pl.saveAll(List.of(
				
				new Plan("Bumper",null, null, "Y",101),
				new Plan("Summer",null,null,"N",102)
				
				
				));
				
				
				
				
				
				
				
				
			
		}
		
	}


