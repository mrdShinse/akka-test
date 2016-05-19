/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrdshinse.lerning.akka.batch.woa;

import com.orangesignal.csv.Csv;
import com.orangesignal.csv.CsvConfig;
import com.orangesignal.csv.handlers.StringArrayListHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mrdshinse.lerning.akka.batch.AbstractBatch;
import mrdshinse.lerning.akka.config.BatchConfig;
import mrdshinse.lerning.akka.csv.ItemCsv;

/**
 *
 * @author mrdShinse
 */
public class BatchWithoutAkka extends AbstractBatch {

    @Override
    public void exe() {
        BufferedReader br = null;
        br = BatchConfig.getCsvReader(testCsv1);
        process(testCsv1, resultCsv1);

        br = BatchConfig.getCsvReader(testCsv2);
        process(testCsv2, resultCsv2);
    }

    @Override
    protected String getClassName() {
        return this.getClass().getName();
    }

    private void process(File in, File out) {
        List<String[]> list = null;
        CsvConfig config = new CsvConfig();
        config.setIgnoreEmptyLines(true);
        try {
            list = Csv.load(in, config, new StringArrayListHandler());
        } catch (IOException ex) {
            Logger.getLogger(BatchWithoutAkka.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<ItemCsv> processedList = new ArrayList<>();
        for (String[] csv : list) {
            String key = csv[0];
            processedList.add(new ItemCsv(key, csv[1]));
            processedList.add(new ItemCsv(key, csv[2]));
            processedList.add(new ItemCsv(key, csv[3]));
            processedList.add(new ItemCsv(key, csv[4]));
            processedList.add(new ItemCsv(key, csv[5]));
            processedList.add(new ItemCsv(key, csv[6]));
            processedList.add(new ItemCsv(key, csv[7]));
            processedList.add(new ItemCsv(key, csv[8]));
            processedList.add(new ItemCsv(key, csv[9]));
            processedList.add(new ItemCsv(key, csv[10]));
            processedList.add(new ItemCsv(key, csv[11]));
            processedList.add(new ItemCsv(key, csv[12]));
            processedList.add(new ItemCsv(key, csv[13]));
            processedList.add(new ItemCsv(key, csv[14]));
            processedList.add(new ItemCsv(key, csv[15]));
            processedList.add(new ItemCsv(key, csv[16]));
            processedList.add(new ItemCsv(key, csv[17]));
            processedList.add(new ItemCsv(key, csv[18]));
            processedList.add(new ItemCsv(key, csv[19]));
            processedList.add(new ItemCsv(key, csv[20]));
            processedList.add(new ItemCsv(key, csv[21]));
            processedList.add(new ItemCsv(key, csv[22]));
            processedList.add(new ItemCsv(key, csv[23]));
            processedList.add(new ItemCsv(key, csv[24]));
            processedList.add(new ItemCsv(key, csv[25]));
            processedList.add(new ItemCsv(key, csv[26]));
            processedList.add(new ItemCsv(key, csv[27]));
            processedList.add(new ItemCsv(key, csv[28]));
            processedList.add(new ItemCsv(key, csv[29]));
            processedList.add(new ItemCsv(key, csv[30]));
            processedList.add(new ItemCsv(key, csv[31]));
            processedList.add(new ItemCsv(key, csv[32]));
            processedList.add(new ItemCsv(key, csv[33]));
            processedList.add(new ItemCsv(key, csv[34]));
            processedList.add(new ItemCsv(key, csv[35]));
            processedList.add(new ItemCsv(key, csv[36]));
            processedList.add(new ItemCsv(key, csv[37]));
            processedList.add(new ItemCsv(key, csv[38]));
            processedList.add(new ItemCsv(key, csv[39]));
            processedList.add(new ItemCsv(key, csv[40]));
            processedList.add(new ItemCsv(key, csv[41]));
            processedList.add(new ItemCsv(key, csv[42]));
            processedList.add(new ItemCsv(key, csv[43]));
            processedList.add(new ItemCsv(key, csv[44]));
            processedList.add(new ItemCsv(key, csv[45]));
            processedList.add(new ItemCsv(key, csv[46]));
            processedList.add(new ItemCsv(key, csv[47]));
            processedList.add(new ItemCsv(key, csv[48]));
            processedList.add(new ItemCsv(key, csv[49]));
        }
        list = null;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(out);
        } catch (IOException ex) {
            Logger.getLogger(BatchConfig.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ItemCsv csv : processedList) {
            pw.println(csv);
        }
        pw.close();

    }

}
