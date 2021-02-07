package bean;



import java.util.ArrayList;
import java.util.List;

import model.Question;
import model.Typeq;

public class QuestionBean2 {
	
	int inQ=0;
	Question Q = new Question();
	
	List<Typeq> types = new ArrayList<Typeq>();
	List<Question> Questions = new ArrayList<Question>();
	public int getInQ() {
		return inQ;
	}
	public void setInQ(int inQ) {
		this.inQ = inQ;
	}
	public Question getQ() {
		return Q;
	}
	public void setQ(Question q) {
		Q = q;
	}
	public List<Typeq> getTypes() {
		return types;
	}
	public void setTypes(List<Typeq> types) {
		this.types = types;
	}
	public List<Question> getQuestions() {
		return Questions;
	}
	public void setQuestions(List<Question> questions) {
		Questions = questions;
	}

	

	

}
