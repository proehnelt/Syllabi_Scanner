package com.example.syllabiscanner;
import java.util.ArrayList;

public class Course {


    public static int CID;
    public static boolean prioritize;
    public static String cname;

    public Course(int CID, String cname, boolean prioritize)
    {
        this.CID = CID;
        this.cname = cname;
        this.prioritize = prioritize;
    }

    public Course()
    {

    }


}
