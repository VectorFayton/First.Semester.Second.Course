package Logging_System_With_Factory_Method;

import java.util.Scanner;

abstract class Logger {
    abstract void Log(String message);
}

class ConsoleLogger extends Logger{
    @Override
    void Log(String message) {
        System.out.printf("Console message: %s \n", message);
    }
}

class FileLogger extends Logger{
    @Override
    void Log(String message) {
        System.out.printf("File created with content: %s \n", message);
    }
}

class DatabaseLogger extends Logger{
    @Override
    void Log(String message) {
        System.out.printf("Added to the database: %s \n", message);
    }
}

interface LoggerFactory {
    Logger createLogger();
}

class ConsoleLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}

class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        LoggerFactory logger_factory = null;
        System.out.print("Logger Type: ");
        String logger_type = Input.next();
        Input.nextLine();
        System.out.print("Message: ");
        String message = Input.nextLine();
        if (logger_type.contains("Console")){
            logger_factory = new ConsoleLoggerFactory();
        } else if (logger_type.contains("File")) {
            logger_factory = new FileLoggerFactory();
        } else if (logger_type.contains("Database")) {
            logger_factory = new DatabaseLoggerFactory();
        } else {
            System.out.println("Invalid logger type");
        }

        if (logger_factory != null){
            Logger logger = logger_factory.createLogger();
            logger.Log(message);
        }
    }
}