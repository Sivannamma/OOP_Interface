package ExtendsPractice;

import java.util.LinkedList;
import java.util.List;

public class Manager extends Worker {
	private List<Worker> workers;

	public Manager(String name, int id, int salary) { // constructor
		super(name, id, salary);
		workers = new LinkedList<Worker>();
	}

	public Manager(Manager other) { // copy constructor
		this(other.getName(), other.getId(), other.getSalary());
		for (Worker w : other.workers) {
			workers.add(w);
		}
	}

	public void addWorker(Worker worker) { // adding worker to the under worker that is under manager
		workers.add(worker);
	}

	public void deleteWorker(Worker worker) { // delete worker
		workers.remove(worker);
	}

	public String toString() {
		// String ans= this.toString();
		return "Manager name : " + this.getName() + " id : " + this.getId() + " salary : " + this.getSalary();
	}

}
