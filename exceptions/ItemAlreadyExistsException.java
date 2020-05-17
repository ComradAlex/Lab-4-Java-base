package ru.billing.exceptions;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException() {
        super("Item already exists");
    }
}
