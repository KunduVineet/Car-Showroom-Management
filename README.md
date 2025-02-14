# Car Showroom Management System  

This Java-based application is a **Car Showroom Management System** designed to manage showrooms, employees, and cars. It provides functionalities to add and display details about showrooms, employees, and cars using an object-oriented approach.

---

## Table of Contents  
- [Features](#features)  
- [Class Structure](#class-structure)  
- [Interface](#interface)  
- [Installation](#installation)  
- [Usage](#usage)  
- [Example](#example)  
- [License](#license)  

---

## Features  
- Add a new showroom with details such as name, address, total employees, and manager's name.  
- Add employees to a showroom, including details like name, department, and age.  
- Add cars to the showroom with information like model, color, price, and car ID.  
- Display details of all showrooms, employees, and cars.  
- Easy-to-use console-based menu system.  

---

## Class Structure  
The project consists of the following classes:  

1. **Showroom**  
   - Stores and manages information about the showroom.  
   - Implements the `utility` interface.  
   - Contains attributes like showroom name, address, total employees, total cars, and manager's name.  
   - Methods:  
     - `set_details()` - Accepts user input for showroom details.  
     - `get_details()` - Displays showroom details.  

2. **Cars** (Inherits from `Showroom`)  
   - Manages car details within a showroom.  
   - Contains attributes like car ID, model, color, price, and name.  
   - Methods:  
     - `set_details()` - Accepts user input for car details and increments the total cars in the showroom.  
     - `get_details()` - Displays car details.  

3. **Employees** (Inherits from `Showroom`)  
   - Manages employee information within a showroom.  
   - Contains attributes like employee ID, name, department, and age.  
   - Methods:  
     - `set_details()` - Accepts user input for employee details and generates a unique employee ID using `UUID`.  
     - `get_details()` - Displays employee details.  

4. **Main**  
   - The entry point of the application.  
   - Contains the main menu and control flow for the application.  
   - Manages arrays of `Showroom`, `Employees`, and `Cars` objects.  

---

## Interface  
### utility  
An interface that defines the blueprint for classes:  
```java
interface utility {
    public void get_details();
    public void set_details();
}
```
All classes (`Showroom`, `Cars`, and `Employees`) implement this interface to ensure they provide implementations for `get_details()` and `set_details()` methods.

---

## Installation  
To run this project locally:  
1. Make sure you have JDK (Java Development Kit) installed.  
2. Clone the repository or download the source files.  
3. Compile the Java files using:  
    ```sh
    javac Main.java
    ```
4. Run the application:  
    ```sh
    java Main
    ```

---

## Usage  
1. On running the application, the main menu will be displayed:  
    ```
    Welcome to Car Showroom Management System

    Enter your choice

    1. Add Showroom             2. Add Employees             3. Add Car
    4. Get Showroom             5. Get Employees             6. Get Car

    Enter 0 to exit
    ```
2. Choose an option by entering the corresponding number.  
3. Follow the prompts to enter details.  
4. To view details, select options 4, 5, or 6.  
5. Enter `0` to exit the application.

---

## Example  
```plaintext
Welcome to Car Showroom Management System

Enter your choice

1. Add Showroom             2. Add Employees             3. Add Car
4. Get Showroom             5. Get Employees             6. Get Car

Enter 0 to exit
1

Enter Showroom Name:
Auto World
Enter Showroom Address:
123 Main Street
Enter Total Employees:
10
Enter Manager Name:
John Doe

1. Add new Showroom
2. Go Back to the Main Menu
2

Welcome to Car Showroom Management System
...
```

---

## License  
This project is licensed under the MIT License.
