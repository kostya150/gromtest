
package lesson8.hierarchy;

import java.util.Date;

public class Demo {

    Student createHighestParent() {
        //Course course1 = new Course(new Date(),"Andrey",300,"Mudrevskiy",new Student[1]);
        //Course course2 = new Course(new Date(), "Andrey",200,"Mudrevskiy",new Student[1]);
        Course[] courseArr = {};


        Student student = new Student("John","Johnson",3,courseArr);
        return student;
    }

    SpecialStudent createLowestChild() {
        Course[] courseArr = {};
        CollegeStudent collegeStudent = new CollegeStudent("Andrey","Ivanov",3,courseArr,"GromCode",3,723552375);
        SpecialStudent specialStudent = new SpecialStudent("Jack","Jackson", 3,courseArr,1234567,"jack@gmail.com");
        return specialStudent;
    }
}










