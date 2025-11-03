Leave Management Dashboard Test Automation
This project automates UI testing for a leave management dashboard using Selenium with Java. It covers login, dashboard navigation, and leave portal details for managers and employees.
Prerequisites
Before setting up the project, ensure you have the following installed:

Java Development Kit (JDK): Version 8 or higher (download from Oracle or use a package manager like Homebrew).
IntelliJ IDEA: The Community edition (free) from JetBrains.
Maven: For managing dependencies (install via Maven website or package manager).
Chrome Browser: For running tests (latest version recommended).
ChromeDriver: Matches your Chrome version (download from Selenium).
Git: For version control (install from git-scm).

Project Setup

1. Clone the Repository

Open a terminal and run:
bashgit clone https://github.com/your-username/leave-dashboard-tests.git
cd leave-dashboard-tests



2. Import into IntelliJ

Open IntelliJ, select “Open,” and choose the cloned project folder.
If prompted, let IntelliJ import the Maven project (it will download dependencies automatically).


3. Configure ChromeDriver

Place the ChromeDriver executable in a folder (e.g., drivers in the project root).
Update the path in the test code (e.g., System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");).

4. Install Dependencies

Ensure pom.xml includes Selenium and TestNG dependencies. A sample pom.xml snippet:
xml<dependencies>
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

Sync the project in IntelliJ (click “Reload All Maven Projects”).


5. Update Configuration

Edit the base URL in the test code to point to your dashboard (e.g., driver.get("http://your-dashboard-url");).
Adjust element locators (e.g., XPaths) if the dashboard UI changes.

Project Structure

MercansTest/
├── .idea/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/
│   │   │   │   ├── BasePage.java
│   │   │   ├── DashboardPage.java
│   │   │   └── LoginPage.java
│   │   │
│   │   └── utilities/
│   │       └── ConfigReader.java
│   │
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   └── tests/
│       │       ├── DashboardTests.java
│       │       └── LoginTests.java
│       │
│       └── resources/
├── target/
├── .env
├── .gitignore
├── pom.xml
└── testng.xml

Test Coverage
•	Login: Ensures successful login and logout.
•	Dashboard: Verifies navigation
•	View leave balance: Verifies If all leave details are displayed.
