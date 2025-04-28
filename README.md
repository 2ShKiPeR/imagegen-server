# ImageGen Server (Spring Boot)

Серверная часть проекта ImageGen.

## Описание
- Обрабатывает авторизацию пользователей (регистрация/вход).
- Делает запросы к микросервису на Flask для генерации изображений.
- Выдаёт Android-приложению готовые данные (JSON + Base64).

## Технологии
- Java 17
- Spring Boot
- Spring Security
- Retrofit RestTemplate

## Как запустить
1. Склонировать репозиторий
2. Настроить `application.properties`
3. Запустить с помощью вашей IDE (например, IntelliJ IDEA)

## Требования
- JDK 17+
- Maven / Gradle
- Локальный запущенный Flask-сервер (для нейросети)

---
