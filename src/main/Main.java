package main;

import java.sql.SQLException;
import java.util.List;

import logic.Student;

import DAO.Factory;

public class Main {

    public static void main(String[] args) throws SQLException {
        //�������� ���� ���������
        Student s1 = new Student();
        Student s2 = new Student();

        //����������������� ��
        s1.setName("Ivanov Ivan");
        s1.setAge(21l);
        s2.setName("Petrova Alisa");
        s2.setAge(24l);

        //�������� �� � ��, id ����� ������������� �������������
        Factory.getInstance().getStudentDAO().addStudent(s1);
        Factory.getInstance().getStudentDAO().addStudent(s2);

        //������� ���� ��������� �� ��
        List<Student> studs = Factory.getInstance().getStudentDAO().getAllStudents();
        System.out.println("========��� ��������=========");
        for(int i = 0; i < studs.size(); ++i) {
            System.out.println("Student name : " + studs.get(i).getName() + ", Age : " + studs.get(i).getAge() +",  id : " + studs.get(i).getId());
            System.out.println("=============================");
        }
    }
}