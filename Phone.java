
public class Phone {
private Long number;
private boolean status; //true if number registered in any network and false otherwise

public Phone() {
	super();
}

public Phone(Long number) {
	super();
	this.number = number;
}

public void call (Phone phone){
	if (status){
		if (phone.status)
		System.out.println("connection with "+phone.number+" succefull");
	else 
		System.out.println("connection with "+phone.number+" impossible");
	}
else 
	System.out.println("caller must be registered");
}
//adds number to the specified network and changes status to true if ok
public void register (Network net){
	if (net.addNumber(number)){
		status=true;
	System.out.println(this.number+" registered successfully in " + net.getOperatorName());}
	else
	System.out.println(this.number+" is already registered");	
}

@Override
public String toString() {
	return "Phone [number=" + number + ", status=" + status + "]";
}

}
