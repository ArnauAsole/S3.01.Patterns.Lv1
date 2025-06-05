# S3.01.Patterns.Lv1

# 🔁 Command Manager using Singleton Pattern

## 📄 Description - Exercise Statement

This exercise implements the **Singleton design pattern** to manage a command history, with functionalities similar to `undo` and `history`.

The application is organized into the following classes:
- `Order`: represents a user-entered command.
- `Undo`: a Singleton class that stores commands and allows undo functionality.
- `ConsoleMenu`: handles the user interaction through the command line.
- `Main`: entry point of the program.

**Summary of the exercise statement:**
> Create a class that mimics the behavior of the 'Undo' command. It must support adding, undoing, and listing commands. The class must implement the Singleton pattern and be used from a `Main` class with console interaction.

---

## 💻 Technologies Used

- 🧠 **Java 17** (or later)
- 💡 **IntelliJ IDEA** as the development environment
- ☕ **JDK** (Java Development Kit)
- 📚 Java Standard Library (e.g., `Stack`, `List`)
- 🔗 **Git** and **GitHub** for version control

---

## 📋 Requirements

- Java 17 or higher installed
- IntelliJ IDEA (recommended)
- Maven or Gradle (optional, if used for dependency management)
- Internet connection (for dependency downloading if needed)
- GitHub account to clone or fork the repository

---

## 🛠️ Installation

1. Clone the repository from GitHub:

   ```bash
   git clone https://github.com/username/command-manager.git
Open the project in IntelliJ IDEA:

Go to File > Open... and select the project folder.

Ensure the correct JDK is configured:

File > Project Structure > Project SDK

Build the project via Build > Build Project

▶️ Running the Project

Once the project is open in IntelliJ:

Open the Main.java file.

Click the green Run button (or press Ctrl+Shift+F10) to start the program.

Use the command-line interface:

Type any command to add it to history.

Type undo to remove the last command.

Type history to view the command history.

Type sortir to exit the application.

🌐 Deployment

This project is intended for educational/command-line use only and is not designed for deployment on web or server environments.

However, if needed:

You can package it into a .jar file using IntelliJ (File > Project Structure > Artifacts)

Run it using:

```
java -jar command-manager.jar
```

🤝 Contributing

All contributions are welcome! To contribute:
Marc, Ana, Javier, Ignasi, Alejandro, Vanina, Meritxell.

🔗 Git Hub Repository:

https://github.com/ArnauAsole/S3.01.Patterns.Lv1.git
