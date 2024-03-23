# JPA-Hibernate_ManyToManyMapping
This project is used to demonstrate the mapping of two tables using JPA/Hibernate with _**@ManyToMany**_ mapping annotation.

For running this application, use **spring boot** version 3.2 and **JAVA** of version 17.
Create tables instructor, instructor_detail, course, review, student. For their columns, create according to column defination in entity class respectively.

This example will show all the mapping techniques. <br> 
**@OneToOne** mapping <br> 
**@OneToMany**, **@ManyToOne** mapping <br>
**@ManyToMany** mapping. <br>

For focusing on **@ManyToMany** mapping, look for **student** and **course** tables.

For mapping, we have used one **Join table**.

**Join table** contains the reference key for both the tables used for joining.


In main application file(AdvanceMappingApplication), there are many methods created in commandLineRunner method.
These methods are used to demonstrate CRUD operation in both the tables.

This example not only demonstrate the joining of tables using **_@ManyToMany_** mapping, but also shows the use of cascading and Fetch.

<br> 

**Cascading** is use to perform same operations in both the tables.
<br> 
There are different types of cascading.

**All** -> Use to perform all the CRUD operation which is perform on 1 table to be performed on the other table also. <br> 
**Remove** -> If delete operation is performed on 1 table, then it will also be performed on the other table.
 <br> 
**Persist** -> if save operation is performed on 1 table, then it will also be performed on the other table.
 <br> 
and many more..

<br> 

**FetchMode** defines how **Hibernate** will fetch the data.
<br> 
There are two type: Eager and Lazy.

In **eager** loading strategy, if we load one table data, it will also load up all other data associated with it and will store it in a memory.

In **lazy** loading, if we load one table data, it will not load up other data associated with it into a memory until we make an explicit call to it.

<br>

<br>

**Note:** If you get an error **"filename is too long"** while taking a pull or while committing your code by using command prompt, then use the below command before adding your files to git.
<br>
git config core.logpaths true
