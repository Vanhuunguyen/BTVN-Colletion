package BTVN_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Examql {
    public static void main(String[] args) {
        Student2 Huy = new Student2(01,"Huy",18);
        Student2 Ha = new Student2(02,"Ha",20);
        ExamResult toan = new ExamResult("toan",5);
        ExamResult anh = new ExamResult("anh",8);
        ExamResult van = new ExamResult("van",6);
        ExamResult su = new ExamResult("su",9);
        ExamResult dia = new ExamResult("dia",4);

        ArrayList<Student2> StudentList = new ArrayList<>();
        StudentList.add(Huy);
        StudentList.add(Ha);

        ArrayList<ExamResult> khoid = new ArrayList<>();
        khoid.add(toan);
        khoid.add(van);
        khoid.add(anh);
        ArrayList<ExamResult> khoic = new ArrayList<>();
        khoic.add(van);
        khoic.add(su);
        khoic.add(dia);
        Map<Student2,ArrayList<ExamResult>> maps = new HashMap<>();
        maps.put(Huy,khoic);
        maps.put(Ha,khoid);
        System.out.println(maps);
        Scanner sc = new Scanner(System.in);
        //Tìm kiếm và hiển thị danh sách điểm thi của một sinh viên theo id.
        int id;
        System.out.println("nhap ma id hs can tim");
        id = sc.nextInt();
        double tongDiem = 0;
        int dem = 0;
        for (Student2 student:StudentList){
            if (student.getId()==id){
                System.out.println("hs " + maps.get(student));
            }

            for (ExamResult ex:maps.get(student)) {
                tongDiem += ex.getScore();
                dem += 1;
            }
            double diemTrungBinh = tongDiem/dem;
            System.out.println("sinh vien "+ student + "co diem trung binh la " + diemTrungBinh);
        }

    }
}

