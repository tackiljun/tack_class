package todo.domain;

public class RequestTodo {
	
	
	private String todo;
	private String duedate;
	
	
	// 생성자.
	public RequestTodo() {
	}
	
	
	public RequestTodo(String todo, String duedate) {
		super();
		this.todo = todo;
		this.duedate = duedate;
	}
	
	
	// get,set처리.
	public String getTodo() {
		return todo;
	}
	
	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	public String getDuedate() {
		return duedate;
	}
	
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	
	
	// toString.
	@Override
	public String toString() {
		return "RequestTodo [todo=" + todo + ", duedate=" + duedate + "]";
	}
	
	
	
}