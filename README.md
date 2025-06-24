#  Quote of the Day SDK (Kotlin Multiplatform)

A lightweight Kotlin Multiplatform (KMM) SDK that provides motivational quotes with fully shared logic across Android and iOS.

Ideal as a learning project or a boilerplate for writing shared logic in a clean, testable way.

---

##  Features

* `getQuoteOfTheDay()` — Returns a deterministic quote based on the current date
* `getRandomQuote()` — Returns a random quote on each call
* Unit-tested in both `commonTest` and `iosTest` targets
* Built for both Android and iOS using Kotlin Multiplatform

---

##  Tech Stack

* Kotlin Multiplatform (KMM)
* Kotlinx.datetime
* kotlin.test

---

##  Project Structure

```
shared/
├── model/
│   └── Quote.kt
├── repository/
│   └── QuoteRepository.kt
├── commonTest/
│   └── QuoteRepositoryTest.kt
└── iosTest/
    └── QuoteRepositoryIosTest.kt
```

---

## Usage

```kotlin
val repo = QuoteRepository()

val todayQuote = repo.getQuoteOfTheDay()
val randomQuote = repo.getRandomQuote()

println("Today: ${todayQuote.text} — ${todayQuote.author}")
println("Random: ${randomQuote.text} — ${randomQuote.author}")
```

---

##  Running Tests

To run all tests (including iOS simulator):

```bash
./gradlew :shared:allTests
```

Or run specific iOS test target (Apple Silicon):

```bash
./gradlew :shared:iosSimulatorArm64Test
```

---

##  Use Cases

* Daily quote apps
* Onboarding/Splash screen motivators
* Widgets or lock screen tiles
* Educational boilerplate for KMM

---
