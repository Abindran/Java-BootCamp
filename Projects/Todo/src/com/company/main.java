package com.company;
import java.util.Scanner;
public class main {
    private static  Scanner input = new Scanner(System.in);
    private static TodoList mTodoList = new TodoList();
    public static void main(String args[]){
        int command = 0;
        boolean exit = false;
        printCommand();
        while(!exit){
            System.out.println("Enter your choice: ");
            command = input.nextInt();
            input.nextLine();

            switch(command){
                case 0:
                    printCommand();
                    break;
                case 1:
                    mTodoList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please pick only from the given commands");
            }
        }
    }
    public static void printCommand(){
        System.out.println("\nCommands: " +
                "\n Press 0 : To print instructions" +
                "\n Press 1 : To print all lists" +
                "\n Press 2 : To add list in Todo" +
                "\n Press 3 : To modify item in Todo" +
                "\n Press 4 : To remove item from Todo" +
                "\n Press 5 : To search an item from Todo" +
                "\n Press 6 : To exit the app");
    }

    public static void addItem(){
            System.out.println("Enter the item to be added in the TODO list: ");
            mTodoList.addItem(input.nextLine());
    }

    public static void updateItem(){
        System.out.println("Enter the item number: ");
        int index = input.nextInt();
        input.nextLine();
        System.out.println("Enter the new item to be added in the TODO list: ");
        String myNewItem = input.nextLine();
        mTodoList.updateTodo(index-1,myNewItem);
    }

    public static void removeItem(){
        System.out.println("Enter the item number to be deleted: ");
        int index = input.nextInt();
        input.nextLine();
        mTodoList.removeItem(index-1);
    }

    public static void searchItem(){
        System.out.println("Enter a string to be searched: ");
        String searchItem = input.nextLine();
        if(mTodoList.findItem(searchItem) == -1){
            System.out.println("Item not found in your TODO list");
        }else{
            System.out.println(searchItem + " was found in your list at the index " + mTodoList.findItem(searchItem) );
        }
    }
}
