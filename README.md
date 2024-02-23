# Real Estate Application Readme

## Description
This Java application is designed to manage and analyze various types of properties such as cottages, houses, and villas. It provides functionalities to calculate the total cost and average land size of each property type, as well as the total cost and average land size across all property types.

## Usage
To run the application, execute the `main` method in the `RealEstateAppSpringBootApplication` class. Ensure that the necessary dependencies are installed and configured correctly.

## Features

### Total Cost Calculation
- Calculates the total cost of cottages, houses, and villas separately.
- Provides functionality to calculate the total cost of all property types combined.

### Average Land Size Calculation
- Computes the average land size of cottages, houses, and villas individually.
- Offers the capability to calculate the average land size across all property types.

## Classes

- **RealEstateAppSpringBootApplication**: Contains the main method to execute the application.
- **PropertyLists**: Initializes lists of cottages, houses, and villas with sample data.
- **PropertyService**: Provides methods to perform calculations related to properties, such as total cost and average land size.
- **PropertyEntity**: Represents the entity class for a property with attributes like cost and land size.

## Data
Sample data for cottages, houses, and villas is initialized within the `PropertyLists` class. You can modify this data to reflect real-world scenarios or integrate data retrieval from a database.

## Dependencies
This application relies on the Spring Boot framework for dependency injection and application configuration. Ensure that all required dependencies are correctly included in the project's build configuration.

## Output
Upon running the application, the console will display the calculated total cost and average land size for each property type, as well as the aggregated values for all property types. 

