class person1{
    private String firstname;
    private String lastname;
    person1(String firstname, String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public String getFirstName()
    {
        return firstname;
    }
    public String getLastName()
    {
        return lastname;
    }
}

class employee1 extends person1{
    private String jobTitle;
    private String empid;

    employee1(String firstname, String lastname, String jobTitle,String empid)
    {
        super(firstname,lastname);
        this.jobTitle=jobTitle;
        this.empid=empid;

    }

    public String getEmployeeId()
    {
        return empid;
    }

    public String getLastName() {

        return super.getLastName() + "( "+ jobTitle +" )";

    }
}
public class Question22 {
    public static void main(String args[])
    {
        //Employee e = new Employee("Yash", "Sonawane ","Web Developer","MLSC123");
        person1 p = new person1("Yash", "Sonawane");
//		String id = e.getEmployeeId();
        String f = p.getFirstName();
        String l = p.getLastName();
//		System.out.println(id);
        System.out.println(f);
        System.out.println(l);

    }


}