# A Short Exercise to Explore Object-Oriented Programming - Encapsulation


## class DodgyBankAccount

### public member fields
This class is not well encapsulated because the fields accountNumber, accountBalance and rewardAmount are public which leaves them open to be manipulated by any user of the class.
These fields should have been private with access controlled by class methods which perform any requisite checks.

### public method
Secondly, the addReward() method should only be invoked when a certain condition is met, i.e. a deposit is made.
However, by making it public any user of the class can invoke it to addReward. This method should be private.

### Misuse
The Main class takes advantages of the above problems in DodgyBankAccount class by firstly calling
addReward() method even when no reward should be given and finally updating the exposed class field
 members to directly update account balance.

## class SecureBankAccount 
 The SecureBankAccount class is well encapsulated. Its member fields are private and hence
 protected from misuse. It has also made the addReward() method private which protects it and allows it to be used
 internally only in a certain situation as intended.

## Comparison

Furthermore the the two classes - DodgyBankAccount and SecureBankAccount - also have the following differences.

### Use of final fields
 - Compared to DodgyBankAccount, SecureBankAccount class is more secure and safe from misuse. 
 - SecureBankAccount makes the REWARDAMOUNT a constant thereby keeping it fixed whereas in DodgyBankAccount it can be changed by anyone.
 - The field ACCOUNTNUMBER in SecureBankAccount is final which means it cannot be modified once set which betters models a real world bank account where the account number cannot be changed. 
 - In DodgyBankAccount class, on the other hand the accountnumber is public and can be changed which
 opens up another avenue for misuse.

 ### naming
- SecureBankAccount class also has better naming for its displayAccountBalance() method which does as the
  name suggests.
- However the DodgyBankAccount class has a getAccountBalance() method
  which also displays the account balance but the name is a misleading and suggests it returns the account balance.