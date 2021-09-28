class Employee{
    String name;
    int year;
    String address;

    public static void main(String[] args) {
        Employee a = new Employee();
        Employee b = new Employee();
        Employee c = new Employee();

        a.name = "Ravi";
        a.year = 2002;
        a.address = "Kurla";

        b.name = "Jasmit";
        b.year = 2002;
        b.address = "Panvel";

        c.name = "Tushar";
        c.year = 2003;
        c.address = "Kurla";

        System.out.println(" Name     Year of joining      Address ");
        System.out.println("---------------------------------------");
        System.out.println(" "+a.name+"          "+a.year+"             "+a.address);
        System.out.println(" "+b.name+"        "+b.year+"             "+b.address);
        System.out.println(" "+c.name+"        "+c.year+"             "+c.address);
    }
}
