Dependency Injection (DI) in Spring Boot
Dependency Injection (DI) is a design pattern that allows Spring Boot to manage object dependencies automatically. It uses the Inversion of Control (IoC) principle to decouple objects and their dependencies.

Key Points:
DI allows you to inject required dependencies into a class instead of the class managing them itself.
Types of DI in Spring Boot:
Constructor Injection: Injects dependencies via the class constructor.
Setter Injection: Injects dependencies using setter methods.
Field Injection: Directly injects dependencies into class fields.

@Autowire in Spring Boot
The @Autowired annotation in Spring Boot is used for automatic dependency injection. It allows Spring to resolve and inject the appropriate bean into a class.

Key Points:
It can be applied to constructors, fields, and setter methods.
When multiple beans of the same type exist, use @Qualifier to specify which bean to inject.