# Modular Navigation with Jetpack Compose

**A fully modular Android project demonstrating feature-based navigation using Jetpack Compose.**

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [Modules](#modules)
3. [Architecture](#architecture)
4. [Tech Stack & Versions](#tech-stack--versions)
5. [Getting Started](#getting-started)
6. [Folder Structure](#folder-structure)
7. [Navigation Approach](#navigation-approach)
8. [Future Improvements](#future-improvements)
9. [Medium Article](#medium-article)

---

## Project Overview

This project demonstrates **modularized navigation architecture** in Jetpack Compose.  
Each feature lives in its own module with its own navigation graph, while the `app` module orchestrates top-level navigation.

The goal is to:
- Improve scalability and maintainability.
- Demonstrate best practices for multi-module Compose projects.
- Provide a portfolio-ready example of clean architecture with modern Android development practices.

---

## Modules

| Module | Purpose |
|--------|---------|
| `app` | Application shell, top-level `NavHost`, integrates feature navigation. |
| `common:data` | Shared data models, repositories, and utilities for all features. |
| `common:navigation` | Sealed classes for navigation destinations, route helpers, and navigation APIs. |
| `feature:album-details` | Feature module for album detail screens. |
| `feature:artist-details` | Feature module for artist detail screens. |
| `feature:dashboard` | Feature module for the main dashboard/home screen. |
| `feature:song-details` | Feature module for song detail screens. |

---

## Architecture

**High-Level Overview:**

```
      +------------------+
      |       app        | <- Top-level NavHost
      +------------------+
             |
             v
+------------+-------------------+
| Feature Modules (independent) |
+-------------------------------+
| album-details | artist-details |
| dashboard    | song-details    |
+-------------------------------+
             |
             v
     +----------------+
     |  common modules |
     |  data/navigation|
     +----------------+
```

**Key Principles:**
- Each feature module is **self-contained**.
- `common` modules provide shared utilities and navigation sealed classes.
- `app` module only integrates feature navigation graphs.
- **Sealed classes** enforce type-safe navigation.

---

## Tech Stack & Versions

- **Language:** Kotlin
- **UI:** Jetpack Compose
- **Navigation:** `androidx.navigation:navigation-compose`
- **Build System:** Gradle (Kotlin DSL)
- **Minimum SDK:** 21+
- **Kotlin Version:** 1.9+
- **Compose Version:** 1.5+

---

## Getting Started

1. Clone the repo:
```bash
git clone https://github.com/ashishpardhiye22/modular-navigation.git
```

2. Open in Android Studio (Arctic Fox or newer)

3. Build & Run:
- Select `app` module
- Run on emulator or connected device

4. Explore navigation flows across feature modules.

---

## Folder Structure

```
:app
:common:data
:common:navigation
:feature:album-details
:feature:artist-details
:feature:dashboard
:feature:song-details
```

---

## Navigation Approach

- **Sealed Classes:** Each screen has a corresponding sealed class defining route and arguments.
- **Feature-level Graphs:** Each feature defines its own navigation graph.
- **Top-level Integration:** The `app` module integrates feature graphs into a single `NavHost`.

**Example:**
```kotlin

@Serializable
sealed interface Route {

    @Serializable
    data object Dashboard : Route

    @Serializable
    data class SongDetail(
        val id: Int,
    ) : Route

    @Serializable
    data class ArtistDetail(
        val id: Int,
    ) : Route

    @Serializable
    data class AlbumDetail(
        val id: Int,
    ) : Route
}
```

---

## Future Improvements

- Add **Dynamic Feature Modules** for on-demand downloads.
- Add **UI tests** for navigation flows.
- Add **CI/CD with GitHub Actions**.
- Expand documentation with screenshots and GIFs.
- Integrate **Deep Links** for external navigation.

---

## Medium Article

> Placeholder: Once published, link your Medium article here with full architecture explanation, challenges, and lessons learned.