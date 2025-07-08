# CRUD-
CRUD operation using HIBERNATE

All the .java files will be saved inside Java Resources -> src/main/java, inside the java folder we need to create package then we can create a class in it.
Create a folder inside Java Resources -> src/main/resources and name it as META-INF, Inside META-INF create and file and name it as persistence.xml.
In persistence.xml file there are some of the perperties :-
1. (*<property name="javax.persistence.jdbc.driver"
				value="com.mysql.cj.jdbc.Driver" />*) -> This statement establishes the connection between Java and MySQL daatabase.
2. (*<property name="javax.persistence.jdbc.url"
				value="jdbc:mysql://localhost:3306/CRUD?createDatabaseIfNotExist=true" />*)-> This statement creates the database if not exist. Here the databse name is CRUD.
3. <property name="javax.persistence.jdbc.user"
				value="root" /> -> 
