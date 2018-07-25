package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeWorkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        CourseTask spring = new CourseTask("Spring");
        CourseTask hibernate = new CourseTask("Hibernate");
        CourseTask patterns = new CourseTask("Patternns");
        MentorUser karol = new MentorUser("Karol");
        MentorUser michal = new MentorUser("Michal");
        StudentUser dawid = new StudentUser("Dawid");
        StudentUser krystian = new StudentUser("Krystian");
        spring.registerObserver(michal);
        hibernate.registerObserver(michal);
        patterns.registerObserver(karol);

        //When
        spring.addStudent(dawid);
        spring.addStudent(krystian);
        hibernate.addStudent(krystian);
        hibernate.addStudent(dawid);
        patterns.addStudent(dawid);

        //Then
        Assert.assertEquals(4, michal.getUpdateCount());
        Assert.assertEquals(1, karol.getUpdateCount());
    }
}
