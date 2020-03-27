package org.example;
import org.junit.Before;
import org.junit.Test;


public class PointToTest {
    public PointTo analyzer;

    @Before
    public void beforeTest() {
        analyzer = new PointTo();
        PointTo.cp = "C:\\Program Files\\Java\\jdk1.8.0_131\\jre\\lib\\rt.jar";
    }

    @Test
    public void assignment() {
        PointTo.pp = "CODE\\assignment";
        System.out.println("assignment");
        analyzer.analyze(PointTo.cp, PointTo.pp);
        System.out.println("suss");
    }

    @Test
    public void store() {
        PointTo.pp = "CODE\\store";
        System.out.println("store");
        analyzer.analyze(PointTo.cp, PointTo.pp);
        System.out.println("suss");
    }

    @Test
    public void load() {
        PointTo.pp = "CODE\\load";
        System.out.println("load");
        analyzer.analyze(PointTo.cp, PointTo.pp);
        System.out.println("suss");
    }

    @Test
    public void call() {
        PointTo.pp = "CODE\\call";
        System.out.println("call");
        analyzer.analyze(PointTo.cp, PointTo.pp);
        System.out.println("suss");
    }
}

