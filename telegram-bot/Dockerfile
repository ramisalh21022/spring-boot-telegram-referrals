# استخدم JDK 21
FROM eclipse-temurin:21-jdk-alpine

# اضبط دليل العمل
WORKDIR /app

# انسخ pom.xml وملفات المشروع
COPY pom.xml ./
COPY src ./src

# بناء المشروع
RUN ./mvnw clean package -DskipTests

# تعيين المنفذ الذي سيستمع عليه Spring Boot
EXPOSE 8080

# تشغيل التطبيق
CMD ["java", "-jar", "target/telegram-bot-0.0.1-SNAPSHOT.jar"]
