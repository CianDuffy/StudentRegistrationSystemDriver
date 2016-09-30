package com.CianDuffy.CT417;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class StudentRegistrationSystemDriver
{
    public static void main( String[] args )
    {
        UtilityManager utilityManager = UtilityManager.getInstance();

        // Initialise Students
        Student testStudent1, testStudent2, testStudent3, testStudent4, testStudent5, testStudent6, testStudent7, testStudent8;

        testStudent1 = new Student("Nick Faldo", utilityManager.dateTimeFromString("18/07/1957"), "13300001");
        testStudent2 = new Student("John Daly", utilityManager.dateTimeFromString("01/01/1994"), "13300002");
        testStudent3 = new Student("Tiger Woods", utilityManager.dateTimeFromString("02/02/1995"), "13300003");
        testStudent4 = new Student("Ernie Els", utilityManager.dateTimeFromString("30/07/1994"), "13300004");
        testStudent5 = new Student("Phil Mickelson", utilityManager.dateTimeFromString("16/03/1994"), "13300005");
        testStudent6 = new Student("Henrik Stenson", utilityManager.dateTimeFromString("03/12/1995"), "13300006");
        testStudent7 = new Student("Miguel Ángel Jíminez", utilityManager.dateTimeFromString("12/10/1995"), "13300007");
        testStudent8 = new Student("Vijay Singh", utilityManager.dateTimeFromString("10/05/1994"), "13300008");

        ArrayList<Student> eceStudents = new ArrayList<Student>();
        eceStudents.add(testStudent1);
        eceStudents.add(testStudent2);
        eceStudents.add(testStudent3);
        eceStudents.add(testStudent4);

        ArrayList<Student> csitStudents = new ArrayList<Student>();
        csitStudents.add(testStudent5);
        csitStudents.add(testStudent6);
        csitStudents.add(testStudent7);
        csitStudents.add(testStudent8);

        Module dspModule = new Module("Digital Signals Processing", "EE455");
        dspModule.addStudents(eceStudents);

        Module systemOnChipModule = new Module("System On Chip I", "EE451");
        systemOnChipModule.addStudents(eceStudents);

        Module machineLearningModule = new Module("Machine Learning & Data Mining", "CT475");
        machineLearningModule.addStudents(eceStudents);
        machineLearningModule.addStudents(csitStudents);

        Module softwareEngineeringModule = new Module("Software Engineering III", "CT417");
        softwareEngineeringModule.addStudents(eceStudents);
        softwareEngineeringModule.addStudents(csitStudents);

        Module openChampionshipModule = new Module("Winning the 1987, 1990 and 1992 Open Championships", "OpenFTW");
        openChampionshipModule.addStudent(testStudent1);

        Module computerScienceSubject1 = new Module("Computer Science Subject 1", "CT1");
        computerScienceSubject1.addStudents(csitStudents);

        Module computerScienceSubject2 = new Module("Computer Science Subject 2", "CT1");
        computerScienceSubject2.addStudents(csitStudents);

        DateTime startDateTime = utilityManager.dateTimeFromString("07/09/2016");
        DateTime endDateTime = utilityManager.dateTimeFromString("10/05/2017");

        CourseProgramme ECECourseProgram = new CourseProgramme("Electronic and Computer Engineering", "BP");
        ECECourseProgram.setStartDateTime(startDateTime);
        ECECourseProgram.setEndDateTime(endDateTime);
        ECECourseProgram.addModule(dspModule);
        ECECourseProgram.addModule(systemOnChipModule);
        ECECourseProgram.addModule(softwareEngineeringModule);
        ECECourseProgram.addModule(machineLearningModule);


        CourseProgramme compSciCourseProgram = new CourseProgramme("Computer Science and Information Technology", "BCT");
        compSciCourseProgram.setStartDateTime(startDateTime);
        compSciCourseProgram.setEndDateTime(endDateTime);
        compSciCourseProgram.addModule(computerScienceSubject1);
        compSciCourseProgram.addModule(computerScienceSubject2);
        compSciCourseProgram.addModule(softwareEngineeringModule);
        compSciCourseProgram.addModule(machineLearningModule);

        CourseProgramme golfCourseProgram = new CourseProgramme("Golf", "GOLF");
        golfCourseProgram.setStartDateTime(startDateTime);
        golfCourseProgram.setEndDateTime(endDateTime);
        golfCourseProgram.addModule(openChampionshipModule);

        System.out.println(ECECourseProgram);
        System.out.println(compSciCourseProgram);
        System.out.println(golfCourseProgram);
    }
}
