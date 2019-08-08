# Salary Income Predictor

## Tech stack

1. java8 stream api
2. java enum
3. builder pattern

## Setup

```
mvn clean package
java -cp ./target/*.jar com.iiht.fsd04.SalaryPredictor
```

java8 stream api only used here: `com.iiht.fsd04.model.Frequency.getValues`

## Sample output

```sh
$ java -cp ./target/*.jar me.cyper.fsd.lab04.SalaryPredictor

Salary Income Predictor
=================================================

Input starting salary: 20000
Input increment in percent: 10
Input increment received frequency: 2
Input deductions on income: 900
Input deductions received frequency: 2
Input prediction years: 5


## References
