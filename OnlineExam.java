import java.util.Scanner;

public class OnlineExam {
    public static void main(String args[]){

        int ch=4;
        int choice;
        String name;
        int id=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Name: ");
        name=sc.next();
        System.out.println("Enter Roll No.: ");
        id=sc.nextInt();
        int count=0;
        System.out.println("Welcome "+name+" to Online Examination");
        do{
            System.out.println("1. Take Exam ");
            System.out.println("2. View Marks");
            System.out.println("3. EXIT");
            System.out.println("Enter your Choice: ");
            ch=sc.nextInt();
            if(ch==4)
            {
                System.out.println("Thank you for taking exam");
                break;
            }
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Select the Subjects: ");
                    System.out.println("1. Advanced Software Engineering /n 2. Advance Datatbase Management System /n3. Java Programming");
                    System.out.println("Enter your Choice : ");
                    int sub=sc.nextInt();
                    System.out.println("There are 5 questions in the examination.");
                    System.out.println("")
                    if(sub==2){
                        count=0;
                        System.out.println("Q1. The E-R data model is based on a perception of the real world that consists of a set of basic objects called ___.");
                        System.out.println("1. Classes \n2. Entities \n3. Objects \n4. Attributes");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==2){
                            ++count;
                        }
                        System.out.println("Q2. In MySQL architecture, the function of the ___ is to keep copies of data for retrieval later, in case of a loss of data.");
                        System.out.println("1. Transaction Manager \n2.  Buffer Manager \n3. Recovery Manager \n4. Query Engine");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==3){
                            ++count;
                        }
                        System.out.println("Q3. In ___ data model, the objects are represented by record structures grouped in file structures.");
                        System.out.println("1. Primitive \n2. Classic \n3. Semantic \n4.  Network");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==2){
                            ++count;
                        }
                        System.out.println("Q4. A ___ is a collection of tuples, each of which contains values for a fixed number of attributes.");
                        System.out.println("1.  Association \n2. Relation \n3. Aggregation \n4. None of the above");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==2){
                            ++count;
                        }
                        System.out.println("Q5.  ___ is a set of principles concerned with how data is operated upon.");
                        System.out.println("1. Data definition \n2. Data control \n3. Data integrity \n4. Data manipulation");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==4){
                            ++count;
                        }
                    }
                    else if(sub==1)
                    {
                        count=0;
                        System.out.println("Q1. Which of the following is involved in the system planning and designing phase of the Software Development Life Cycle (SDLC)?");
                        System.out.println("1. Sizing \n2. Parallel run \n3. Specification freeze \n4. All of the above");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==4){
                            ++count;
                        }
                        System.out.println("Q2. What does RAD stand for?");
                        System.out.println("1. Rapid Application Document \n2. Rapid Application Development \n3. Relative Application Development \n4. None of the above");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==2){
                            ++count;
                        }
                        System.out.println("Q3. The major drawback of RAD model is __________.");
                        System.out.println("1. It requires highly skilled developers/designers. \n2. It necessitates customer feedbacks. \n3. It increases the component reusability. \n4. Both (a) & (c)");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==4){
                            ++count;
                        }
                        System.out.println("Q4. What is the major drawback of the Spiral Model?");
                        System.out.println("1. Higher amount of risk analysis \n2. Doesn't work well for smaller projects \n3. Additional functionalities are added later on \n4. Strong approval and documentation control");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==2){
                            ++count;
                        }
                        System.out.println("Q5. Model selection is based on __________.");
                        System.out.println("1. Requirements \n2. Development team & users \n3. Project type & associated risk \n4. All of the above");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==4){
                            ++count;
                        }
                    }
                    else{
                        count=0;
                        System.out.println("Q1. Which of the following option leads to the portability and security of Java?");
                        System.out.println("1.Bytecode is executed by JVM \n2. The applet makes the Java code secure and portable \n3. Use of exception handling \n4. Dynamic binding between objects");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==1){
                            ++count;
                        }
                        System.out.println("Q2. Which of the following is not a Java features?");
                        System.out.println("1. Dynamic \n2. Architecture Neutral \n3. Use of pointers \n4. Object-oriented");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==3){
                            ++count;
                        }
                        System.out.println("Q3. _____ is used to find and fix bugs in the Java programs.");
                        System.out.println("1. JVM \n2. JRE \n3. JDK \n4. JDB");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==4){
                            ++count;
                        }
                        System.out.println("Q4. What is the return type of the hashCode() method in the Object class?");
                        System.out.println("1. Object \n2. int \n3. long \n4. void");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==2){
                            ++count;
                        }
                        System.out.println("Q5. Which of the following for loop declaration is not valid?");
                        System.out.println("1.for ( int i = 99; i >= 0; i / 9 ) \n2. for ( int i = 7; i <= 77; i += 7 ) \n3. for ( int i = 20; i >= 2; - -i ) \n4. for ( int i = 2; i <= 20; i = 2* i )");
                        System.out.println("Enter your answer: ");
                        choice=sc.nextInt();
                        if(choice==1){
                            ++count;
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Congratulations "+name+" You Scored "+count+" marks "+"out of 5");
                }
            }
        }while(true);
    }
}

