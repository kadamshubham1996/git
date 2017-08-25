package jvm;

import java.lang.reflect.Method;

public class test
{
    public static void main(String args[])throws ClassNotFoundException
    {
        int count = 0;
       Class student = Class.forName("jvm.student");
        Method[] m = student.getDeclaredMethods();
        for (Method m1 : m)
        {
            count++;
            System.out.println(m1.getName());
        }
        System.out.println(count);

    }
}