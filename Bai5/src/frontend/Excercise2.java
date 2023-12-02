package src.frontend;

import src.entities.Student;
import src.entities.Teacher;
import src.interfaces.IStudent;

public class Excercise2 {
    private IStudent[] students = new IStudent[11];
    public void tao10HocSinh() {
        students[0] = new Teacher("Nguen van a", 2);
        students[1] = new Student("Nguen van b", 1);
        students[2] = new Student("Nguen van a=c", 2);
        students[3] = new Student("Nguen van d", 3);
        students[4] = new Student("Nguen van e", 1);
        students[5] = new Student("Nguen van f", 1);
        students[6] = new Student("Nguen van g", 3);
        students[7] = new Student("Nguen van hj", 2);
        students[8] = new Student("Nguen van i", 1);
        students[9] = new Student("Nguen van k", 1);
        students[10] = new Student("Nguen van l", 3);
    }

    public void diemDanhCaLop() {
        for(IStudent student: students) {
            student.diemDanh();
        }
    }

    public void goiNhom1DiHocBai() {
        for(IStudent student: students) {
                student.hocBai();
        }
    }

    public void goiNhom2DiDonVeSinh() {
        for(IStudent student: students) {
                student.diDonVeSinh();
        }
    }
}
