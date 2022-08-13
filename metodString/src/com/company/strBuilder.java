package com.company;

import java.util.Objects;

public class strBuilder {
    private final int a=3;
    private final int b=56;

       public void Buildyrav(StringBuilder strB){
           System.out.println(strB.append(a).append("+").append(b).append("=").append(a+b).toString());
           System.out.println(strB.append(a).append("-").append(b).append("=").append(a-b).toString());
           System.out.println(strB.append(a).append("*").append(b).append("=").append(a*b).toString());
       }
       public void replaceB(){
           StringBuilder str = new StringBuilder("Object-oriented programming is a programming language " +
                   "model organized around objects rather than action and data rather than logic. " +
                   "Object-oriented programming blabla. Object-oriented programming bla.");
           str = str.replace(str.lastIndexOf("Object"),str.lastIndexOf(" "), "OOP");
           System.out.println(str.replace(str.lastIndexOf("Object"),str.lastIndexOf("blabla"), "OOP "));
       }

       public void middleWord (){


       }
}
