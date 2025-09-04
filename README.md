## 📍 Overview

**Technology Chosen:**  
**Kotlin** – a modern, statically typed programming language developed by JetBrains.

**Why This Technology?**  
I chose Kotlin because it is one of the fastest-growing programming languages, especially popular in **Android development** and increasingly adopted for **backend systems** using frameworks like Ktor and Spring. It combines the best of object-oriented and functional programming, while offering more concise and readable code compared to Java.  
Since I already have some experience with Java, learning Kotlin feels like a natural progression. It allows me to expand my skills into mobile development and modern backend programming.

**Project Goal / End Outcome:**  
The goal of this project is to build a **beginner-friendly toolkit** that helps anyone get started with Kotlin quickly. By the end of this guide, a beginner should be able to:  
- Install Kotlin and set up the environment in **VS Code**.  
- Create and run a minimal **“Hello Kotlin + Calculator”** project.  
- Understand common errors and how to fix them.  
- Access useful references and resources to continue learning.  

**Scope:**  
This toolkit is designed for complete beginners to Kotlin. It focuses on a **minimal working setup** and a **simple runnable project** that demonstrates the basics of Kotlin. The aim is not to cover advanced topics, but to give a clear, step-by-step entry point into the language.
In this toolkit, you have:

Set up Kotlin in VS Code.

Written and run a Hello World program.

Built a Simple Calculator.

Learned how to troubleshoot common issues.  


## 🛠️ Installation & Setup Instructions.

Before we can write and run Kotlin code, let’s prepare our development environment.  
These steps will guide you through creating a GitHub repository, installing the necessary tools, and setting up VS Code.

---

### 1. Create a GitHub Repository
We’ll use GitHub to store and share our Kotlin project.

1. Log in to [GitHub](https://github.com).  
2. Click **New Repository**.  
3. Enter a repository name, for example:  

kotlin-beginner-toolkit

4. Add a short description (e.g., *A simple Kotlin Hello World project*).  
5. Initialize with:
- ✅ **README**  
- ✅ `.gitignore` → choose **Kotlin**  
6. Click **Create Repository**.

---

### 2. Clone the Repository to Your Computer
Open your terminal and run:
```bash
git clone https://github.com/YOUR-USERNAME/kotlin-beginner-toolkit.git
cd kotlin-beginner-toolkit
 ```


### 3. Install Prerequisites

Before writing any Kotlin code, make sure you have the required tools installed.

---

#### 3.1 Install Java Development Kit (JDK)

Kotlin runs on the JVM, so you need Java first.

1. Update your package index:
   ```bash
   sudo apt update

    Install JDK 11 (or later):

sudo apt install openjdk-11-jdk

Verify installation:

    java -version

    Expected output should show openjdk version "11.x.x" or higher.

#### 3.2 Install Kotlin Compiler

Now, install Kotlin itself.

Option 1: Using Snap (recommended, latest version)

sudo snap install --classic kotlin

Option 2: Using Apt (older version)

sudo apt install kotlin

#### 3.3 Verify Kotlin Installation

Run the following to check if Kotlin is installed correctly:

kotlinc -version

You should see output like:

info: kotlinc-jvm 1.x.x



### 4. Install VS Code and Extensions

Now that Java and Kotlin are installed, let’s set up our coding environment using **Visual Studio Code (VS Code)**.

---

#### 4.1 Install VS Code

1. Download the latest version of VS Code from the official site:  
   👉 [Visual Studio Code Download](https://code.visualstudio.com/)  

2. Follow the installation instructions for your operating system (Windows, Linux, or Mac).  

3. Once installed, open VS Code. You should see the welcome screen.

---

#### 4.2 Install Recommended Extensions

To write and run Kotlin smoothly in VS Code, install the following extensions:

1. Open the **Extensions Marketplace**:  
   - Shortcut: `Ctrl + Shift + X` (Windows/Linux) or `Cmd + Shift + X` (Mac).  

2. Search and install:
   - **Kotlin Language** (by *fwcd*)  
     👉 Adds syntax highlighting, IntelliSense, and debugging support for Kotlin.  

   - **Code Runner** (by *Jun Han*)  
     👉 Lets you quickly run Kotlin files without setting up complex build tools.  

3. After installing, reload VS Code to activate the extensions.

---

#### 4.3 Verify Installation

1. Create a new file in VS Code and save it as `Main.kt`.  
2. Add the following simple program:

   ```kotlin
   fun main() {
       println("Hello, Kotlin from VS Code!")
   }

    Right-click inside the editor and select Run Code (provided by the Code Runner extension).

        Alternatively, open the terminal and run:

    kotlinc Main.kt -include-runtime -d Main.jar
    java -jar Main.jar

You should see:

    Hello, Kotlin from VS Code!

✅ At this point, you have:

    VS Code installed.

    Kotlin support enabled.

    Verified that Kotlin code runs successfully inside VS Code.

---

#### 4.4 Commit to GitHub (Optional but Recommended)

Now that your setup works, let’s save the progress:

```bash
git add Main.kt
git commit -m "Add Hello Kotlin program"
git push origin main
```

## 🚀 Quickstart
1. Clone the repo:
   ```bash
   git clone https://github.com/YOUR-USERNAME/name-of-repo.git
   cd name-of-repo

    Compile Hello World:

kotlinc Main.kt -include-runtime -d Main.jar
java -jar Main.jar

Run Calculator:

    kotlinc Calculator.kt -include-runtime -d Calculator.jar
    java -jar Calculator.jar

✅ Done! You’ve run your first two Kotlin programs.

Common Errors & Fixes (Troubleshooting)
Beginners will get errors. A short list helps:

    command not found: kotlinc → Add Kotlin to PATH.

    java: command not found → Install JDK.

    Calculator division by zero → Handled in code.

📚 Resources / Next Steps
Links for learning more after the toolkit:

    Official Kotlin Docs

Kotlin Playground (online editor)

Kotlin for Android Developers
