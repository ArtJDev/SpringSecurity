# Задача Безопасное приложение

## Описание

Приложение с ограничением доступа к endpoint'ам.

Главная страница по ссылке

http://localhost:8080/home

1. Контроллер имеет не менее одного метода-обработчика запросов на разные endpoint'ы.

2. Реализует класс-наследник `WebSecurityConfigurerAdapter` так, что:
  - на стартовый endpoint можно попасть без авторизации, а на все остальные только после авторизации
  - пользователь логинится через стандартную форму логина от Spring