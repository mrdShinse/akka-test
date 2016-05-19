/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrdshinse.lerning.akka.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mrdShinse
 */
public class BatchConfig {

    public static BufferedReader getCsvReader(File file) {
        BufferedReader br = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
                createTestFile(file);
            }
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(BatchConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return br;
    }

    private static void createTestFile(File file) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (IOException ex) {
            Logger.getLogger(BatchConfig.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < 1000; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            for (int j = 0; j < 50; j++) {
                sb.append(",").append(j);
            }
            pw.println(sb);
        }
        pw.close();

    }
}
