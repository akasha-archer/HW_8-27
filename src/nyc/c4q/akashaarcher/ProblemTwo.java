package nyc.c4q.akashaarcher;

/*
Write a method named calculateAge that takes two arguments: birth year and current year.
The method should then calculate the two possible ages based on that year, and return the result
 in the following format: (replacing 'NN' with the possible years) : "You are either NN or NN."
 */

// [] > brackets, {} > braces, () > parentheses

/**
 * Created by akashaarcher on 8/28/16.
 */
public class ProblemTwo {
    public static void main(String[] args){
        System.out.print(calculateAge(1987, 2016));
    }

    public static String calculateAge(int birthYear, int currentYear) {
        int age = currentYear - birthYear;
        int age2 = age - 1;
        String answer = "You are either " + age2 + " or " + age + ".";
        return answer;
    }
}
