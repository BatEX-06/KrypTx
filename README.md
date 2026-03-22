# KrypTx

> **⚠️ Note:** Try out the app before the free API credits expire! If the market data isn't loading, feel free to clone this repository, add your own API key, and run it locally on your device.

[![Download APK](https://img.shields.io/badge/Download-APK-green.svg?logo=android&style=for-the-badge)](https://github.com/BatEX-06/KrypTx/releases/download/v1.0.1/KrypTx.apk)

KrypTx is a modern Android application built to display cryptocurrency data. 

## Features

- **Coin List**: View a list of popular cryptocurrencies with their current prices and price changes.
- **Coin Detail**: View detailed information about a specific cryptocurrency, including an interactive chart of its historical price data.
- **Adaptive UI**: Uses Jetpack Compose Material 3 Adaptive layout to support both phones and larger screens seamlessly.

## 📸 Screenshots

### App Previews (Portrait)
*A perfect view for phone users. App supports Dynamic Color theme.*
<div align="center">
  <img src="https://github.com/user-attachments/assets/d7b627df-d27c-4951-8967-b18173febfec" width="220" alt="screenshot_1"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/4ada9ad5-1513-41d7-bf07-a45393787c64" width="220" alt="screenshot_2"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/b61bceef-7c98-402c-9789-4ab441f6f507" width="220" alt="screenshot_3"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/f4efe83e-01fa-407c-8a8d-6a727d8e92df" width="220" alt="screenshot_4"/>
</div>

<br/>

### App Previews (Landscape - Tablet)
*Showcasing the Adaptive UI layout for larger screens.*
<div align="center">
  <img src="https://github.com/user-attachments/assets/0ea5482f-a308-4ade-9ad7-ea63e5f46b3c" width="400" alt="screenshot_5"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/d5e24c47-161a-4c5c-95c3-5813a9305708" width="400" alt="screenshot_6"/>
</div>
<div align="center">
  <img src="https://github.com/user-attachments/assets/195d002f-6afb-4715-a74f-b8c33c5379a0" width="400" alt="screenshot_7"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/9e26f8e4-4beb-42e4-b930-02a73250eb16" width="400" alt="screenshot_8"/>
</div>

### API Key Setup Instructions
*Here you can find your API key.*
<p align="center">
  <img src="https://github.com/user-attachments/assets/13e82877-4682-4da7-bc33-2d2e3d19b09a" width="600" alt="API key screenshot"/>
</p>

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
   ## Example
   API_KEY=582845e05r8t57f885149a4184d5
6. To experience the app with smooth, production-like performance, open the Build Variants tool window in Android Studio and change the active variant for the app module to nonMinifiedRelease.
7. Run the app configuration on an emulator or a physical device.

