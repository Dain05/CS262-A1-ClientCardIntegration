# Assignment #1 – Digital Banking: Client & Card Integration

## Course Information
**Course:** Introduction to Object-Oriented Programming II (CS262)  
**Lecturer:** Doron Williams  
**Type:** Group Assignment  
**Due Date:** February 24, 2026  

---

## Group Members
- Dain Thorpe  
- Shanique Wisdom  
- Joan Johnson-Brown  
- Pasha Pinnock  
- Dante Graham  

---

## GitHub Repository
[View Repository](https://github.com/Dain05/CS262-A1-ClientCardIntegration)

---

## Project Overview
This project implements a Digital Onboarding System using Java.

The system models a **Composition (Has-A)** relationship between a `Client` and a `Card`.  
Each `Client` object owns a `Card` object.

The application:
- Captures user input using `Scanner`
- Validates business rules (Age 18+)
- Activates cards
- Updates PIN securely
- Displays formatted client and card details

---

## Technical Implementation

### Task A – Card Class
- Private attributes: `cardNumber`, `balance`, `pin`, `isActive`
- Parameterized constructor
- `updatePin(oldPin, newPin)` method
- `activateCard()` method
- Overridden `toString()` method
- Masked card number display (XXXX-XXXX-XXXX-1234)

### Task B – Client Class
- Private attributes: `idNumber`, `firstName`, `lastName`, `age`, `Card`
- Composition relationship (Client has a Card)
- Age validation (18+)
- Overridden `toString()` including card details

### Task C – Onboarding Application
- Uses `Scanner` for input
- Handles invalid input using try-catch
- Displays initial and updated profile information
