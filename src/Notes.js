/**
 * !clone the repo to the JAVA folder
 * ! cd into application
 * ! mkdir 'name of the app' (skip if cloning a repo)
 * ! mkdir src - creates a sorce folder that is required for JAVA apps
 * ! mkdir 'name of the app goes here again' no hyphens or antyhing can go in app name
 * ! make a 'Main.java' file inside of the new app folder. create the package here. package 'exact app file name goes here' ;
 * ? public class Main { 
 * !braces can goe either on the previous line or spaced down a line 
 * ? }
 * TODO every java class has a "public static void main" code example     "public static void main(String[] args)} " this code is a METHOD"
 * ? even if there are no args to go inside of the () you still have to add them into the code
 * TODO to compile the source code: javac 'name of the package' /*.java YOU MUST CD INTO THE SRC FILE TO RUN THE JAVA COMPILER
 * ? Take our JAVA and create a JAVA archived file. A jar file:  
 ** c – create new archive file with given name
** v – generate verbose output
** f – specifies the jar output file to be created
** e – sets the main class also called the entry point
** must include where the main class can be found, all of our class files...
*! example code : jar cvfe javaSnackBar.jar javaSnackBar.Main javaSnackBar/*.class
*? now run the jar file java -jar javaSnackBar.jar
*TODO inside the packge folder (the main app folder) create your new files. The class name has to match the name of the file. 
*?now the fields acn be created. Classes always stat with a capital letter. 
** to make specific fields available to the rest of the code, we need to create 'getters' and 'setters'. The getter method returns the value of the attribute. The setter method takes a parameter and assigns it to the attribute.
*?constructors do not need a return value. There is no return type and it's the EXACT SAME NAME AS THE CLASS!!! you will need to set up the "this.fname" again. 
* !if you don't create getters and setters anyone in the application can have access to change your code. You will see this done a lot even though it is poor practice. do not do this. 
** There is a lot of preplanning in JAVA. Then you get to the code part. Once all of the preplanning is done in seperate files. the actual code is written and used in the Main class. 

*/