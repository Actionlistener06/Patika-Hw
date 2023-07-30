
//Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
//tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
//Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
//Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
//bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
// her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
//raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
//Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
//Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
//Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
//toString() : Çalışana ait bilgileri ekrana bastıracaktır.
public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public void tax(){
        if(this.salary>1000){
            double tax=salary*5/100;
            this.salary=salary-tax;
        }
    }
    public void bonus(){
        if(workHours>40){
            int bonus=(workHours-40)*30;
            this.salary=salary+bonus;
        }
    }
    public void raiseSalary(){
        double raiseValue;
        int experience = 2021-hireYear;
        if(experience<10){
            raiseValue=salary*5/100;
            salary+=raiseValue;
        }
        if(experience>9&&experience<20){
            raiseValue=salary*10/100;
            salary+=raiseValue;
        }
        if(experience>19){
            raiseValue=salary*15/100;
            salary+=raiseValue;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorHours(int worHours) {
        this.workHours = worHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", worHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
