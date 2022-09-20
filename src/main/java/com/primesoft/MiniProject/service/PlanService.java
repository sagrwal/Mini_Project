package com.primesoft.MiniProject.service;

import java.util.List;
import java.util.Map;

import com.primesoft.MiniProject.entity.Plan;

public interface PlanService {
	//Abstract Method
	
	//Reason for Drop Down Data
	//for selection of category  -id will be key and name will be value therefore map
	public Map<Integer,String> getPlanCategories();

	//for submit button 
	public boolean savePlan(Plan plan);
	
	//for view plan
	public List<Plan> getAllPlans();
	
	//for edit plan
	public Plan getPlanById(Integer planId);
	
	//for updating plan
    public boolean updatePlan(Plan plan);
    
    //for deleting
    public boolean deletePlanById(Integer planId);
    
    //for Activating and deactivating  softDelete
    public boolean planStatusChange(Integer planId, String activeSw);
	
}
