module academy.learnprogramming.db {
    requires java.sql;
//This is the name of the library (founded in Project Structure window - like sqllite-jdbc-3.21.0) without version
    requires sqlite.jdbc; //This is a AUTOMATIC module, a directly .jar file
//transitive makes the required dependency accessible by modules that requires this module (db module)
    requires transitive academy.learnprogramming.common;

    exports academy.learnprogramming.db;
}