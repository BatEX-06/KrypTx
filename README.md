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
  <img src="https://github.com/user-attachments/assets/227e9fe4-0a97-4202-b36f-52fe3a01f5f2" width="220" alt="screenshot_1"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/bdeaf06e-a59c-4317-b174-7bd19db0225a" width="220" alt="screenshot_2"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/11d5aaa6-b18c-4bd1-8c91-0643c955f336" width="220" alt="screenshot_3"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/3d758209-922e-41a6-9e49-9d35e6c4685f" width="220" alt="screenshot_4"/>
</div>

<br/>

### App Previews (Landscape - Tablet)
*Showcasing the Adaptive UI layout for larger screens.*
<div align="center">
  <img src="https://github.com/user-attachments/assets/7b6a0d92-4cc1-4005-8e2c-6e79ffa1db02" width="400" alt="screenshot_5"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/1ca31e89-db06-4633-871a-aa981574fbb9" width="400" alt="screenshot_6"/>
</div>
<div align="center">
  <img src="https://github.com/user-attachments/assets/0bed9e6d-ec81-4f30-bfa4-f1b45be82b6a" width="400" alt="screenshot_7"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/6018b2c4-683e-4fc2-b1ed-a85871bd1a7b" width="400" alt="screenshot_8"/>
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

