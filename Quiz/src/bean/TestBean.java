package bean;

import java.util.ArrayList;
import java.util.List;

import model.*;


public class TestBean {
	
	List<Typeq> types = new ArrayList<Typeq>();
	List<Testq> tests = new ArrayList<Testq>();
	public List<Typeq> getTypes() {
		return types;
	}
	public void setTypes(List<Typeq> types) {
		this.types = types;
	}
	public List<Testq> getTests() {
		return tests;
	}
	public void setTests(List<Testq> tests) {
		this.tests = tests;
	}
	
	

}
