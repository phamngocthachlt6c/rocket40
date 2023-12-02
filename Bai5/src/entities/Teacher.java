package src.entities;

import src.interfaces.IStudent;

public class Teacher extends Student implements IStudent {
    public Teacher(String name, int group) {
        super(name, group);
        this.abc();
        super.getName();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    void abc() {

    }

    public String getName(int a) {
        return "";
    }

    public String getName(int b, int a) {
        return "";
    }

    @Override
    public void diemDanh() {

    }

    @Override
    public void hocBai() {

    }

    @Override
    public void diDonVeSinh() {
        System.out.println(getName() + " Giao vien di don ve sinh");
    }
}
