package sixweek;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<String> records;

    public Record() {
        records = new ArrayList<>();
    }

    public synchronized void addRecord(String record) {
        records.add(record);
    }

    public synchronized List<String> getRecords() {
        return new ArrayList<>(records);
    }
}