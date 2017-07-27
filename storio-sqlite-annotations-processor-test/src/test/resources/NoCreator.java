package com.pushtorefresh.storio2.sqlite.annotations;

@StorIOSQLiteType(table = "table")
public class NoCreator {

    @StorIOSQLiteColumn(name = "id", key = true)
    long id() {
        return 0;
    }
}