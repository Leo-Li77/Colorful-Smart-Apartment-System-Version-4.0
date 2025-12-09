package com.leoli.Validations;

import java.util.List;

import com.leoli.Student.StudentApartment;


public class Validation {

    // Validation 1 : to judge whether a string can be converted to a long variable
    public boolean judgeIsLong(String input) {
        if (input.isEmpty()) {
            return false;
        } try {
            Long.parseLong(input);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    } // End of JudgeIsLong()


    // Validation 2 : to judge whether a string can be converted to an int variable
    public boolean judgeIsInt(String input) {
        if (input.isEmpty()) {
            return false;
        } try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


    // Validation 3 : to judge whether the length of the variable match the length set
    public boolean judgeLength(String input, int length) {
        return input.length() == length;
    } // End of JudgeLength()


    // Validation 4 : to judge whether the length of name (after removing the spaces) is longer than 2 characters
    public boolean judgeName(String name) {
        return name.trim().length() >= 2;
    } // End of JudgeName()


    // Validation 5 : to judge whether all the elements of studentID are number and whether studentID is consisted of 12 numbers
    public boolean judgeID(String studentID) {
        if (studentID.length() != 12) {
            return false;
        }
        try {
            Long.parseLong(studentID);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    } // End of JudgeID()


    // Validation 6 : to judge whether the studentID is already exist in studentStore
    public boolean judgeUniqueID(String studentID, List<StudentApartment> store) {
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getStudentID().equals(studentID)) {
                return false;
            }
        }
        return true;
    } // End of JudgeUniqueID()


    // Validation 7 : to judge whether the phone number is exactly consisted of 11 elements and all of which are numbers
    public boolean judgePhoneNumber(String telephoneNumber) {
        if (telephoneNumber.length() != 11) {
            return false;
        } try {
            Long.parseLong(telephoneNumber);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    } // End of JudgePhoneNumber()

} // End of Validation Class