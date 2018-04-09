package code;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Congruential {

    private long x, a, c, m;
    private String[][] result, resultTemp;

    public Congruential(long x, long a, long c, long m) {
        this.x = x;
        this.a = a;
        this.c = c;
        this.m = m;
        this.result = new String[0][5];
    }

    public Congruential(long x, long a, long m) {
        this.x = x;
        this.a = a;
        this.c = 0;
        this.m = m;
        this.result = new String[0][5];
    }

    public void calculate() {
        boolean flag = true;
        pushResult(0, x);
        while (flag) {
            long prevX = x;
            if (m > 0) {
                x = (a * prevX + c) % m;
            } else {
                JFrame frame = new JFrame("Alerta");
                JOptionPane.showMessageDialog(frame, "m no puede ser 0");
            }
            if (isOnArray(x)) {
                flag = false;
            }
            pushResult(prevX, x);
        }
    }

    private void pushResult(long prevX, long x) {
        resultTemp = result;
        int size = resultTemp.length;
        result = new String[size + 1][5];

        for (int i = 0; i < size; i++) {
            System.arraycopy(resultTemp[i], 0, result[i], 0, 5);
        }

        if (resultTemp.length != 0) {
            result[size][0] = size + "";
            if (c == 0) {
                result[size][1] = "( " + a + " * " + prevX + " ) mod " + m;
                result[size][2] = a * prevX / m + " + " + a * prevX % m + "/" + m;
            } else {
                result[size][1] = "( " + a + " * " + prevX + " + " + c + " ) mod " + m;
                result[size][2] = (a * prevX + c) % m + " + " + (a * prevX + c) % m + "/" + m;
            }
            result[size][3] = x + "";
            result[size][4] = (double) x / m + "";
        } else {
            result[size][0] = size + "";
            result[size][1] = "";
            result[size][2] = "";
            result[size][3] = x + "";
            result[size][4] = "";
        }
    }

    public String hullDobell() {
        boolean firstRule = false;
        boolean secondRule = false;
        String message = "No es periodo completo.";
        long q = a - 1;

        // ####### FIRST RULE #######
        if (getGCD(c, m) == 1) {
            firstRule = true;
        }

        // ####### SECOND RULE #######
        if (firstRule) {
            long count = q;
            while (count > 1) {
                if (q % count == 0) {
                    if (m % count == 0) {
                        secondRule = true;
                    } else {
                        secondRule = false;
                        count = 1;
                    }
                }
                count--;
            }
        }

        // ####### THIRD RULE #######
        if (secondRule) {
            if (q % 4 == 0 && m % 4 == 0) {
                message = "Es periodo completo.";
            }
        }

        return message;
    }

    public long getGCD(long a0, long b0) {
        if (b0 == 0) {
            return a0;
        }
        return getGCD(b0, a0 % b0);
    }

    private boolean isOnArray(long x) {
        boolean flag = false;
        for (int i = 0; i < result.length; i++) {
            if (Long.parseLong(result[i][3]) == x) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public String[][] getArray() {
        return result;
    }

    private void printArray() {
        for (String[] array : result) {
            for (String element : array) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

}
