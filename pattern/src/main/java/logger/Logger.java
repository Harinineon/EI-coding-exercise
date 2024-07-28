package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    public enum LogLevel {
        INFO, ERROR, WARNING
    }

    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("application.log", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message, LogLevel level) {
        writer.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " " + level + ": " + message);
    }

    public void logTransaction(String customerName, String transactionId, String orderDetails, String paymentMethod, double amount) {
        String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        writer.println(dateTime + " | Customer: " + customerName + " | Transaction ID: " + transactionId + " | Order: " + orderDetails + " | Payment Method: " + paymentMethod + " | Amount: $" + amount);
    }

    public void close() {
        writer.close();
    }
}
