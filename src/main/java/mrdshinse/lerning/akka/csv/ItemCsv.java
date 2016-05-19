/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrdshinse.lerning.akka.csv;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

/**
 *
 * @author mrdShinse
 */
@CsvEntity
public class ItemCsv {

    public ItemCsv(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @CsvColumn(name = "key")
    public String key;
    @CsvColumn(name = "value")
    public String value;
}
