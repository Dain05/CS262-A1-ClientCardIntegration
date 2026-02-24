Assignment #1 – Digital Banking: Client & Card Integration
Course Information

Course: Introduction to Object-Oriented Programming II (CS262)
Lecturer: Doron Williams
Type: Group Assignment
Due Date: February 24, 2026

Group Members

Dain Thorpe

Shanique Wisdom

Joan Johnson-Brown

Pasha Pinnock

Dante Graham

GitHub Repository

https://github.com/Dain05/CS262-A1-ClientCardIntegration.git

Project Overview

This project implements a Digital Onboarding System using Java.

The system models a composition (Has-A) relationship between a Client and a Card. Each Client object owns a Card object.

The application captures user input from the console, validates business rules, and displays formatted reports.

Technical Implementation
Task A – Card Class

Private attributes: cardNumber, balance, pin, isActive

Parameterized constructor

updatePin(oldPin, newPin) method

activateCard() method

Overridden toString() method

Masked card number display

Task B – Client Class

Private attributes: idNumber, firstName, lastName, age, Card

Composition relationship (Client has a Card)

Age validation (18+)

Overridden toString() including card details

Task C – Onboarding Application

Uses Scanner for input

try-catch block for InputMismatchException

Creates Client and Card objects

Activates card

Attempts PIN update

Displays initial and final profile
