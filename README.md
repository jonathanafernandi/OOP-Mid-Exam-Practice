# OOP-Mid-Exam-Practice

A collection of Java Object-Oriented Programming (OOP) practice exercises, developed in preparation for the COMP6820001 – Object-Oriented Programming course midterm exam. The exercises cover class relationships, inheritance, random number generation, collection differences (ArrayList vs. Vector), and a mini Patreon-like subscription system.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Exercise 1: Class Relationships](#exercise-1-class-relationships)
- [Exercise 2: Furniture (Inheritance)](#exercise-2-furniture-inheritance)
- [Exercise 3: RandomInt (Range Generation)](#exercise-3-randomint-range-generation)
- [Exercise 4: ArrayList vs. Vector](#exercise-4-arraylist-vs-vector)
- [Case Study: Patreon](#case-study-patreon)
- [Getting Started](#getting-started)
- [Author](#author)
- [Notes](#notes)

## Overview

This repository documents a set of OOP exercises designed to reinforce core object-oriented concepts in Java: association, aggregation, composition, inheritance, and collection framework internals. The centerpiece is a scaled-down implementation of a Patreon-like donation platform, exercising real-world class design with multiple relationship types.

## Project Structure

```
OOP-Mid-Exam-Practice/
├── Furniture/
│   ├── src/main/
│   │   ├── Furniture.java
│   │   ├── Cupboard.java
│   │   └── Sofa.java
│   ├── .classpath
│   └── .project
├── RandomInt/
│   ├── src/main/
│   │   └── RandomInt.java
│   ├── .classpath
│   └── .project
├── Patreon/
│   ├── src/menu/
│   │   ├── Bronze.java
│   │   ├── Gold.java
│   │   ├── Silver.java
│   │   ├── SubscriptionLevel.java
│   │   ├── Image.java
│   │   ├── Music.java
│   │   ├── Video.java
│   │   ├── WorkType.java
│   │   ├── Work.java
│   │   ├── User.java
│   │   ├── Subscriber.java
│   │   ├── SupportedCreator.java
│   │   └── Main.java
│   ├── .classpath
│   └── .project
├── docs/
│   └── 2602089143-JonathanAlvindoFernandi_OOP_LatihanUTS.pdf
└── README.md
```

## Exercise 1: Class Relationships

An illustration of the three fundamental UML class relationships, each demonstrated with a distinct theme:

- **Association**: between `Mahasiswa` (Student) and `MataKuliah` (Course), and between `Dosen` (Lecturer) and `MataKuliah`.
- **Aggregation**: between `Mahasiswa` and `MataKuliah`, and between `Dosen` and `MataKuliah`, representing a "has-a" relationship where the parts can exist independently of the whole.
- **Composition**: between `Tujuan` (Objective) and `MataKuliah`, and between `Materi` (Material) and `MataKuliah`, representing a stronger "owns-a" relationship where the parts cannot exist without the whole.

## Exercise 2: Furniture (Inheritance)

Demonstrates single inheritance with a `Furniture` parent class and two subclasses:

- `Furniture`: base class with `modelName`, `price`, and `ID`.
- `Cupboard`: extends `Furniture`, adding `length` and `width`.
- `Sofa`: extends `Furniture`, adding `exterior`.

## Exercise 3: RandomInt (Range Generation)

Demonstrates generating random integers within custom ranges (including negative bounds) using `Math.random()`:

| Range | Formula |
|---|---|
| 1 to 9 | `(int)((Math.random() * 9) + 1)` |
| 10 to 29 | `(int)((Math.random() * 20) + 10)` |
| 50 to -10 | `(int)((Math.random() * 61) + (-10))` |
| 0 to -99 | `(int)((Math.random() * 100) + (-99))` |

## Exercise 4: ArrayList vs. Vector

Key differences discussed:

1. **Thread safety**: `Vector` is synchronized (only one thread can access it at a time), while `ArrayList` is not, making `ArrayList` faster in single-threaded contexts but unsafe for concurrent modification without external synchronization.
2. **Growth rate**: `ArrayList` grows by 50% of its current size when capacity is exceeded, while `Vector` doubles (100%) its size.
3. **Legacy status**: `Vector` is a legacy class (part of Java's original collection framework), while `ArrayList` was introduced later in JDK 1.2 as part of the modern Collections Framework.

## Case Study: Patreon

A simplified simulation of Patreon, a creator-subscription platform, built to practice complex OOP design involving inheritance and composition across multiple entities.

### Core Concept

- Users can upload their own works (music, video, or image).
- Users can support/subscribe to other creators at one of three tiers: **Bronze**, **Silver**, or **Gold**.
- Higher-tier subscriptions unlock access to lower-tier content (Gold → Gold + Silver + Bronze), but not vice versa (Bronze → Bronze only).

### Main Menu

1. **Insert new Patreon user**: registers a new username into a dynamic user list.
2. **Login**: displays all usernames and authenticates a case-sensitive username.
3. **Exit**: terminates the program.

### User Menu (After Login)

1. **Insert new work**: asks for work type (`music`, `video`, or `image`), type-specific attributes (genre, duration, or image format), a title, and a subscription level, and automatically generates a 9-digit work ID.
2. **Support a creator**: lists creators not yet subscribed to, and adds a chosen creator with a selected subscription level to the supported creators list.
3. **View all subscribers**: displays subscribers grouped by subscription level, or "No subscriber" if empty.
4. **View your work**: displays all uploaded works grouped by type, or "No works uploaded yet" if empty.
5. **View accessible work**: displays all works accessible based on the user's subscription tier, or "No works you can see" if none are accessible.
6. **Log out**: returns to the main menu.

### Class Design

- `WorkType` (parent) → `Music`, `Video`, `Image` (children with type-specific attributes)
- `SubscriptionLevel` (parent) → `Bronze`, `Silver`, `Gold` (children)
- `Work`: composed of a list of `WorkType`, plus title, genre, duration, and image type
- `User`: composed of lists of `Work`, `Subscriber`, and `SupportedCreator`
- `Subscriber`: tracks a username and their list of subscription levels
- `SupportedCreator`: tracks a creator's username that a user supports

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Eclipse IDE (recommended)

### Import into Eclipse

1. Open Eclipse and go to **File → Import → Existing Projects into Workspace**.
2. Select the cloned repository folder and import `Furniture`, `RandomInt`, and `Patreon` as separate projects.

### Run via Command Line

```bash
cd Patreon/src
javac menu/*.java
java menu.Main
```

Repeat similarly for `Furniture` and `RandomInt` (note that `Furniture` has no `main` method and is intended for class-structure demonstration only).

## Author

**Jonathan Alvindo Fernandi**  
Computer Science, School of Computer Science, Bina Nusantara University  
Course: COMP6820001 – Object-Oriented Programming

## Notes

- The `Patreon` case study in this repository reflects a work-in-progress implementation. Not all menu features (e.g., login, work upload, subscriber viewing, tiered content access) may be fully implemented yet and are meant to be completed as part of the exercise.
