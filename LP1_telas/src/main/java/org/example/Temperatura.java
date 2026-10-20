
package org.example;

import java.util.List;

public class Temperatura {

    String temperatura(List<Integer> temperaturas) {

        int soma = 0;
        String cond;

        for (int i = 0; i < temperaturas.size(); i++) {
            soma += temperaturas.get(i);
        }

        double media = soma / 12.0;

        if (media < 18) {
            cond = "fria";
        } else {
            cond = "agradável";
        }

        return "A temperatura média do ano em SJC foi "
                + String.format("%.2f", media)
                + "°C, sendo considerada " + cond + ".";

    }
}
