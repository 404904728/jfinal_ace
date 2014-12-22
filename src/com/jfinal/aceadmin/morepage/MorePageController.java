package com.jfinal.aceadmin.morepage;

import com.jfinal.core.Controller;

public class MorePageController extends Controller{

	public void timeline(){
		
		render("timeline.html");
	}
	
	public void pricingTable(){
		
		render("pricing_table.html");
	}
	
	public void inbox(){
		
		render("inbox.html");
	}
	
	public void invoice(){
		
		render("invoice.html");
	}
	
	public void profile(){
	
		render("userprofile.html");
	}
	
	public void login(){
		
		render("login.html");
	}
}
