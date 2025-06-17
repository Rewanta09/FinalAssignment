# 📱 AssignmentApp

A clean and modular Android application that demonstrates modern app development practices using Kotlin, Java, MVVM architecture, Retrofit for networking, and Hilt for dependency injection. The app includes user login, dashboard listing, detailed item views, and testing suites.

---

## 📋 Prerequisites

Before you begin, make sure you have the following installed:

- Android Studio (latest stable version)
- Java Development Kit (JDK 11 or higher)
- Android SDK and Emulator or USB-connected physical Android device

---

## 🚀 How to Build and Run the App

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/AssignmentApp.git
```

> Replace `yourusername` with your GitHub username.

---

### 2. Open in Android Studio

- Open Android Studio
- Click on **"Open"** and select the project folder
- Wait for the Gradle sync to complete

---

### 3. Build the App

- From the menu bar, select **Build > Make Project**
- Or press `Ctrl + F9` (Windows/Linux) or `Cmd + F9` (macOS)

---

### 4. Run the App

- Click the green **Run** ▶️ button or press `Shift + F10`
- Choose a running emulator or a connected Android device

---

## ✅ Features

### 1. 🔐 Login Screen

- UI with fields for username and password
- Username: student's first name  
- Password: student ID (e.g., `s12345678`)
- POST request to authentication endpoint based on class location
- Displays error messages on login failure
- Navigates to Dashboard upon successful login

---

### 2. 📊 Dashboard Screen

- Uses RecyclerView to display a list of entities
- Retrieves data using `keypass` received from login response
- Displays item summary (excluding description)
- Clicking an item opens the Details screen

---

### 3. 📄 Details Screen

- Displays complete information about a selected entity
- Includes description and other fields
- Clean and user-friendly layout

---

## ⚙️ Technical Requirements

- ✅ **Dependency Injection** using Hilt  
- ✅ **MVVM Architecture** and Clean Code principles  
- ✅ **Structured Project Organization** (activities, adapters, models, services)  
- ✅ **Unit Testing** for login, API services, and models  
- ✅ **Git Version Control** with clear and meaningful commit messages

---

## 📦 Dependencies Used

This project uses modern Android libraries for UI, networking, testing, and architecture.

### 🔧 Core Android Libraries
- `androidx.core:core-ktx`
- `androidx.appcompat:appcompat`
- `androidx.constraintlayout:constraintlayout`
- `com.google.android.material:material`

### 🌐 Networking
- `com.squareup.retrofit2:retrofit:2.9.0`
- `com.squareup.retrofit2:converter-gson:2.9.0`

### 🧠 Architecture Components
- `androidx.lifecycle:lifecycle-livedata-ktx:2.6.2`
- `androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2`

### 🗂️ UI Components
- `androidx.recyclerview:recyclerview:1.3.2`

### ⚡ Dependency Injection
- `com.google.dagger:hilt-android:2.48`
- `kapt` for Hilt compiler support

### 🔄 Coroutines
- `org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3`

### 🧪 Testing
- `junit:junit:4.13.2`
- `org.mockito:mockito-core:5.2.0`
- `com.google.truth:truth:1.1.5`
- `com.google.code.gson:gson:2.10.1`
- `androidx.test.ext:junit`
- `androidx.test.espresso:espresso-core`

---

## 🧪 Testing Info

- Unit tests located in `src/test/java/com/example/assignmentapp`
  - `LoginModelsTest`
  - `DashboardItemTest`
  - `RetrofitClientTest`
- Android instrumentation tests in `src/androidTest/`

Run tests via:
```bash
./gradlew test
./gradlew connectedAndroidTest
```

---

## 🧾 License

This project is for educational use only. You can modify and use it for your assignments or learning purposes.

---

Happy Coding! 🎓
