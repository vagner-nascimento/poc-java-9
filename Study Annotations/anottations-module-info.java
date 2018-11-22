module exemple.with.annotations {
    requires java.sql;
/*
This is a AUTOMATIC module, a directly .jar file
The name is the same founded in Project Structure window (like sqllite-jdbc-3.21.0) without version and exchanging "-" for ".", so, sqlite.jdbc
*/
    requires sqlite.jdbc;
//transitive makes the required dependency accessible by modules that requires this module (db module)
    requires transitive academy.learnprogramming.common;
/*
esports module is the only way to other application's modules can see and use that (In this case, it is used in module "db")
*/
    exports academy.learnprogramming.common;
/*
export =  make a module accessible to other modules.
In this case, Java packages needs to access my module to launch the application. Otherwise, they can't see that.
*/
    exports academy.learnprogramming.ui to javafx.graphics, javafx.fxml;
/*
opens = make a module be aponned to other modules, so like that they can inject behaviors and values in the
module's classes
That's because the Java's fxml loader needs to set fields in Controller.java
*/
    opens academy.learnprogramming.ui to javafx.fxml;
    opens academy.learnprogramming.common to javafx.base;
}
