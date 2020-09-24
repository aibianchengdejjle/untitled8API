package com.company;

import java.util.ArrayList;

/*
*
* */
public class object2 {
    private static Object ArrayList;

    public static void main(String[] args) {
        person p=new person("zzz",123);
        person p2=new person("zzz",12);
        System.out.println(p.equals(ArrayList));
    }
}
class  person{
    String  name;
    int age;

    public  person(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    public  boolean equals(Object o){
        person other=(person)o;  //向下转型
        if(this!=o)
        {
            return false;
        }
        if(this.name.equals(other.name))
        {
            return false;
        }
        if(this.age!=other.age)
        {
            return false;
        }
        return true;
    }
}

