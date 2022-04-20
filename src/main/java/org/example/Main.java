package org.example;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.List;
import java.util.Scanner;

import static org.example.additionalOperations.areBracketsBalanced;
import static org.example.additionalOperations.numberCount;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your expression");
        Scanner scan = new Scanner(System.in);
        String exp = scan.nextLine();

        if(areBracketsBalanced(exp)) {

            Expression expression = new ExpressionBuilder(exp).build();
            if (expression.validate().isValid()) {
                System.out.println("result of your expression is: " + expression.evaluate());
                System.out.println("numbers count is: " + numberCount(exp));
            } else {
                List<String> errors = expression.validate().getErrors();
                for (int i = 0; i < errors.size(); i++) {
                    System.out.println(errors.get(i));
                }

            }
        }
        else {
            System.out.println("brackets are not correct");
        }
    }
}