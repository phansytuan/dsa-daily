package DesignPattern;

import java.util.ArrayList;
import java.util.List;


// 1️⃣ Component
interface Task {

    String getTitle();
    void setTitle(String title);
    void display();
}


// 3️⃣ Composite
class TaskList implements Task {

    private String title;
    private List<Task> tasks;

    public TaskList(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public void setTitle(String title) { this.title = title; }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public void display() { System.out.println("Task List: " + title);
        for (Task task : tasks) { task.display(); }
    }
}


// 2️⃣ Leaf
class SimpleTask implements Task {

    private String title;

    public SimpleTask(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public void setTitle(String title) { this.title = title; }

    @Override
    public void display() { System.out.println("Simple Task: " + title); }
}


// 4️⃣ Client
public class CompositeDP {
    public static void main(String[] args) {

        // creating simple tasks
        Task simpleTask1 = new SimpleTask("Complete Coding");
        Task simpleTask2 = new SimpleTask("Write Documentation");

        // Creating a task list
        TaskList projectTasks = new TaskList("Project Tasks");
        projectTasks.addTask(simpleTask1);
        projectTasks.addTask(simpleTask2);

        // updade --> Nested task list
        TaskList phase1Tasks = new TaskList("Phase 1 Tasks--");
        phase1Tasks.addTask(new SimpleTask("Design"));
        phase1Tasks.addTask(new SimpleTask("Implementation"));

        projectTasks.addTask(phase1Tasks);
        projectTasks.display();
    }
}


/** 
    Client (CompositeDP)
    │
    └── projectTasks : TaskList (Composite)
        ├── simpleTask1 : SimpleTask ("Complete Coding")        ← Leaf
        ├── simpleTask2 : SimpleTask ("Write Documentation")    ← Leaf
        └── phase1Tasks : TaskList (Composite)
            ├── SimpleTask ("Design")                   ← Leaf
            └── SimpleTask ("Implementation")           ← Leaf

            
CompositeDP (class main) là Client
Task là Giao diện chung
projectTasks là Composite cha, chứa nhiều phần tử con khác nhau:
    2 Leaf: simpleTask1, simpleTask2
    1 Composite con: phase1Tasks
phase1Tasks lại là Composite con, có 2 Leaf (Design, Implementation)      

*/
