package com.techreturners.encapsulation.gradetracker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testCreateStudent(){
        Student st1 = new Student("Joy",'B',1);
        assertEquals("Joy", st1.getName());
        assertEquals('B',st1.getGrade());
        assertEquals(1,st1.getGroup());
    }

    @Test
    public void testDowngradeGrade(){
        Student st2 = new Student("Bella",'B',1);
        st2.downgradeGrade();
        assertEquals('C',st2.getGrade());
        st2.downgradeGrade();
        assertEquals('D',st2.getGrade());
        st2.downgradeGrade();
        assertEquals('E',st2.getGrade());
        st2.downgradeGrade();
        assertEquals('E',st2.getGrade());
        st2.downgradeGrade();
        assertEquals('E',st2.getGrade());
    }

    @Test
    public void testUpgradeGrade(){
        Student st3 = new Student("Bella",'E',1);
        st3.upgradeGrade();
        assertEquals('D',st3.getGrade());
        st3.upgradeGrade();
        assertEquals('C',st3.getGrade());
        st3.upgradeGrade();
        assertEquals('B',st3.getGrade());
        st3.upgradeGrade();
        assertEquals('A',st3.getGrade());
        st3.upgradeGrade();
        assertEquals('A',st3.getGrade());
    }

    @Test
    public void testInvalidInput(){
        assertThrows(InvalidStudentDataException.class,
                () -> new Student("Nojoy", 'Z', 1));
        assertThrows(InvalidStudentDataException.class,
                () -> new Student("Nojoy", 'A', 6));

    }
}