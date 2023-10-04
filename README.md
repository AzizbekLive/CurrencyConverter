# CurrencyConverter

Currency Converter is a mobile app that allows users to convert between different currencies. It provides up-to-date exchange rates from an API source and enables users to perform currency conversions seamlessly.

## Screenshots

<img src="(https://github.com/AzizbekLive/CurrencyConverter/assets/120745929/9ae0e21f-0f18-4193-a3bc-2f0e5c271530)" width="200">
<img src="(https://github.com/AzizbekLive/CurrencyConverter/assets/120745929/322c0286-ae07-4500-80aa-bdc0abe09384)" width="200">
<img src="(https://github.com/AzizbekLive/CurrencyConverter/assets/120745929/1074e218-6aa8-431f-af0f-395ce52be1da)" width="200">

## Features

- View a list of supported currencies.
- Convert between different currencies.
- Get real-time exchange rate data.

## Architecture

The app is designed following the Clean Architecture principles, separating the application into different layers:

- **Presentation Layer**: Responsible for handling UI-related tasks and user interactions.
- **Domain Layer**: Contains the business logic and use cases of the application.
- **Data Layer**: Handles data sources, including remote API calls.

The Model-View-Intent (MVI) architecture is used in the presentation layer to manage UI state and user interactions efficiently.

## Technologies

- Android
- Kotlin
- Clean Architecture
- Model-View-Intent (MVI)
- Retrofit
- Hilt (Dependency Injection)
- Voyager (for Android navigation)

## Getting Started

To run this app on your local machine, follow these steps:

1. Clone this repository: `git clone https://github.com/azizbeklive/currency-converter-app.git`
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or device.

Make sure you have the necessary Android development tools and dependencies installed.
