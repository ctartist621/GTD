package graph.pkg;

import java.util.Date;
import java.util.LinkedList;

public class TaskNode {
	
	String _taskName, _comments;
	FolderNode _folder;
	double _latitude, _longnitude;
	Date _dueDate, _createdDate, _alertDate;
	int priority;
	boolean _alertOn, _isCompleted;
	long _duration;
	TaskNode _alphabetParent,alphabetChild;
	TaskNode _dueDateParent,dueDateChild;
	TaskNode _addDateParent,addDateChild;
	TaskNode _priorityParent,_priorityChild;
	LinkedList<TaskNode> _subTasks;
	LinkedList<TaskNode> _preTasks;
	public TaskNode(){
		
	}
	
}
