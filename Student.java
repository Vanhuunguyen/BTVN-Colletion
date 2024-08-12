package BTVN_Collection;

public class Student {
    //Tạo một lớp Student với các thuộc tính: id, name, age, và gpa.
    //Viết một chương trình để thực hiện các chức năng sau:
    //Thêm một sinh viên vào danh sách sinh viên (dùng List).
    //Tìm kiếm sinh viên theo id.
    //Cập nhật thông tin sinh viên theo id.
    //Xóa sinh viên theo id.
    //Sắp xếp danh sách sinh viên theo tên.
    //Hiển thị tất cả sinh viên có gpa lớn hơn một giá trị cho trước
    private int ID;
    private String name;
    private int age;
    private double gpa;
    public Student(){};

    public Student(int ID, String name, int age, double gpa) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
