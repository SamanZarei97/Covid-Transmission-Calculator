# CovidTransmission
CovidTransmission is a Java program designed to compute the risk of Covid transmission between two people at their workplace based on the amount of time they have been in contact with each other.

## Usage
1- Compile the CovidTransmission.java file using the Java compiler.

    javac CovidTransmission.java
2- Run the program using the Java Virtual Machine (JVM).
    java CovidTransmission

3- Follow the prompts to provide the necessary inputs:

- Enter the starting day of contact.
- Enter the starting hour of contact.
- Enter the starting minute of contact.
- Enter the ending day of contact.
- Enter the ending hour of contact.
- Enter the ending minute of contact.

4- The program will calculate the amount of time the two individuals have been in contact and determine the possibility of Covid transmission.

## Input Requirements
The program expects the following inputs:

- Starting day (an integer value between 1 and 31).
- Starting hour (an integer value between 0 and 23).
- Starting minute (an integer value between 0 and 59).
- Ending day (an integer value between 1 and 31).
- Ending hour (an integer value between 0 and 23).
- Ending minute (an integer value between 0 and 59).

## Output
The program calculates the total duration of contact in minutes and assigns a risk level based on the following criteria:

- If the duration is between 0 and 60 minutes (inclusive), the risk level is "low."
- If the duration is between 61 and 180 minutes (inclusive), the risk level is "medium."
- If the duration is between 181 and 360 minutes (inclusive), the risk level is "high."
- If the duration is greater than 360 minutes, the risk level is "extremely high."
- If the input values are invalid (e.g., out of range), the program returns a risk level of "-1" and a duration of "-1".
The output consists of the calculated duration and the corresponding risk level.

## Input Validation
The program performs basic validation on the input values to ensure they fall within the expected range:

- The starting and ending days must be integers between 1 and 31.
- The starting and ending hours must be integers between 0 and 23.
- The starting and ending minutes must be integers between 0 and 59.
If any of the input values are outside these ranges, the program will set the duration and risk level to "-1" to indicate invalid input.

## Example 
    Enter starting day: 15
    Enter starting hour: 9
    Enter starting minute: 30
    Enter ending day: 15
    Enter ending hour: 10
    Enter ending minute: 15

    45 low
In this example, the individuals have been in contact for 45 minutes, resulting in a low risk of Covid transmission.

Note: This program assumes a single instance of contact between two individuals. It does not take into account other factors that may affect Covid transmission, such as mask usage, ventilation, or vaccination status. Use this program as a simple estimation tool and consult official health guidelines for accurate risk assessment.








