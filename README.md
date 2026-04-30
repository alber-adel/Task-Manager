# Task Manager Application

A simple and user-friendly desktop application for managing your daily tasks. Built with Java and Swing framework.

## Features

- **Add Tasks**: Create new tasks with title, description, due date, and priority level
- **Remove Tasks**: Delete tasks you no longer need
- **Mark Completed**: Mark tasks as done when completed
- **Update Tasks**: Edit existing tasks with new information
- **Task Status**: Track which tasks are completed and which are pending
- **Priority Levels**: Set priority for each task to organize your workload

## Project Structure

```
taskmanger/
├── src/
│   ├── task.java              # Task model class
│   ├── task_maanger.java      # Main GUI window
│   ├── manger.java            # Task manager logic
│   ├── add.java               # Add task dialog
│   ├── remove.java            # Remove task dialog
│   ├── update.java            # Update task dialog
│   ├── mark_task.java         # Mark task completed dialog
│   └── *.form                 # GUI form files (NetBeans)
├── build/                     # Compiled classes
├── nbproject/                 # NetBeans project configuration
├── build.xml                  # Ant build configuration
└── manifest.mf               # Manifest file
```

## Requirements

- Java 8 or higher
- NetBeans IDE (recommended for development)

## Installation & Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd taskmanger
   ```

2. **Open in NetBeans**
   - Launch NetBeans IDE
   - Go to `File` → `Open Project`
   - Select the `taskmanger` folder

3. **Build the Project**
   - Right-click the project → `Clean and Build`

## Running the Application

### Using NetBeans
1. Open the project in NetBeans
2. Right-click the project and select `Run` (or press `Shift + F6`)
3. The application window will open

### Using Command Line
```bash
cd taskmanger
ant run
```

## Usage

1. **Launch the application** - A GUI window will appear with 5 main options
2. **Add a Task** - Click "add" button and fill in task details
3. **Remove a Task** - Click "remove" button and enter the task title
4. **Mark as Done** - Click "mark" button to mark a task as completed
5. **Update Task** - Click "update" button to modify an existing task
6. **View Tasks** - View all tasks with their status and priority

## Task Properties

Each task contains:
- **Title**: Name of the task
- **Description**: Detailed description
- **Due Date**: When the task should be completed
- **Priority**: Importance level (1-5, where 5 is highest)
- **Status**: Completed or Pending

## Developer Information

- **Author**: Ahmed Samir Harmal
- **Student ID**: 20240838
- **Course**: CS251

## License

This project is provided as-is for educational purposes.

## How to Contribute

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Support

For issues or questions, please create an issue in the repository.

---

**Note**: This is an educational project developed as part of CS251 course at university.
