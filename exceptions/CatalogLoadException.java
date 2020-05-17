package ru.billing.exceptions;

public class CatalogLoadException extends Exception {
    public CatalogLoadException() {
        super("Can not load catalog");
    }
    public CatalogLoadException(Throwable throwable) {
        super("Unable to load catalog", throwable);
    }
