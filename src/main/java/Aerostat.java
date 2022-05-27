import java.util.ArrayList;
import java.util.List;

public class Aerostat {
    private ArrayList<Person> prs;
    private double wind;
    private double height;

    public Aerostat () {
    }

    public boolean setPeople(ArrayList<Person> prs) {
        double sum = 0.0;
        for (int i = 0; i < prs.size(); i++) {
            sum += prs.get(i).getMass();
        }

        if (prs.size() > 0 && prs.size() <=3 && sum >= 40.0 && sum <= 300) {
            this.prs = prs;
            return true;
        } else {
            return false;
        }
    }

    public int getCount() {
        return prs.size();
    }

    public double getMass() {
        double sum = 0.0;
        for (int i = 0; i < prs.size(); i++) {
            sum += prs.get(i).getMass();
        }
        return sum;
    }

    public boolean setHeight(double h) {
        if (h <= 1000) {
            this.height = h;
            return true;
        } else {
            return false;
        }
    }

    public double getHeight() {
        return height;
    }

    public boolean setWind(double v) {
        if (v > 4) {
            this.wind = v;
            return true;
        } else {
            return false;
        }
    }

    public double getWind() {
        return wind;
    }
}