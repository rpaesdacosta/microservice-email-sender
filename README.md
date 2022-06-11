# microservice-email-sender
Microservice project to send emails

For the application to work, the properties "spring.mail.username" and
"spring.mail.password" must be defined in the "application.properties" file

To configure a password for your email that the application can use, you can configure an application password for your "gmail", instructions on how to do this in the link below
https://support.google.com/accounts/answer/185833

Ways to send an email:

Sync - using Rest:
Make use of the endpoint "/send-email", using post method 

Assync - using RabbitMQ:
Make use of the queue "spring.rabbitmq.queue" and amqp uri "spring.rabbitmq.addresses", which can be defined in "application.properties".
Use https://www.cloudamqp.com/ to create your own queue and AMQP URI to define those properties above.

Both "Sync" and "Assync" ways, do usage of the same payload:
{
    "ownerRef": "Test",
    "emailFrom": "test-microservice-email-sender@gmail.com",
    "emailTo": "test-microservice-email-sender@gmail.com",
    "subject": "Microservice Email Sender Application - Test ",
    "text": "Message test!"
}