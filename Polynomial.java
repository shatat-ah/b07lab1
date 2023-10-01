import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Polynomial {

    double[] coeff;
    int expo;

    public Polynomial() {

        this.coeff = new double[] { 0.0 };
        this.expo = new int[] { 0 };

    }

    public Polynomial(double[] c, int[] e) {

        this.coeff = c;
        this.expo = e;

    }

    public Polynomial add(Polynomial a) {

        int coefflen = this.coeff.length;
        int alen = a.coeff.length;

        int max = Math.max(coefflen, alen);
        double[] result = new double[max];

        for (int i = 0; i < coefflen; i++) {
            result[i] += this.coeff[i];
        }

        for (int i = 0; i < alen; i++) {
            result[i] += a.coeff[i];
        }

        return new Polynomial(result);
    }

    public double evaluate(double x) {

        int coefflen = this.coeff.length;
        double result = 0.0;

        for (int i = 0; i < coefflen; i++) {
            result += this.coeff[i] * Math.pow(x, i);
        }

        return result;
    }

    public boolean hasRoot(double x) {

        if (evaluate(x) == 0.0) {
            return true;
        }

        return false;
    }

    public Polynomial multiply(Polynomial a) {

        return new Polynomial(result);
    }

    public savetoFile(String s) {


    }
}