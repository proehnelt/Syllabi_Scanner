package com.example.syllabiscanner;

import java.util.ArrayList;

public class CourseList extends Course {

    static ArrayList<Course> courseList = new ArrayList<Course>();

    static void insert(Course c)
    {
        courseList.add(c);
    }

    static String getName(int index)
    {
        Course a = new Course();
        a = courseList.get(index);

        return a.cname;
    }

    static void edit(int index, Course c)
    {
        courseList.set(index, c);
    }

    static void remove(int index)
    {
        courseList.remove(index);
    }

    static int getSize()
    {
        return courseList.size();
    }

}
