1) Why did you use ArrayList instead of an array?

I used ArrayList instead of an array because:

The number of students, courses, and enrollments is not fixed

ArrayList provides dynamic resizing, whereas arrays have a fixed size

ArrayList offers built-in methods like:

add(),remove(),size(),iteration using enhanced for loop.
Using an array would require:
Manual resizing,Extra logic to track count,More complex code

*********************************************************************************
2)Where did you use static members and why?

I used static members in the IdGenerator utility class.
1)ID generation must be shared across the entire application

2)Static members belong to the class, not individual objects

3)Ensures unique IDs for students, courses, and enrollments

4)No need to create an object of IdGenerator

5)Using static avoids duplication and keeps ID logic centralized and consistent.

***********************************************************************************

3)Where did you use inheritance and what did you gain from it?

I used in Student class --> Student extends Person
1)Code reusability: common fields (name, email) are written only once

2)Cleaner design: avoids duplication in multiple classes

3)Logical modeling: a Student is a Person (real-world relationship)

4)Easy extensibility: future classes like Instructor can also extend Person

5)Inheritance helped me design the system in a structured, scalable, and object-oriented way.

********************************************************************************************