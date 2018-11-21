module academy.learnprogramming.db {
    requires java.sql;
//This is the name of the library (founded in Project Structure window - like sqllite-jdbc-3.21.0) without version
    requires sqlite.jdbc;
    requires academy.learnprogramming.common;

    exports academy.learnprogramming.db;
}