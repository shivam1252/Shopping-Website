# Shopping-Website
Shopping website for different Customers.


A shopping website is running on an offer and they are providing various discounts to their customers. Help them achieve this logic programmatically.

Create a class Customer with following private data members.

DataType
VariableName
String
Name
String
Address
Integer
Age
String
mobileNumber

1. Provide appropriate constructor to initialize these details. 
2. The methods of the class should not be accessible outside the package.

Methods in class Customer:
MethodName
Function
displayCustomer()
This method displays the details of the customer with the total bill amount and discount amount under privilege customer and senior citizen customer

Create a class SeniorCitizen which extends the class Customer. 

Methods in class SeniorCitizen:
Method Name
Function
Return Type
SeniorCitizen
Include a 4 arguments constructor, with appropriate arguments. The order in which the arguments should be passed is name, address, age, mobileNumber.

getBillAmount(amount)
To calculate the payment amount where discount is 10% of purchased amount
Double

Create a class PrivilegeCustomer which extends the class Customer.

Methods in class PrivilegeCustomer:
Method Name
Function
Return Type
PrivilegeCustomer 
Include a 4 arguments constructor with the appropriate arguments.The order in which the arguements should be passed is name,address, age, mobileNumber.

getBillAmount(amount)
To calculate the payment amount where discount is 30% of purchased amount
Double

Create a driver class named Main which creates an instance of the above mentioned classes.

Sample Input 1:
Privileged Customer
Senior Citizen 

Enter Customer Type: 
1
Enter the name: Ram
Enter the age: 25
Enter the address: CBE
Enter the mobile number: 9576531641
Enter the purchased amount: 5000

Sample Output 1:

Bill Details
Name: Ram
Mobile: 9576531641
Age: 25
Address: CBE
Your bill amount is Rs. 5000.0. Congrats! As you are a Privileged customer, you are eligible for a discount!
You have to pay Rs 3500.0
