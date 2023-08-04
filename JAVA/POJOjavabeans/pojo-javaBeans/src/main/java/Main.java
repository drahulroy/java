public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            Students s = new Students("ROY00001" + i,
                    switch (i){
                case 1 -> "rahul roy";
                case 2 -> "rohit";
                case 3 -> "ashish";
                case 4 -> "sachin";
                case 5 -> "kaushal";
                        default -> "unknown";
                    },
                    "30/sep/1995",
                    "Projectmanager class");
            System.out.println(s);
        }
        Students pojostudents =new Students("nk0101","esse","30093999","to do");
        LPAStudent recordstudent = new LPAStudent("2323","psse","4545454545","fuck you");

        System.out.println(pojostudents);
        System.out.println(recordstudent);


        pojostudents.setClasslist(pojostudents.getClasslist() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");



        System.out.println(pojostudents.getName()+ " is taking " + pojostudents.getClasslist());
        System.out.println(recordstudent.name()+ " is taking " + recordstudent.classlist());

    }
}
