package com.leoli.FunctionStore;

import com.leoli.Student.StudentApartment;

import java.util.List;

public class Functions {

    // Function 1 : to search a student in studentStore
    public int searchStudentID(String studentID, List<StudentApartment> store) {
        int index;
        for (index = 0; index < store.size(); index++) {
            if (store.get(index).getStudentID().equals(studentID.trim())) {
                return index;
            }
        }
        return -1;
    } // End of SearchStudentID()


    // Function 2 : to search all the objects with name same as the given one
    public int searchStudentName(String name, List<StudentApartment> store) {
        int index;
        for (index = 0; index < store.size(); index++) {
            if (store.get(index).getName().equals(name.trim())) {
                return index;
            }
        }
        return -1;
    }


} // End of Functions Class
