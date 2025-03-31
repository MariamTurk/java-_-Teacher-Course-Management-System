# Teacher Course Management System in Java

This project provides a simple Java-based application to manage teacher profiles, their course assignments, and salary calculations. The system allows the user to interactively enter data about teachers and their courses, compute extra payments based on course levels, and perform basic administrative tasks such as viewing teacher info and modifying salaries.


## 📦 Project Structure

```java
ass2/
├── Course.java         // Class to represent a course with name and ID
├── Teacher.java        // Class to represent a teacher with salary and courses
└── Testclass.java      // Main class to interact with the user and execute tasks

## 🧠 Features
Add multiple teachers and their courses

Calculate extra payments based on course ID level:

The first digit of the course ID represents its level (1 to 4)

Print detailed teacher info including courses and salaries

Update a teacher’s basic salary

Display the total salaries for all teachers

Menu-driven CLI for user interaction

## 💼 How Extra Payment is Calculated
Each course contributes to extra pay depending on its level:

Extra = level × extraPaymentRate
Total Extra Payment = sum of extra for each course
Example:
If a teacher teaches a course with ID starting with 2 and their extra rate is 100, the extra pay is: 2 × 100 = 200.

## 📋 Example CLI Menu
Enter your choice of tasks (1-5):
1 - Print teacher info by ID
2 - Display all teacher names and total salaries
3 - Change basic salary for a teacher
4 - Display sum of total salaries for all teachers
5 - Exit


