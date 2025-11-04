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
    .idea/                      # IntelliJ project files (auto-generated)
    src/
        main/
            java/
                pages/          # Page object models
                    BasePage.java   # Base class for page interactions
                    DashboardPage.java # Dashboard navigation and filters
                    LoginPage.java    # Login functionality
                utilities/       # Utility classes
                    ConfigReader.java # Reads configuration (e.g., URL, credentials)
        test/
            java/
                base/           # Base test setup
                    BaseTest.java    # Common setup/teardown for tests
                tests/          # Test cases
                    DashboardTests.java # Tests dashboard features
                    LoginTests.java     # Tests login and logout
            resources/         # Test resources (e.g., config files)
    target/                     # Maven build output (auto-generated)
    .env                        # Environment variables (e.g., URL, credentials)
    .gitignore                  # Ignores IDE files and sensitive data
    pom.xml                     # Maven configuration
    testng.xml                  # TestNG suite configuration

    
Test Coverage

•	Login: Ensures successful login and logout.

•	Dashboard: Verifies navigation

•	View leave balance: Verifies If all leave details are displayed.
