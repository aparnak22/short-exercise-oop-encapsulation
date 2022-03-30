package com.techreturners.encapsulation.gradetracker;

public class Student {

    private String name;
    private char grade;
    private int group;
    private String secretNickName="MySecretNickName" ;

    public Student(String name, char grade, int group) {
        this.name = name;
        validateAndSetGrade(grade);
        validateAndSetGroup(group);
    }

    private void validateAndSetGrade(char grade) {
        if (grade >= 'A' && grade <='E' ) {
            this.grade = grade;
        }
        else throw new InvalidStudentDataException("Invalid Grade : " + grade);
    }

    private void validateAndSetGroup(int group) {
        if (group >= 1 && group <=5 ) {
            this.group = group;
        }
        else throw new InvalidStudentDataException("Invalid Group : " + group);
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }

    public void upgradeGrade(){
        if (grade > 'A'){
            grade --;
        }
    }

    public void downgradeGrade(){
        if (grade < 'E'){
            grade ++;
        }
    }
}
