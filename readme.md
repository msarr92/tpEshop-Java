tpEshop - Microservices Java Spring Boot

Ce projet est une application de démonstration basée sur une architecture **microservices** utilisant **Spring Boot**,
**Spring Cloud Eureka**, et **Spring Cloud Gateway**. Il s'agit d'une gestion des utilisateurs,
des produits, des commandes, etc.

Architecture

L'application est composée des microservices suivants :

**eureka-server** : Serveur d'enregistrement de services (Service Discovery) port:8761
**api-gateway** : Passerelle d'entrée (Gateway) pour router les requêtes HTTP vers les microservices. port:8888
**ProduitService** : Gestion des produits port: 8081
**CommandeService** : Gestion des commandes port: 8083
**CategoryService** : Gestion des category  port: 8082
**UserService** : Gestion des clients  port: 8081

Technologies utilisées

Java 17
Spring Boot
Spring Cloud (Eureka, Gateway)
Maven
Lombok
Spring Web
Spring Data JPA



Prérequis

Java 17+
Maven 3.6+
IDE (IntelliJ, Eclipse, VS Code…)