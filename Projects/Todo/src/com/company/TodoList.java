package com.company;

import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> todoList = new ArrayList<String>();

    //Add list item
    public void addItem(String item){
        todoList.add(item);
    }

    //Remove list item
    public void removeItem(int index){
        String mItem = todoList.get(index);
        todoList.remove(index);
    }

    //Print the list
    public void printList(){
        System.out.println("Todo List consists of " + todoList.size() +" items");
        for (int i=0;i<todoList.size();i++){
            System.out.println("Element at the position "+(i+1)+" is "+todoList.get(i));
        }
    }

    // Update list item
    public void updateTodo(int index,String item){
        todoList.set(index,item);
        System.out.println("Updation is completed at position "+(index+1));
    }

    // Search feature for user
    public int findItem(String key){
        int index = todoList.indexOf(key);
        if(index == -1){
            return -1;
        }else{
            return index;
        }
    }
}
