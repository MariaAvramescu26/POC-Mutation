# Mutation Testing POC with Pitest for `SumCalculator` Class

## Introduction

This repository serves as a Proof of Concept (POC) for performing mutation testing on a Java class called `SumCalculator` using the Pitest framework. The purpose of this POC is to demonstrate how mutation testing can help identify weaknesses in test suites by introducing artificial faults (mutations) into the code.

## `SumCalculator` Class

The `SumCalculator` class is a simple Java class that provides a method to calculate the sum of two integers. The class and its associated test suite will be used as the basis for our mutation testing POC.

## Prerequisites

Before running the mutation tests, ensure you have the following prerequisites set up:

- **Java Development Kit (JDK)**: Install JDK 8 or later.
- **Maven**: Install Maven for managing project dependencies.

## Getting Started

1. **Clone the Repository**: Clone this repository to your local machine using the following command:

   ```shell
   [git clone repo](https://github.com/MariaAvramescu26/POC-Mutation.git)
   ```

2. **Navigate to the Project Directory**: Change your current directory to the project folder:

   ```shell
   cd your-repo
   ```

3. **Run Mutation Tests**: Execute the mutation tests using Maven and Pitest:

   ```shell
   ./gradlew pitest
   ```

   This command will generate mutation reports and coverage information.

## Mutation Testing Reports

- **Pitest Reports**: After running the mutation tests, you can find the Pitest reports in the `target/pit-reports` directory. These reports provide detailed information about mutation coverage and surviving mutants.

## Interpreting Mutation Reports

- Review the Pitest mutation reports to identify:
  - Mutants that were killed by the test suite (good mutations).
  - Surviving mutants (potential weaknesses in the test suite).

## Contributing

Contributions are welcome! If you find any issues or have improvements to suggest, please open an issue or submit a pull request.
