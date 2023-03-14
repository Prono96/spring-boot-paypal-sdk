# spring-boot-paypal-sdk

### How To Use Application.

1. Clone project

`$ git clone https://github.com/Prono96/spring-boot-paypal-sdk`

2. Run on any of your favourite IDE, i.e IntellIJ IDEA or Eclipse IDE.

   Note: You should have java installed in your machine.

3. Build Project and run SpringdemoApllication in your IDE.

4. Creating a developer account with PayPal

   https://developer.paypal.com/home/

5. Also create A Paypal sandbox test account. This is used to create user account to test payment in application.

6. In your developer paypal account go to sandbox and create a new app to get clientId, secret and add to Spring boot application.properties file.
   server.port: 8000
   paypal.mode=${paypal.mode}
   paypal.client.id=${paypal.client.id}
   paypal.client.secret=${paypal.client.secret}

   Note: In this project, secret keys are stored as environmental variable in IntelliJ

7. After adding your secret key and clientId to the application, run project SpringdemoApllication.

8. Go to http://localhost:8000/ on your favourite browser
