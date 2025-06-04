# spring-boot-aws-project

This is a Spring Boot project intended to be deployed on AWS.

## Features
- REST APIs with Spring Boot
- AWS deployment ready
- Dockerized (optional)

## How to run locally
```bash
./mvnw spring-boot:run



---

## 📌 Important Rules:
- `#` to `######` → heading levels 1 to 6
- `**text**` → bold
- Combine `#` + `** **` for **big bold headings**

---

## 🎁 Bonus Example:

```markdown
## 📌 **Important Note**

**✅ You must open port 8080 in your AWS EC2 Security Group for public access.**


#######Basic instructions for deploying Spring Boot project on AWS
Here’s a simple way to deploy your Spring Boot app on AWS EC2:

_Step A: Package your app as a jar_
```bash

./mvnw clean package

This will create a jar file inside the target/ folder, e.g., spring-boot-aws-project-0.0.1-SNAPSHOT.jar.

_Step B: Create an EC2 instance on AWS_
Go to AWS Management Console → EC2 → Launch Instance.

Choose Amazon Linux 2 or Ubuntu.

Configure security group to allow inbound traffic on port 8082 (custom Spring Boot port).

Launch the instance.

Step C: Connect to EC2 instance

```bash

ssh -i path/to/your-key.pem ec2-user@your-ec2-public-ip
Step D: Install Java on EC2 instance
For Amazon Linux 2:

```bash

sudo yum update -y
sudo amazon-linux-extras install java-openjdk11 -y
For Ubuntu:

```bash

sudo apt update
sudo apt install openjdk-11-jdk -y
Step E: Transfer jar file to EC2
From your local machine:

```bash
scp -i path/to/your-key.pem target/spring-boot-aws-project-0.0.1-SNAPSHOT.jar ec2-user@your-ec2-public-ip:~
Step F: Run the Spring Boot app on EC2

```bash

java -jar spring-boot-aws-project-0.0.1-SNAPSHOT.jar
The app will start on port 8082.

Step G: Access your app
Open browser and go to:

```bash
http://your-ec2-public-ip:8082
