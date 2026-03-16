# Parcial 2 - Gestión de Empleados

Resumen:
- Proyecto Java simple para gestionar empleados.
- Clases: Empleado, Empleados, Cargo (enum), Constantes, SistemaGestionEmpleados (main).
- Tests unitarios con JUnit 5 en tests/EmpleadoTest.java.

Autor: Tu Nombre
Versión: 1.0

Cómo compilar y ejecutar (CMD / PowerShell desde c:\Users\322780\Desktop\examen Entornos):

1) Compilar las clases:
   javac *.java

2) Ejecutar la aplicación:
   java SistemaGestionEmpleados

Ejecutar tests con junit-platform-console-standalone:
1) Descargar jar (por ejemplo versión 1.9.3):
   https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar
   Guardar como junit-platform-console-standalone.jar en la carpeta del proyecto.

2) Compilar tests y clases:
   javac -cp .;junit-platform-console-standalone.jar tests\EmpleadoTest.java *.java

3) Ejecutar tests:
   java -jar junit-platform-console-standalone.jar --classpath . --scan-classpath

Publicación en GitHub (comandos resumidos):
git init
git add .
git commit -m "Refactorización completa - Parcial 2"
Crear repo remoto "Parcial 2" en GitHub
git remote add origin https://github.com/TU_USUARIO/Parcial-2.git
git branch -M main
git push -u origin main
