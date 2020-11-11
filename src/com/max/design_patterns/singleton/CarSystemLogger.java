package com.max.design_patterns.singleton;

public class CarSystemLogger {
    private static CarSystemLogger carSystemLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized CarSystemLogger getCarSystemLogger() {
        if (carSystemLogger == null) {
            carSystemLogger = new CarSystemLogger();
        }
        return carSystemLogger;
    }

    private CarSystemLogger() {
    }

    public void addCarSystemLogger(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showCarSystemLogger() {
        System.out.println(logFile);
    }
}
