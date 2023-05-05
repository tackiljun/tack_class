package todo.domain;

public class TodoDTO {
	
	
	private int tno;
	private String todo;
	private String duedate;
	private boolean finished;

	
	
	// 기본생성자.
	public TodoDTO() {	
	}
	
	
	// 생성자.
	public TodoDTO(int tno, String todo, String duedate, boolean finished) {
		super();
		this.tno = tno;
		this.todo = todo;
		this.duedate = duedate;
		this.finished = finished;
	}
	
	
	// getter,setter.
	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

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

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	
	// toString.
	@Override
	public String toString() {
		return "TodoDTO [tno=" + tno + ", todo=" + todo + ", duedate=" + duedate + ", finished=" + finished + "]";
	}
	
	
	
}
