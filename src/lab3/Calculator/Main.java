package lab3.Calculator;

import lab3.Calculator.LogicalOp;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y = 8;

        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(x,y);
        System.out.println("The bigger number is: " + biggest);

        String text = "FastTrack";
        String text2= "Test";
        String result = op.verifyText(text, text2);
        System.out.println(result);

        op.verifyNumber(7);

        String text3 = "FastTrack ";
        int z = 2;
        String result2 = op.verifyNrTxt("FastTrack ",3);
        System.out.println(result2);

        op.checkNumber(8);

        op.anotherNumber(4);

        op.switches(5);


    }


    }


