package task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {
    private StringBuilder storage;

    private CrazyLogger() {
        this.storage = new StringBuilder("Logger is created: ")
        .append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm")))
        .append("\n");
    }

    public void writeLog(String message) {
        storage.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm")))
        .append(" - ")
        .append(message)
        .append("\n");
    }

    public String getStorageString(){
        return storage.toString();
    }

    public String getAllLogsPerDay() {
        return this.getAllLogsPerDay(LocalDate.now().format(DateTimeFormatter.ofPattern("d-MM-yyyy")));
    }

    public String getAllLogsPerDay(String date){
        StringBuilder resultString = new StringBuilder();
        String[] logStringArray = storage.toString().split("\n");
        for(String log : logStringArray){
            if(log.startsWith(date)){
                resultString.append(log).append("\n");
            }
        }
        return resultString.toString();
    }

    public String getAllLogsPerHour() {
        return this.getAllLogsPerDay(LocalDateTime.now().format(DateTimeFormatter.ofPattern("d-MM-yyyy : hh")));
    }

    public String getLogsByMessage(String message) {
        StringBuilder resultString = new StringBuilder();
        String[] logStringArray = storage.toString().split("\n");
        for (String log : logStringArray) {
            if (log.contains(message)) {
                resultString.append(log).append("\n");
            }
        }
        return resultString.toString();
    }
}
