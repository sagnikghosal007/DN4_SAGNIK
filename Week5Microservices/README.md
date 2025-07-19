# Week5Microservices

This project contains two independent Spring Boot Microservices: **Account** and **Loan**. Each service is built using Spring Initializr and includes a REST controller that returns dummy data.

## Folder Structure
```
Week5Microservices/
└── microservices/
    ├── account/
    │   └── AccountController.java
    └── loan/
        └── LoanController.java
```

## Account Microservice

- Endpoint: `/accounts/{number}`
- Sample Response:
```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343.0
}
```

## Loan Microservice

- Endpoint: `/loans/{number}`
- Port: `8081`
- Sample Response:
```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000.0,
  "emi": 3258,
  "tenure": 18
}
```

## How to Run

1. Build each service with:
   ```bash
   mvn clean package
   ```

2. Run using your IDE or:
   ```bash
   mvn spring-boot:run
   ```

3. Access services at:
   - http://localhost:8080/accounts/{number}
   - http://localhost:8081/loans/{number}