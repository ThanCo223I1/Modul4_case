package com.example.quanlyhocsinh.service;

import com.example.quanlyhocsinh.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new Student(1, 20, "Ny Toàn", "https://image-us.eva.vn/upload/1-2022/images/2022-02-20/1645325682-ta-xua4-16450861597682099786350.jpg"));
        students.add(new Student(2, 21, "Bồ Cường", "https://image-us.eva.vn/upload/1-2022/images/2022-02-20/1645325682-ta-xua6-16450861597751806752053.jpg"));
        students.add(new Student(3, 22, "Mẹ Tiê", "https://vn.blog.kkday.com/wp-content/uploads/chup-anh-dep-bang-dien-thoai-25.jpg"));
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public int findIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void editStudents(int id, Student student){
        int index = findIndexById(id);
        students.set(index,student);
    }

    public void deleteStudent(int id){
        int index = findIndexById(id);
        students.remove(index);
    }
    public void createStudent(Student student){
        students.add(student);
    }
}
