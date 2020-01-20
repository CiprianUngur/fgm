package lab3.Calculator;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyText(String text, String text2) {
        if (text.equals("FastTrack") && !text2.equals("Test")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public void verifyNumber(int first) {
        if (first >= 2 && first <= 8) {
            System.out.println(first);
        }
    }

    public String verifyNrTxt(String text3, int z) {
        if (text3.equals("FastTrack ") && z <= 3) {
            return (text3 + z);
        }else {
            return ("Text and number aren't ok");
        }
    }
    public void checkNumber(int number) {
        if (number > 8 || number == 6) {
            System.out.println("The amount of snow this winter was (cm): " + number);
        } else {
            System.out.println("The forecast snow is(cm): " + number);
        }
    }
    public void anotherNumber(int number){
        if (number >3 && !(number == 4)) {
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            System.out.println("The number is equal to 4");
        }
    }
    public void switches(int first){
        switch (first) {
            case 5:
                System.out.println("The number is: 5 !");
                break;
        }

    }
}
