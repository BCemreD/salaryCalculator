package salaryCalculator;


public class Employee {

	public Employee() {}
	String name;
    int salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	int theYear = 2021;
	
	//for bonus
	int bonus;
	
	//for tax
	int taxResult;
	
	//for raise salary
	int salResult;
	
	public int additionalHour()
	{
		int addedHour = workHours - 40;
		return addedHour;
	}
	
	// bonus hesabi
	public int addedBonus()
	{	int bonus;
	if(workHours < 40)
		{
		  bonus = 0;
		}
	else {bonus = (workHours - 40) * 30;}
		return bonus;
	}
	
	//zam hesabi
	
	public int raiseSalary()
	{
	if (theYear - hireYear < 10)
	{
		salResult = (salary / 100) * 5;
	}
	else if (theYear - hireYear > 9 && theYear - hireYear <=19)
	{
		salResult = (salary / 100) * 10;
	}
	else if(theYear- hireYear > 19)
	{
		salResult = (salary / 100) * 15;
	}
	
	return salResult;
	}
	
	
	//vergi hesabi
	public int tax()
	{
	
	if (salary < 1000)
	{
		taxResult = 0;
	}
	
	else {taxResult= (salary /100) *3;}
	return taxResult;
		
	}
	
	
	//for total salary
	public int totalSalary() 
	{
	
		int totalSal =  salary + addedBonus() - taxResult +salResult;
		return totalSal; 

	}
	public int taxNSalary()
	{
		int taxNSal =  salary + addedBonus() - taxResult;
		return taxNSal;

	}
		
	
	public String toString()
	{
		return "Adi:" + name + "\nMaas:"  + salary 
				+"\nHaftalik Calisma Saati:"+ workHours
				+"\nIse giris yili:"+ hireYear 
				+"\nBonus:"+ addedBonus() +"\nVergisi:"+ tax()
				+ "\nZam:" + raiseSalary() +  "\nVergi ve bonuslarla maas:" 
				+ taxNSalary()+"\nToplam maas:" + totalSalary();
	}

	public static void main(String[] args) {
		  
		  
		  Employee cengiz = new Employee("Cengiz Kaan",900,39,2020);
		 
		  
		  String cengizStr = cengiz.toString();
		  System.out.println("Cengiz KAAN'in bilgileri:");
		  System.out.println(cengizStr);
		 
		  
		  Employee serra = new Employee();
		  serra.name = "Serra CANAN";
		  serra.salary = 19000;
		  serra.workHours = 59;
		  serra.hireYear = 2000;
		  
		  String serraStr = serra.toString();
		  System.out.println("\nSerra CANAN'in bilgileri:");
		  System.out.println(serraStr);
		  
		  Employee nergis = new Employee("Nergis HANIM",2000,70,2010);
			
		  
		  String nergisStr = nergis.toString();
		  System.out.println("\nNergis HANIM'in bilgileri:");
		  System.out.println(nergisStr);
		  
		}
}
