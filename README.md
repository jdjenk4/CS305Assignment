# CS305Assignment
This is a school assignment related to CS-305-11253-M01 Software Security

1. Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?
Artemis Financial is requesting Global Rain to add a file verification step to its web application. This is to ensure secure communications and provide a layer of security to data transferring. Artemis Financial is providing Global Rain with their existing software application and requesting that Global Rain add on the proper security mechanisms to ensure the secure communications.

2. What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?
The portion of the project I believe I did well was identify the needs of Artemis Financial and implement the refactored code into the existing code base. The value attained by the company for pushing out secure coding practices is reliability. From an economic perspective, the company can experience returning clients and a boost to its reputation which could help the company expand or take on more clients.

3. Which part of the vulnerability assessment was challenging or helpful to you?
I struggled the most with trying to get the application to establish a connection to the specified local port. I spent ~3 hours trying to troubleshoot why entering in "https://localhost:8444/hash" into a web broswer would result in a "Site Cannot be Reached" error. Eventually I did figure out that the simpliest solution was to run a "clean build" on the code before trying to run the code normally.

4. How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
To increase layers of security, I added in the refactored code that implemented a hash function and a error handling function. Additionally, a pom.xml file was altered to implement open source dependencies that handle various securities. I updated the maven version in the pom.xml file to have the most up to date report. When running the application as a maven project, a dependency check report is generated that can be accessed by the developer. Through this report, a developer can sift through dependencies to weed out false positives and address actual vulnerabilities. This can be done via updates to later versions or patches to known vulnerabilities.

5. How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
I looked at the before and after for the dependency check report. To make sure it was functional, I would frequently run the code through debug to ensure the code was not producing any errors.

6. What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
I frequently used git hub and stack overflow when error messages popped up to better understand what the error message meant and how to resolve it. I also referred to the supporting materials section of the assignment to answer prompts and understand the full scope of the assignment.

7. Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
I might show future employers my understanding of how to generate and read a dependency report. This would show that I value security and problem solving from identifying false positives from actual vulnerabilities.
