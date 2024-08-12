package BTVN_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employeeinfo {
    Employee emp = new Employee();
    public ArrayList<Employee> empList = new ArrayList<>();

    public void addNV(Employee emp) {
        empList.add(emp);
    }

    public Employee search(int ID) {
        for (Employee emp : empList) {
            if (ID == emp.getEmployeeId()) {
                return emp;
            }
        }
        return null;
    }

    public void upDate(int ID) {
        for (Employee emp : empList) {
            if (emp.getEmployeeId() == ID) {
                emp.getName();
                emp.getDepartment();
                emp.getSalary();
            } else
                System.out.println("nhan vien nay khong ton tai");
        }
    }

    public void xoaNv(int ID) {
        emp = search(ID);
        if (emp != null) {
            empList.remove(emp);
        } else {
            System.out.println("khong ton tai nv nay");
        }
    }
    public void listEmployee (String department){
        for (Employee emp:empList){
            if (department.equals(emp.getDepartment())){
                System.out.println(emp);
            }else{
                System.out.println("khong co nv nao");
            }

        }
    }public void sapXep (){
        empList.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
    }

}