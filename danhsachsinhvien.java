package BTVN_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachsinhvien {
    public ArrayList<Student> danhSach = new ArrayList<>();
    Student Student;
    Student sv = new Student();

    public void addSinhVien(Student sv) {
        this.danhSach.add(sv);
    }

    public Student timSV(int id) {
        for (Student Sv : danhSach) {
            if (Sv.getID() == id) {
                return sv;
            }
        }
        return null;
    }

    public void upDate(int id) {
        for (Student Sv : danhSach) {
            if (Sv.getID() == id) {
                Student.getName();
                Student.getAge();
                Student.getGpa();
            } else
                System.out.println("sinh vien nay k ton tai");

        }
    }

    public void xoaSV(int id) {
        sv = timSV(id);
        if (sv != null) {
            danhSach.remove(sv);
        } else
            System.out.println("sinh vien nay khong ton tai");
    }

    public void sapXep() {
        Collections.sort(this.danhSach, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void hienThi(double diemGPA) {
        for (Student Sv : danhSach) {
            if (sv.getGpa() > diemGPA) {
                System.out.println(sv);
            }
        }

    }
}

