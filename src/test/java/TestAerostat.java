import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestAerostat {

    Aerostat aer = new Aerostat();

    @Before
    public void before() {
        System.out.println("Test Start");
    }

    // вага менше 400, кількість людей не більше 3
    @Test
    public void Test1() {
        Person prs1 = new Person(20);
        Person prs2 = new Person(30);
        Person prs3 = new Person(40);
        ArrayList<Person> prs = new ArrayList<Person>();
        prs.add(prs1);
        prs.add(prs2);
        prs.add(prs3);
        // sum = 20 + 30 + 40 = 90
        // count = 3
        boolean f = aer.setPeople(prs);
        Assert.assertTrue(f);
    }

    // вага більше 400, кількість людей не більше 3
    @Test
    public void Test2() {
        Person prs1 = new Person(200);
        Person prs2 = new Person(200);
        Person prs3 = new Person(200);
        ArrayList<Person> prs = new ArrayList<Person>();
        prs.add(prs1);
        prs.add(prs2);
        prs.add(prs3);
        // sum = 200 * 3 = 600
        // count = 3
        boolean f = aer.setPeople(prs);
        Assert.assertFalse(f);
    }

    // вага менше 400, кількість більше 3
    @Test
    public void Test3() {
        Person prs1 = new Person(20);
        Person prs2 = new Person(30);
        Person prs3 = new Person(40);
        Person prs4 = new Person(50);
        ArrayList<Person> prs = new ArrayList<Person>();
        prs.add(prs1);
        prs.add(prs2);
        prs.add(prs3);
        prs.add(prs4);
        // sum = 20 + 30 + 40 + 50 = 140
        // count = 4
        boolean f = aer.setPeople(prs);
        Assert.assertFalse(f);
    }

    // вага більше 400, кількість більше 3
    @Test
    public void Test4() {
        Person prs1 = new Person(100);
        Person prs2 = new Person(150);
        Person prs3 = new Person(100);
        Person prs4 = new Person(100);
        ArrayList<Person> prs = new ArrayList<Person>();
        prs.add(prs1);
        prs.add(prs2);
        prs.add(prs3);
        prs.add(prs4);
        // sum = 100 + 150 + 100 + 100 = 450
        // count = 4
        boolean f = aer.setPeople(prs);
        Assert.assertFalse(f);
    }

    // швидкість вітру більше 4 м/с
    @Test
    public void Test5() {
        double v = 10;
        boolean f = aer.setWind(v);
        Assert.assertTrue(f);
    }

    // швидкість вітру меншу 4 м/с
    @Test
    public void Test6() {
        double v = 1;
        boolean f = aer.setWind(v);
        Assert.assertFalse(f);
    }

    // висота не більше 1000
    @Test
    public void Test7() {
        double h = 1000;
        boolean f = aer.setHeight(h);
        Assert.assertTrue(f);
    }

    // висота більше 1000
    @Test
    public void Test8() {
        double h = 1111;
        boolean f = aer.setHeight(h);
        Assert.assertFalse(f);
    }


    @After
    public void after() {
        System.out.println("Test End");
    }

}
