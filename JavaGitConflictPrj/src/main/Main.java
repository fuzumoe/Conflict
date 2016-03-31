package main;

public class Main {

public String[] names ={"adam","abel","miras"};

public void printNames(){

for(String name :names){

			System.out.println(name);
			System.out.println("[[");

}
System.out.println("End of Names");
//try this one
}

public static void main(String[] args){

Main main = new Main();

main.printNames();

}

}