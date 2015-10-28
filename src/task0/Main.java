package task0;

import java.util.Date;

public class Main {
    public static void main(String args[]) {
        student[] stu = new student[4];
        stu[0] = new student(1, "Avakov", "Dmitriy", "Olegovich", new Date(1990, 9, 9), "sergeli-7", 6667606, "Economical", 1, "AT-12");
        stu[1] = new student(2, "Abdullaye", "Abduhakim", "Abdurashidovich", new Date(1991, 5, 6), "mirobod", 9277606, "OPiU", 2, "AB-177");
        stu[2] = new student(3, "Lapasov", "Furqat", "Gaybullayevich", new Date(1992, 6, 19), "chuqursoy", 7277190, "Economical", 2, "AT-12");
        stu[3] = new student(4, "Ermatov", "Anvar", "Abdumalikovich", new Date(1988, 11, 19), "chuqursoy", 6667190, "Mexanika", 3, "MF-162");

        Date p = new Date(1990, 9, 9);

        for (int i = 0; i <= 3; i++) {
            stu[i].show();

            System.out.println();
            for (i = 0; i <= 3; i++) {
                stu[i].faculty();
            }
            System.out.println();
            for (i = 0; i <= 3; i++) {
                stu[i].facultyAndCourse();
            }
            System.out.println();
            for (i = 0; i <= 3; i++) {
                stu[i].Birthday(p);
            }
            System.out.println();
            for (i = 0; i <= 3; i++) {
                stu[i].getGroup();
            }
        }
    }
}
class student {

    public int id;
    public String surname;
    public String name;
    public String secondName;
    public Date birthday;
    public String adres;
    public int telephon;
    public String faculty;
    public int course;
    public String group;

    public student() {
    }

    public student(int id, String surname, String name, String secondName, Date birthday, String adres, int telephon, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthday = birthday;
        this.adres = adres;
        this.telephon = telephon;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getAdres() {

        return adres;
    }

    public Date getBirthday() {

        return birthday;
    }

    public String getFaculty() {

        return faculty;
    }

    public String getGroup() {

        return group;
    }

    public int getId() {

        return id;
    }

    public int getCourse() {

        return course;
    }

    public String getName() {

        return name;
    }

    public String getSecondName() {

        return secondName;
    }

    public String getSurname() {

        return surname;
    }

    public int getTelephon() {

        return telephon;
    }


    public void setAdres(String adres) {

        this.adres = adres;
    }

    public void setBirthday(Date birthday) {

        this.birthday = new Date(1990, 9, 9);
    }

    public void setFaculty(String faculty) {

        this.faculty = faculty;
    }

    public void setGruppa(String group) {

        this.group = group;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setCourse(int course) {

        this.course = course;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSecondName(String secondName) {

        this.secondName = secondName;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setTelephone(int telephon) {

        this.telephon = telephon;
    }


    public void show() {
        System.out.println("id: " + getId());
        System.out.println("Surname: " + getSurname());
        System.out.println("name: " + getName());
        System.out.println("SeconName: " + getSecondName());
        System.out.println("Birthday: " + getBirthday().getYear() + "." + getBirthday().getMonth() + "." + getBirthday().getDay());
        System.out.println("adres: " + getAdres());
        System.out.println("telephon: " + getTelephon());
        System.out.println("faculty: " + getFaculty());
        System.out.println("Course: " + getCourse());
        System.out.println("group: " + getGroup());


    }

    //список студентов заданного факультета
    public void faculty() {
        if ((this.getFaculty()).equals("Economical")) {
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("Name: " + getName());
            System.out.println("SecondName: " + getSecondName());
            System.out.println("Birthday: " + getBirthday().getYear() + "." + getBirthday().getMonth() + "." + getBirthday().getDay());
            System.out.println("adres: " + getAdres());
            System.out.println("telephon: " + getTelephon());
            System.out.println("faculty: " + getFaculty());
            System.out.println("course: " + getCourse());
            System.out.println("group: " + getGroup());

        }

    }

    //списки студентов для каждого факультета и курса
    public void facultyAndCourse() {
        if (((this.getFaculty()).equals("Economical")) && (this.getCourse() == 3)) {
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("Name: " + getName());
            System.out.println("SecondName: " + getSecondName());
            System.out.println("Birthday: " + getBirthday().getYear() + "." + getBirthday().getMonth() + "." + getBirthday().getDay());
            System.out.println("adres: " + getAdres());
            System.out.println("telephon: " + getTelephon());
            System.out.println("faculty: " + getFaculty());
            System.out.println("course: " + getCourse());
            System.out.println("group: " + getGroup());
        }
    }

    //список студентов, родившихся после заданного года
    public void Birthday(Date p) {
        if ((this.getBirthday().getYear()) > (p.getYear())) {
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("name: " + getName());
            System.out.println("SecondName: " + getSecondName());
            System.out.println("Birthday: " + getBirthday().getYear());
            System.out.println("adres: " + getAdres());
            System.out.println("telephon: " + getTelephon());
            System.out.println("faculty: " + getFaculty());
            System.out.println("course: " + getCourse());
            System.out.println("group: " + getGroup());
        }
    }

    // список учебной группы
    public void setGroup() {
        if (!this.getGroup().equals("AT-12")) {
            System.out.println("group: " + getGroup());
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("name: " + getName());
            System.out.println("SecondName: " + getSecondName());
            System.out.println("Birthday: " + getBirthday().getYear());
            System.out.println("adres: " + getAdres());
            System.out.println("telephon: " + getTelephon());
            System.out.println("faculty: " + getFaculty());
            System.out.println("course: " + getCourse());
        }
    }
}


