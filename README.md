# spring-boot-aws-project

This is a Spring Boot project intended to be deployed on AWS.

## Features
- REST APIs with Spring Boot
- AWS deployment ready
- Dockerized (optional)

## How to run locally
```bash
./mvnw spring-boot:run

## Basic instructions for deploying Spring Boot project on AWS
Here’s a simple way to deploy your Spring Boot app on AWS EC2:

Step A: Package your app as a jar
bash
Copy
Edit
./mvnw clean package
This will create a jar file inside the target/ folder, e.g., spring-boot-aws-project-0.0.1-SNAPSHOT.jar.

Step B: Create an EC2 instance on AWS
Go to AWS Management Console → EC2 → Launch Instance.

Choose Amazon Linux 2 or Ubuntu.

Configure security group to allow inbound traffic on port 8080 (default Spring Boot port).

Launch the instance.

Step C: Connect to EC2 instance
bash
Copy
Edit
ssh -i path/to/your-key.pem ec2-user@your-ec2-public-ip
Step D: Install Java on EC2 instance
For Amazon Linux 2:

bash
Copy
Edit
sudo yum update -y
sudo amazon-linux-extras install java-openjdk11 -y
For Ubuntu:

bash
Copy
Edit
sudo apt update
sudo apt install openjdk-11-jdk -y
Step E: Transfer jar file to EC2
From your local machine:

bash
Copy
Edit
scp -i path/to/your-key.pem target/spring-boot-aws-project-0.0.1-SNAPSHOT.jar ec2-user@your-ec2-public-ip:~
Step F: Run the Spring Boot app on EC2
bash
Copy
Edit
java -jar spring-boot-aws-project-0.0.1-SNAPSHOT.jar
The app will start on port 8080.

Step G: Access your app
Open browser and go to:

arduino
Copy
Edit
http://your-ec2-public-ip:8080
