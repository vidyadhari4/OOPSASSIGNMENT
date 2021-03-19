class Person{
    String ID;
    String name;
}
class Employee extends Person{
    double salary;
}
class Test{
    public static void main(String args[]){
        Employee obj=new Employee();
        obj.ID="12345";
        obj.name="John";
        obj.salary=65000.8;
        System.out.println(obj.ID+" "+obj.name+" "+obj.salary);
    }
}