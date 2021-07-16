package importing;

import java.util.Date;

/*
 * by default, the JVM will search for code within the
 * same package a class is defined, within the java.lang
 * package (which is automatially imported) and any class 
 * that you specifically state an import statement for.
 * Note that the import statement takes precedence over
 * the automatically imported information!
 */
// import java.util.Date; formats as Wed Dec 31 18:00:00 CST 1969
// import java.sql.Date; formats as 1969-12-31


public class Simulator {

	public static void main(String[] args) {
		Date d = new Date (60000);
		System.out.println(d);

	}

}
