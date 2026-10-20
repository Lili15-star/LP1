
package org.example;

public class Multiplo {

    String identificarmultiplo(int num1, int num2) {

        if (num2 % num1 == 0) {
            return "O segundo número é múltiplo do primeiro";
        } else {
            return "O segundo número não é múltiplo do primeiro";
        }
    }
}
