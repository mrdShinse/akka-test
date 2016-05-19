/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrdshinse.lerning.akka.batch.wha;

import java.io.BufferedReader;
import mrdshinse.lerning.akka.batch.AbstractBatch;
import mrdshinse.lerning.akka.config.BatchConfig;

/**
 *
 * @author mrdShinse
 */
public class BatchWithAkka extends AbstractBatch {

    @Override
    public void exe() {
        BufferedReader br = BatchConfig.getCsvReader(testCsv1);
        br = BatchConfig.getCsvReader(testCsv2);
    }

    @Override
    protected String getClassName() {
        return this.getClass().getName();
    }

}
