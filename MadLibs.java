import java.util.Scanner; 
 
public class MadLibs
{
	String greeting;
	String name01;
	int age;
	String country;
	String dwelling;
	String exclamation;
	int height;
	String color;
	String verb01;
	String verb02;
	String verb03;
	String name02;
	String name03;
	int number01;
	String animal01;
	String animal02;
	String job;
	int number02;
	String verb04;
	int year;
	String name04;
	String adj;
	
	public MadLibs()
	{
		greeting = "Hello";
		name01= "John";
		age = 25;
		country = "America";
		dwelling = "house";
		exclamation = "Yay";
		height = 6;
		color = "brown";
		verb01 = "jumping";
		verb02 = "talking";
		verb03 = "eating";
		name02 = "Mary";
		name03 = "Spongebob";
		number01 = 14;
		animal01 = "dog";
		animal02 = "cat";
		job = "plumber";
		number02 = 50;
		verb04 = "swimming"; 
		year = 2015;
		name04 = "Anne";
		adj = "hairy";
	}
	
	public void getWords()
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter a greeting --------> ");
		greeting = Input.next();
		System.out.print("Enter a name --------> ");
		name01 = Input.next();
		System.out.print("Enter a number(integer) --------> ");
		age = Input.nextInt();
		System.out.print("Enter a country --------> ");
		country = Input.next();
		System.out.print("Enter a type of dwelling --------> ");
		dwelling = Input.next();
		System.out.print("Enter an exclamation --------> ");
		exclamation = Input.next();
		System.out.print("Enter a number(integer) --------> ");
		height = Input.nextInt();
		System.out.print("Enter a color --------> ");
		color = Input.next();
		System.out.print("Enter a verb(-ing) --------> ");
		verb01 = Input.next();
		System.out.print("Enter a verb(-ing) --------> ");
		verb02 = Input.next();
		System.out.print("Enter a verb(-ing) --------> ");
		verb03 = Input.next();
		System.out.print("Enter a name --------> ");
		name02 = Input.next();
		System.out.print("Enter a name --------> ");
		name03 = Input.next();
		System.out.print("Enter a number(integer) --------> ");
		number01 = Input.nextInt();
		System.out.print("Enter an animal --------> ");
		animal01 = Input.next();
		System.out.print("Enter an animal --------> ");
		animal02 = Input.next();
		System.out.print("Enter an occupation --------> ");
		job = Input.next();
		System.out.print("Enter a number(integer) --------> ");
		number02 = Input.nextInt();
		System.out.print("Enter a verb(-ing) --------> ");
		verb04 = Input.next();
		System.out.print("Enter a number(integer) --------> ");
		year = Input.nextInt();
		System.out.print("Enter a name --------> ");
		name04 = Input.next();
		System.out.print("Enter an adjective --------> ");
		adj = Input.next();
	}
	
	public void printMadLib()
	{
		System.out.println();
		System.out.println("All About Me");
		System.out.println(greeting + "!" + " My name is " + name01 + " and I am " 
		+ age + " years old." + " I was born in " + country + " in a " + 
		dwelling + ". " + "When my parents first saw me, they screamed " + 
		exclamation + "! " + "I am " + height + " feet tall and I have " + 
		color + " eyes. My hobbies include " + verb01 + ", " + verb02 + 
		", and " + verb03 + ". My parents are named " + name02 + " and " 
		+ name03 + ". I have " + number01 + " brothers and sisters and two pets: a/an " 
		+ animal01 + " and a/an " + animal02 + ". I work as a/an " + 
		job + " and I get paid $" + number02 + ". My motto is \"Don't stop " + 
		verb04 + "\". In the year " + year + " I married " + name04 + 
		" and s/he is really " + adj + ". And there you have it. All about me!");
	}
	
	
}
