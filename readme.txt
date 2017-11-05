Installation needed:
Java 1.8
Apache Maven 4.0.0

Instructions for importing the program in eclipse
1) import the project as existing maven project in eclipse
2) set the jre as jre8 under Project-> Properties->Java Build path ->Libraries
3) Set the Project Facets under Properties-> Project Facets as java 8
4) Right Click on the project -> Maven -> Update Project.
   Ensure that there are no errors seen in the project.

Instructions to execute the program.

1) Right click on the Project and Run As -> Run Configurations .
   Under the Goals type clean install.
   Ensure that the are is set as jre8.
   Click on Run.

2) Check the console. The build should be successful.

3) Run the file DrawExample.java  and start executing the commands. 