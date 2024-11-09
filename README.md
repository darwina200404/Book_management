## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
# Book Management System

A simple Java-based **Book Management System** that demonstrates Object-Oriented Programming (OOP) concepts. The system allows users to manage a collection of books, including adding, removing, and displaying details of different types of books like **Books**, **EBooks**, and **AudioBooks**.

## Features

- **Book**: Represents a basic book with attributes like title, author, price, and ISBN.
- **EBook**: Extends the `Book` class to add the file size for an eBook.
- **AudioBook**: Extends the `Book` class to add the duration of the audiobook.
- **Library**: A collection of books, with methods to add, remove, and display books.
  
## Project Structure

The project consists of the following files:

- **Book.java**: The base class representing a book.
- **EBook.java**: A subclass of `Book` representing an eBook.
- **AudioBook.java**: A subclass of `Book` representing an audiobook.
- **Library.java**: Contains a collection of books with methods to manage the library.
- **BookManagementSystem.java**: The main class where the program execution begins.

## Prerequisites

- Java Development Kit (JDK) installed (version 8 or higher).
- Visual Studio Code (VS Code) with Java extensions installed for coding and running the project.

## Setup Instructions

1. **Clone or Download the Project**:
   - Clone the repository to your local machine or download the project as a ZIP file.

2. **Install Java**:
   - Make sure you have Java installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html).

3. **Set up VS Code**:
   - Install Visual Studio Code (VS Code) from [here](https://code.visualstudio.com/).
   - Install the **Java Extension Pack** in VS Code. (Go to the Extensions view in VS Code and search for "Java Extension Pack" by Microsoft.)

4. **Open the Project**:
   - Launch VS Code and open the project folder.

5. **Compile and Run**:
   - Open a terminal in VS Code (`Ctrl + Shift + `).
   - Navigate to the `src` folder using the `cd src` command.
   - Compile the Java files:
     ```bash
     javac *.java
     ```
   - Run the program:
     ```bash
     java BookManagementSystem
     ```

## Example Usage

The system allows you to manage books in the library. Here’s an example of adding and displaying books:

```java
Library library = new Library();
Book book1 = new Book("Java Fundamentals", "John Doe", 29.99, "ISBN12345");
EBook ebook = new EBook("Effective Java", "Joshua Bloch", 19.99, "ISBN67890", 2.5);
AudioBook audiobook = new AudioBook("Clean Code", "Robert C. Martin", 24.99, "ISBN11223", 6.5);

library.addBook(book1);
library.addBook(ebook);
library.addBook(audiobook);

library.displayAllBooks();
