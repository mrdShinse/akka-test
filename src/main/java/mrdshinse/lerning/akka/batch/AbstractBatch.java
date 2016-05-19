/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrdshinse.lerning.akka.batch;

import java.io.File;
import java.util.Date;

/**
 *
 * @author mrdShinse
 */
public abstract class AbstractBatch implements Batch {

    protected static File testCsv1 = new File("/tmp/learning_akka/001.csv");
    protected static File testCsv2 = new File("/tmp/learning_akka/002.csv");

    protected static File resultCsv1 = new File("/tmp/learning_akka/r001.csv");
    protected static File resultCsv2 = new File("/tmp/learning_akka/r002.csv");

    @Override
    public void execute() {
        System.out.println("_____" + getClassName() + " is start.");
        Date start = new Date();
        exe();
        Date end = new Date();
        Long msec = end.getTime() - start.getTime();
        System.out.println("_____" + getClassName() + " is end with " + msec + "msec.");
    }

    protected abstract void exe();

    protected abstract String getClassName();
}
