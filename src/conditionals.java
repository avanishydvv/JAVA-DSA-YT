public class conditionals {
    public static void main(String[] args){

//
//                int dailyPractice = 2;
//
//                if (dailyPractice >= 10) {
//                    System.out.println("Good consistency!");
//                }


        // int age=20;
        // if(age>18)
        // {
        //     System.out.println("you are eligible to vote");
        // }


        // int age=20;
        // if(age>18)
        // {
        //     System.out.println("you are eligible to vote");
        // }
        // else
        // {
        //     System.out.println("you are not eligible to vote");
        // }

        //          int accuracy = 78;

        // if (accuracy >= 90) {
        //     System.out.println("Excellent");
        // }
        // else if (accuracy >= 75) {
        //     System.out.println("Good");
        // }
        // else if (accuracy >= 60) {
        //     System.out.println("Average");
        // }
        // else {
        //     System.out.println("Needs Improvement");
        // }

        // int day=1;
        // if(day==1)
        // {
        //     System.out.println("Monday");
        // }
        // else if(day==2)
        // {
        //     System.out.println("Tuesday");
        // }
        // else if(day==3)
        // {
        //     System.out.println("Wednesday");
        // }
        // else if(day==4)
        // {
        //     System.out.println("Thursday");
        // }
        // else if(day==5)
        // {
        //     System.out.println("Friday");
        // }
        // else if(day==6)
        // {
        //     System.out.println("Saturday");
        // }
        // else if(day==7)
        // {
        //     System.out.println("Sunday");
        // }

        // boolean hasSubscription = true;
        // int solvedProblems = 220;

        // if (hasSubscription) {

        //     if (solvedProblems >= 200) {
        //         System.out.println("Unlock Advanced Sheet");
        //     } else {
        //         System.out.println("Practice More Problems");
        //     }

        // } else {
        //     System.out.println("Upgrade to Premium");
        // }




        // int age = 19;
        // char gender = 'F';

        // if(gender == 'M') {

        //         System.out.println("You are Male");
        //         if(age > 18) {

        //             System.out.println("You are an Adult Male");
        //         }else{
        //             System.out.println("You are less than 18 years old");
        //         }
        // }
        //     else {
        //         System.out.println("You are not a Male ");
        //         if(age > 18) {

        //             System.out.println("You are an not  Male and age > 18");
        //         }else{
        //             System.out.println("You are not a male and less than 18 years old");
        //         }
        //     }



        // Ternary operator example

    /*    int streakDays = 35;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";

        System.out.println(status);

        int age = 20;
        int ans = (age >= 18) ? 1 : 0;
        System.out.println(ans);
    */



        // switch case example

        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }

}
