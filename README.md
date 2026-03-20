# KrypTx

KrypTx is a modern Android application built to display cryptocurrency data. 

## Features

- **Coin List**: View a list of popular cryptocurrencies with their current prices and price changes.
- **Coin Detail**: View detailed information about a specific cryptocurrency, including an interactive chart of its historical price data.
- **Adaptive UI**: Uses Jetpack Compose Material 3 Adaptive layout to support both phones and larger screens seamlessly.

## Tech Stack

This project uses modern Android development practices and libraries:

- **Kotlin**
- **Jetpack Compose**: For the UI.
- **Coroutines & Flow**: For asynchronous programming and reactive streams.
- **Ktor**: For networking and API calls.
- **Koin**: For dependency injection.
- **Material 3**: For design components and theming.

## Architecture

The project follows Clean Architecture principles, separated into:
- **Presentation Layer**: Compose UI components, ViewModels, States, Events, and Actions.
- **Domain Layer**: Models (Coin, CoinPrice) and abstract Data Sources (CoinDataSource).
- **Data Layer**: Network implementation (RemoteCoinDataSource), DTOs, and Mappers.

## Building and Running

1. Clone the repository.
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Create a free account on CoinCap to generate an API key: [https://pro.coincap.io/signin](https://pro.coincap.io/signin)
5. Open the `local.properties` file in your project's root directory and add your API key like this:
   ```properties
   API_KEY="Your api key"
6. To experience the app with smooth, production-like performance, open the Build Variants tool window in Android Studio and change the active variant for the app module to nonMinifiedRelease.
7. Run the app configuration on an emulator or a physical device.

