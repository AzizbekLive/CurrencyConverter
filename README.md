# CurrencyConverter

Currency Converter is a mobile app that allows users to convert between different currencies. It provides up-to-date exchange rates from an API source and enables users to perform currency conversions seamlessly.

# Used Api for Currency
- https://cbu.uz/uz/arkhiv-kursov-valyut/json/

# Used Link for Flags
- https://flagcdn.com/uz.svg


## Screenshots
<p align="center">
  <img width="200" src="https://github.com/AzizbekLive/CurrencyConverter/assets/120745929/c0517cdb-57b1-4b78-916a-39c446a867e8" alt="Currency Converter App">
  <img width="200" src="https://github.com/AzizbekLive/CurrencyConverter/assets/120745929/2cf09be3-19b9-42a3-8041-9ac292583dff" alt="Image 2">
  <img width="200" src="https://github.com/AzizbekLive/CurrencyConverter/assets/120745929/c64f1693-38de-40f8-b3f2-5c441ce05fd5" alt="Image 3">
</p>


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
