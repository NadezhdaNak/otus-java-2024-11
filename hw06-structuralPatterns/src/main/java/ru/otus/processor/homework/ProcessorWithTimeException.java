package ru.otus.processor.homework;

import ru.otus.model.Message;
import ru.otus.processor.Processor;
import ru.otus.processor.homework.exception.ProcessorTimeException;

public class ProcessorWithTimeException implements Processor {
    private final TimeProvider timeProvider;

    public ProcessorWithTimeException(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    @Override
    public Message process(Message message) {
        if (timeProvider.get().getSecond() % 2 == 0) {
            throw new ProcessorTimeException("Попали на четную секунду");
        }
        return message;
    }

}
