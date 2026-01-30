package pl.test;

import java.util.function.Supplier;

public enum Status {
    NOWA(()->"Nowa"),
    OPLACONA(()->"Opłacona"),
    ANULOWANA(()->"Anulowana");

    private final Supplier<String> status;

    Status(Supplier<String>status) {
        this.status = status;
    }


    public String setOrGetStatus(){
        return status.get();
    }
}
