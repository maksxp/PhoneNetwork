import java.util.HashSet;

public class Network {
	private String operatorName;
	//HashSet below contains list of phone numbers for every operator
	private HashSet<Long> listOfNumbers;
    public Network (){}
    public Network (String operatorName){
    	this.operatorName=operatorName;
    	this.listOfNumbers = new HashSet<Long>();
    }
	@Override
	public String toString() {
		return "Network " + operatorName + "\n" +"listOfNumbers " + listOfNumbers;
	}
	public boolean addNumber(Long number) {
		return listOfNumbers.add(number);
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public HashSet<Long> getListOfNumbers() {
		return listOfNumbers;
	}
	public void setListOfNumbers(HashSet<Long> listOfNumbers) {
		this.listOfNumbers = listOfNumbers;
	}
	}
