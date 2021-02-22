package com.company;

public class Student {


    public float evaluateTerm(float homeworkMark, float examMark, float attitude) {
        float examMarkDef = examMark;
        float homeWorkDef = homeworkMark;

        if (examMark < 5) {
            examMarkDef = 1;
        }

        if (homeworkMark < 4) {
            homeWorkDef = 1;
        }
        return (homeWorkDef + examMarkDef) / 2 + attitude;
    }
}