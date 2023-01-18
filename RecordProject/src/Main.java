public class Main {
    public static void main(String[] args) {
       for(int i = 1; i <= 5; i++){
           LPAStudent s = new LPAStudent("S92300" + i,
                   switch(i){
                       case 1 -> "Mary";
                       case 2 -> "Carol";
                       case 3 -> "Time";
                       case 4 -> "Harry";
                       case 5 -> "Liza";
                       default -> "Anonymous";
                   },
                   "05/11/1983",
                   "Java Mastery"
                   );
           System.out.println(s);
       }

       Student pojoStudent = new Student("s987933",
               "Ann",
               "05/08/1967",
               "Java MasterClass");
       LPAStudent recordStudent = new LPAStudent("S98482834", "Bill",
               "05/12/1987", "Java Masterclass");

       System.out.println(pojoStudent);
       System.out.println(recordStudent);

       System.out.println(pojoStudent.getName() + " is taken " + pojoStudent.getClassList());
       System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}