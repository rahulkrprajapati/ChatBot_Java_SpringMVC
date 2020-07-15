# [ChatBot Using Java SpringMVC](https://github.com/null-buster/ChatBot_Java_SpringMVC)

This repository contains a ChatBot application we delevloped as part of the internship at Virtusa to aid in automobile purchase.

Welcome to our project **ChatBot Using Java SpringMVC** !!

This application was developed with the intent to design a ChatBot that could aid in customer purchase. The customer in order to interact with the ChatBot would have to login to the application using the credentials used during sign up to access the chatbot window. This would not be feasible in a real world application but was done to fulfill out internship criteria.

![Home Page](https://github.com/null-buster/ChatBot_Java_SpringMVC/raw/master/Documentation/Images/Home_Page.jpeg)

## Instructions for running application:
The project could be run by running `DemoApplication.java` file at the path `src/main/java/com/example/demo/DemoApplication.java`. This starts the **Apache** server which then connects to the cloud **MongoDB** database. The application is running on the default port `8080` and could be accessed by opening `localhost:8080` from any browser. 

The application has logic and the basic program flow can be accessed by clicking [here](https://github.com/null-buster/ChatBot_Java_SpringMVC/blob/master/Documentation/Images/Chatbot_Spring_Flowchart.jpg).

## UI Pages:

* Home Page
* Login
* Sign-up
* Chatbot
* Admin


## UI Flow:

 Our application has the following UI flow:

![UI Flow](https://github.com/null-buster/ChatBot_Java_SpringMVC/blob/master/Documentation/Images/Chatbot_Flow.png)

## UI features:
The UI is written entirely using HTML, CSS, and JavaScript elements and you can get a feel of the various pages namely the Login, Sign and Admin from [ ChatBot_Java_SpringMVC/Documentation/Images/](https://github.com/null-buster/ChatBot_Java_SpringMVC/tree/master/Documentation/Images). 

The UI is served using the SpringMVC's `model > view > controller` approach using the [Thymleaf template](https://www.thymeleaf.org/). 

You can find the UI pages at the path `ChatBot_Java_SpringMVC/src/main/resources/templates/` and the required static files at `ChatBot_Java_SpringMVC/src/main/resources/static/`

## Database:

Our application uses a MongoDB cloud database the `URI` of which can be found in the file named `application.properties` at the path `
ChatBot_Java_SpringMVC/src/main/resources/application.properties `.

## Backend:
The backend of the application namely the `controller, model, repository, services` of various elements are stored in separate directories at the path `ChatBot_Java_SpringMVC/src/main/java/com/example/demo/`.

## License:
[MIT](https://github.com/null-buster/ChatBot_Java_SpringMVC/blob/master/LICENSE)
