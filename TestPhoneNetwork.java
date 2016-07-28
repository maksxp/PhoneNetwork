
public class TestPhoneNetwork {
	static Network kyivstar = new Network ("Kyivstar");
	static Network lifecell = new Network ("Lifecell");
	static Network vodafone = new Network ("Vodafone");
	static Phone first = new Phone (111111111111L);
	static Phone second = new Phone (222222222222L);
	static Phone third = new Phone (333333333333L);
	static Phone fourth = new Phone (444444444444L);
	static Phone fifth = new Phone (555555555555L);
	static Phone sixth = new Phone (555555555555L);
	static Phone seventh = new Phone (777777777777L);
	static Phone eighth = new Phone (888888888888L);
	static Phone nineth = new Phone (999999999999L);
public static void main(String[] args) {
	//System.out.println(fifth);
	first.register(kyivstar);
	second.call(first); // wrong because caller is not registered yet
	second.register(kyivstar);
	second.call(first); // ok because caller is already registered	third.register(kyivstar);
	third.register(kyivstar); // wrong because Kyivstar network already contains such number
	fourth.register(lifecell);
	fifth.register(lifecell);
	System.out.println(fifth);
	sixth.register(lifecell); //show that method checks exactly the number - not the Phone name
	seventh.register(vodafone);
	eighth.register(vodafone);
	second.call(nineth); // call before registration of targer number - wrong
	nineth.register(vodafone);
	second.call(nineth); // call after registration of target number - ok
}
}
