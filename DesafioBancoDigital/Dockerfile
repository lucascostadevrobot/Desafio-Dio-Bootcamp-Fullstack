# Etapa 1: imagem base com JDK
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR gerado para dentro do container
COPY target/seu-app.jar app.jar

# Porta exposta (ajuste conforme sua aplicação)
EXPOSE 8080

# Comando para rodar o app
ENTRYPOINT ["java", "-jar", "app.jar"]