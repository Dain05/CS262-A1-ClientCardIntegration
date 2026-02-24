# Assignment #1 Digital Banking: Client & Card Integration

## Course Information
**Course:** Introduction to Object-Oriented Programming II  
**Lecturer:** Doron Williams  
**Type:** Group Assignment  

---

## Group Members
- Dain Thorpe  
- Shanique Wisdom  
- Joan Johnson-Brown  
- Pasha Pinnock  
- Dante Graham

---

## Project Overview
This project implements a Digital Onboarding System in Java.

The system models a **Composition (Has-A)** relationship between a `Client` and a `Card`.  
Each `Client` object owns a `Card` object.

The application captures user input from the console, applies validation rules and displays formatted reports based on the data entered.

---

## Technical Breakdown

### Task A – Card Class
- Private attributes:
  - `cardNumber` (String)
  - `balance` (double)
  - `pin` (int)
  - `isActive` (boolean)
- Parameterized constructor
- `updatePin(oldPin, newPin)` with validation
- `activateCard()` method
- Overridden `toString()` method
- Masked card number output (Bonus feature)

---

### Task B – Client Class
- Private attributes:
  - `idNumber` (int)
  - `firstName` (String)
  - `lastName` (String)
  - `age` (int)
  - `Card` object
- Composition relationship (Client has a Card)
- Age validation (must be 18 or older)
- Overridden `toString()` including card details

---

### Task C – Onboarding Application
- Uses `Scanner` for data capture
- Implements `try-catch` for `InputMismatchException`
- Instantiates `Client` and `Card`
- Activates the card
- Attempts PIN update
- Displays initial and final profile

---

### Task D – Professional Standards
- Proper access modifiers used
- Java naming conventions followed
- Project structured into three separate files:
  - `Client.java`
  - `Card.java`
  - `OnboardingApp.java`
