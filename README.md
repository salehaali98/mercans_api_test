# Leave Management Dashboard Test Automation

This project automates UI testing for a leave management dashboard using Selenium with Java. It covers login, dashboard navigation, and leave portal details for managers and employees.

---

## Prerequisites

Before setting up the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher (download from Oracle or use a package manager like Homebrew).
- **IntelliJ IDEA**: The Community edition (free) from JetBrains.
- **Maven**: For managing dependencies (install via the Maven website or package manager).
- **Chrome Browser**: For running tests (latest version recommended).
- **ChromeDriver**: Matches your Chrome version (download from Selenium).
- **Git**: For version control (install from git-scm).

---

## Project Setup

### 1. Clone the Repository

git clone https://github.com/salehaali98/mercans_api_test.git
cd leave-dashboard-tests

## Project Structure
```text
MercansTest/
├── .idea/                      # IntelliJ project files (auto-generated)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/            # Page object models
│   │   │   │   ├── BasePage.java
│   │   │   │   ├── DashboardPage.java
│   │   │   └── LoginPage.java
│   │   └── utilities/             # Utility classes
│   │       └── ConfigReader.java
│   └── test/
│       ├── java/
│       │   ├── base/              # Base test setup
│       │   │   └── BaseTest.java
│       │   └── tests/             # Test cases
│       │       ├── DashboardTests.java
│       │       └── LoginTests.java
│       └── resources/             # Test resources (e.g., config files)
├── target/                       # Maven build output (auto-generated)
├── .env                          # Environment variables (e.g., URL, credentials)
├── .gitignore                    # Ignores IDE files and sensitive data
├── pom.xml                       # Maven configuration
└── testng.xml                    # TestNG suite configuration
```

### 2. Import into IntelliJ

Open IntelliJ, select “Open”, and choose the cloned project folder.

If prompted, let IntelliJ import the Maven project (it will download dependencies automatically).

### 3. Configure ChromeDriver

Place the ChromeDriver executable in a folder (e.g., drivers/ in the project root).

Update the path in the test code, for example:

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

### 4. Install Dependencies

Ensure pom.xml includes Selenium and TestNG dependencies.
```text
<dependencies>
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.11.0</version>
  </dependency>
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
    <scope>test</scope>
  </dependency>
</dependencies>
```



