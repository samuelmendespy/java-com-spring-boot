package me.dio.santander_dev_week_2023.service.exception;

public class NotFoundException extends BusinessException{

    private static final long SerialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }
}
