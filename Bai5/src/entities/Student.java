package src.entities;

import src.interfaces.IStudent;

public class Student implements IStudent {
    private String name;
    private int group;

    public Student() {

    }

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public void diemDanh() {
        System.out.println(name + " diem danh");
    }

    @Override
    public void hocBai() {
        System.out.println(name + " hoc bai");
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(name + " di don ve sinh");
    }
}
