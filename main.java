// 07:00 remaining
// main.java
// created and
// open in
// intellij
// used chat google and intellij

// 04:45 remaining:

/*
 * prompt:
 * please give a simple version of a prime checker java file which I can then copy into intellij and there I will use the encapsulate button, where intellij will make it into encapsulated form of the program
 *
 *
 * first answer:
 * public class PrimeChecker {

    public static void main(String[] args) {
        int numberToCheck = 17; // Replace with the number you want to check
        boolean isPrime = checkPrime(numberToCheck);

        if (isPrime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
*
* ######################################
*
* second unencapsulated answer from ChatGPT:
*
* prompt:
* please redo with all in main method no separate checkPrime method
*
* result:
*
* public class PrimeChecker {

    public static void main(String[] args) {
        int numberToCheck = 17; // Replace with the number you want to check
        boolean isPrime = true;

        if (numberToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }
}

* now second result as code
* 02:30 remaining:
 */
public class PrimeChecker {

    public static void main(String[] args) {
        int numberToCheck = 17; // Replace with the number you want to check
        boolean isPrime = true;

        if (numberToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }
}

// +2 min 0041
// end 0039 Friday 08/12/2023
// start 0024 hours Friday 08/12/2023


