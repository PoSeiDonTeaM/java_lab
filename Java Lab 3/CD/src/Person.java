
public class Person {

	String name;
	String gender;
	int age;


public Person(String n, String g, int a){
	name="";
	gender="";
	age=0;
}



public class Artist extends Person{
	String genre;
	String instrument;
	
public Artist(){
	super();
	genre="";
	instrument="";
	
}

public Artist(String n, String g, int a, String ge, String i)
{
	super(n,g,a);
	genre=ge;
	instrument=i;
}

public String toString(){
	return super.toString() + "genre" +"genre" + "
}
	
}

public class CDDatabase{
	
	}
}

}
