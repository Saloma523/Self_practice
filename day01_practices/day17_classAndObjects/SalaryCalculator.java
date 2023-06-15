package day17_classAndObjects;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public void  setOfInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public void salary(){
        double salary = ( hourlyRate * weeklyHours * 52);
        System.out.println(salary);
    }

    public void stateTax(){

    }

    public void federalTax(){

    }

    public void salaryAfterTax(){

    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}
/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */
