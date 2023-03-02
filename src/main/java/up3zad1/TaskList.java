package up3zad1;

import java.util.ArrayList;

public class TaskList {
private static  TaskList instance = null;

private TaskList() {
	
}
public static TaskList getInstance() {
	if(instance == null) {
		instance = new TaskList();
	}
	return instance;
}
	
private ArrayList<Tasks> taskList = new ArrayList<Tasks>();

public ArrayList<Tasks> getTaskList() {
	return taskList;
}

public void setTaskList(ArrayList<Tasks> taskList) {
	this.taskList = taskList;
}
public void addToList() {
     
}
}
