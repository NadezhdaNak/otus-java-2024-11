package ru.otus.processor.homework.exception;

public class ProcessorTimeException extends RuntimeException {
    public ProcessorTimeException(String message) {
        super(message);
    }

    public ProcessorTimeException(Throwable throwable) {
        super(throwable);
    }

}
