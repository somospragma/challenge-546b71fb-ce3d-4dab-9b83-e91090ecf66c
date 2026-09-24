# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener un ZIP con el proyecto completo y arrancable.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/test/resources/features/pagos.feature` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/resources/features/validacion.feature` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/resources/features/idempotencia.feature` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/runners/RunCucumberTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/steps/PagoSteps.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/tasks/RealizarPago.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/questions/ElSaldoDisponible.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/interactions/LlamarAPIPagos.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/models/Pago.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/PagoServiceTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/resources/data/pagos.csv` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/ValidacionSteps.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/pragma/payments/IdempotenciaSteps.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Referencias colgando en el codigo que si esta

Cada una rompe la compilacion:

- `src/main/java/com/pragma/payments/application/PagoController.java` — `org.springframework.beans`: El import org.springframework.beans.factory.annotation.Autowired pertenece a org.springframework.beans, pero ninguna dependencia declarada en el pom.xml cubre ese paquete. Falta agregar la dependencia o el import esta mal (libreria equivocada).
- `src/main/java/com/pragma/payments/application/PagoController.java` — `org.springframework.http`: El import org.springframework.http.HttpStatus pertenece a org.springframework.http, pero ninguna dependencia declarada en el pom.xml cubre ese paquete. Falta agregar la dependencia o el import esta mal (libreria equivocada).
- `src/main/java/com/pragma/payments/application/PagoController.java` — `org.springframework.web`: El import org.springframework.web.bind.annotation pertenece a org.springframework.web, pero ninguna dependencia declarada en el pom.xml cubre ese paquete. Falta agregar la dependencia o el import esta mal (libreria equivocada).
- `pom.xml` — `net.serenity-bdd:serenity-bom@4.1.0`: net.serenity-bdd:serenity-bom declara la version 4.1.0, pero Maven Central respondio que esa version no existe. Es una version inventada: reemplazala por una version publicada real, o si no se conoce con certeza, usa el mecanismo centralizado del ecosistema (BOM/parent/platform/version catalog) y no declares una version individual.

## Como saber que terminaste

```bash
mvn clean test-compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Calidad de Software, Especialidad Automatizador, Tecnología QA, Senior

### Brecha de conocimiento
Demuestra su compromiso con la práctica de marcos como TDD y BDD, lo cual ademas de fortalecer su liderazgo, se traduce en la excelencia en calidad del producto, eficiencia del desarrollo y satisfacción del cliente, siendo clave para el éxito general del equipo y del proyecto

### Misión / candidato
Candidato Senior con experiencia en automatización y calidad de software

### Reto
- Tema: TDD - Test Driven Development y BDD - Behavior Driven Development
- Seniority: senior-l2
- Tipo: practical
- Título: Implementación de TDD y BDD en un Sistema de Pagos
- Tiempo estimado: 15 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición de Casos de Prueba con BDD — objetivo: Crear casos de prueba que describan el comportamiento esperado del sistema desde la perspectiva del negocio. — entregable (NO resolver): Casos de prueba en lenguaje de negocio para los principales casos de uso del sistema de pagos.
- Fase 2: Implementación de TDD para Casos de Uso — objetivo: Implementar los casos de prueba definidos en la fase anterior utilizando TDD para guiar el desarrollo del código. — entregable (NO resolver): Código implementado con pruebas unitarias que pasan todos los casos de prueba definidos en la fase 1.
- Fase 3: Integración y Validación del Sistema — objetivo: Integrar las implementaciones de TDD y BDD y validar el sistema completo para asegurar que cumple con los requisitos del negocio. — entregable (NO resolver): Sistema completo de pagos que pasa todas las pruebas de integración y cumple con los casos de prueba definidos en la fase 1.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.pragma</groupId>
    <artifactId>payments</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <serenity.version>4.1.0</serenity.version>
        <cucumber.version>7.15.0</cucumber.version>
        <junit.version>5.10.0</junit.version>
        <selenium.version>4.15.0</selenium.version>
        <rest-assured.version>5.4.0</rest-assured.version>
        <assertj.version>3.25.3</assertj.version>
    </properties>

    <dependencyManagement>
        <dependencies>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>5.14.2</version>
        </dependency>

            <dependency>
                <groupId>net.serenity-bdd</groupId>
                <artifactId>serenity-bom</artifactId>
                <version>${serenity.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <dependencies>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-cucumber</artifactId>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>${cucumber.version}</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit-platform-engine</artifactId>
            <version>${cucumber.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>${rest-assured.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>jakarta.validation</groupId>
            <artifactId>jakarta.validation-api</artifactId>
            <version>3.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>${assertj.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.2.5</version>
                <configuration>
                    <includes>
                        <include>**/*Test.java</include>
                        <include>**/*Tests.java</include>
                        <include>**/Run*.java</include>
                    </includes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>net.serenity-bdd</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.version}</version>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/test/java/com/pragma/payments/models/Pago.java ===
package com.pragma.payments.models;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Pago {
    private UUID id;

    @NotNull(message = "El ID del usuario es obligatorio")
    private UUID usuarioId;

    @NotNull(message = "El número de cuenta origen es obligatorio")
    @Pattern(regexp = "^[0-9]{10,20}$", message = "El número de cuenta debe tener entre 10 y 20 dígitos")
    private String cuentaOrigen;

    @NotNull(message = "El número de cuenta destino es obligatorio")
    @Pattern(regexp = "^[0-9]{10,20}$", message = "El número de cuenta debe tener entre 10 y 20 dígitos")
    private String cuentaDestino;

    @NotNull(message = "El monto es obligatorio")
    @DecimalMin(value = "0.01", message = "El monto debe ser mayor que cero")
    private BigDecimal monto;

    @NotBlank(message = "La moneda es obligatoria")
    @Size(min = 3, max = 3, message = "La moneda debe tener exactamente 3 caracteres")
    private String moneda;

    @NotNull(message = "La fecha de creación es obligatoria")
    private LocalDateTime fechaCreacion;

    @NotBlank(message = "El canal es obligatorio")
    private String canal;

    @NotBlank(message = "El ID de idempotencia es obligatorio")
    private String idempotenciaKey;

    // Constructores, getters y setters
    public Pago() {
        this.id = UUID.randomUUID();
        this.fechaCreacion = LocalDateTime.now();
    }

    public Pago(UUID usuarioId, String cuentaOrigen, String cuentaDestino, BigDecimal monto,
                String moneda, String canal, String idempotenciaKey) {
        this();
        this.usuarioId = usuarioId;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
        this.moneda = moneda;
        this.canal = canal;
        this.idempotenciaKey = idempotenciaKey;
    }

    // Getters y setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UUID usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getIdempotenciaKey() {
        return idempotenciaKey;
    }

    public void setIdempotenciaKey(String idempotenciaKey) {
        this.idempotenciaKey = idempotenciaKey;
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/domain/PagoService.java ===
package com.pragma.payments.domain;


import com.pragma.payments.infrastructure.IdempotenciaException;
import com.pragma.payments.models.Pago;
import java.util.UUID;

public interface PagoService {
    /**
     * Realiza un pago con la información proporcionada.
     * @param pago La solicitud de pago con todos los datos requeridos.
     * @return El pago procesado con su ID generado.
     * @throws SaldoInsuficienteException Si el saldo disponible no es suficiente.
     * @throws ValidacionException Si los datos del pago no son válidos.
     * @throws IdempotenciaException Si ya existe un pago con la misma clave de idempotencia.
     */
    Pago realizarPago(Pago pago) throws SaldoInsuficienteException, ValidacionException, IdempotenciaException;

    /**
     * Consulta el saldo disponible para una cuenta específica.
     * @param cuentaId El ID de la cuenta a consultar.
     * @return El saldo disponible en la cuenta.
     * @throws CuentaNoEncontradaException Si la cuenta no existe.
     */
    BigDecimal consultarSaldo(String cuentaId) throws CuentaNoEncontradaException;

    /**
     * Verifica si ya existe un pago con la misma clave de idempotencia.
     * @param idempotenciaKey La clave de idempotencia a verificar.
     * @return true si ya existe un pago con esa clave, false en caso contrario.
     */
    boolean existePagoPorIdempotencia(String idempotenciaKey);
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/PagoRepository.java ===
package com.pragma.payments.infrastructure;

import com.pragma.payments.models.Pago;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PagoRepository {
    private final Map<UUID, Pago> pagosStorage = new ConcurrentHashMap<>();
    private final Map<String, BigDecimal> saldos = new HashMap<>();
    private final Map<String, String> idempotenciaKeys = new ConcurrentHashMap<>();

    public PagoRepository() {
        // Inicializar saldos de prueba
        saldos.put("1234567890", new BigDecimal("1000.00"));
        saldos.put("0987654321", new BigDecimal("500.00"));
    }

    public Pago guardarPago(Pago pago) {
        if (idempotenciaKeys.containsKey(pago.getIdempotenciaKey())) {
            throw new IdempotenciaException("Ya existe un pago con la misma clave de idempotencia");
        }

        pagosStorage.put(pago.getId(), pago);
        idempotenciaKeys.put(pago.getIdempotenciaKey(), pago.getId().toString());
        return pago;
    }

    public boolean existePagoPorIdempotencia(String idempotenciaKey) {
        return idempotenciaKeys.containsKey(idempotenciaKey);
    }

    public BigDecimal consultarSaldo(String cuentaId) {
        return saldos.getOrDefault(cuentaId, BigDecimal.ZERO);
    }

    public void actualizarSaldo(String cuentaId, BigDecimal nuevoSaldo) {
        saldos.put(cuentaId, nuevoSaldo);
    }

    public Pago buscarPagoPorId(UUID pagoId) {
        return pagosStorage.get(pagoId);
    }

    public static class IdempotenciaException extends RuntimeException {
        public IdempotenciaException(String message) {
            super(message);
        }
    }
}

// === ARCHIVO: src/test/resources/features/pagos.feature ===
Feature: Procesamiento de Pagos

  Scenario: Pago exitoso a través de la web
    Given el usuario ha iniciado sesión
    When realiza un pago de 100 USD desde su cuenta de ahorros
    Then el pago se procesa correctamente

  Scenario: Pago fallido por saldo insuficiente
    Given el usuario ha iniciado sesión
    When intenta realizar un pago de 1000 USD desde su cuenta de ahorros con solo 500 USD
    Then se muestra un mensaje de saldo insuficiente

  Scenario: Pago idempotente a través de la API
    Given el usuario ha iniciado sesión
    When realiza un pago de 50 USD a través de la API con la misma clave de idempotencia
    Then solo se procesa un pago

// === ARCHIVO: src/test/resources/features/validacion.feature ===
Feature: Validación de Información de Usuario

  Scenario: Usuario con información válida
    Given el usuario ha proporcionado información de pago válida
    When se valida la información del usuario
    Then la información se considera válida

  Scenario: Usuario con información inválida
    Given el usuario ha proporcionado información de pago inválida
    When se valida la información del usuario
    Then se muestra un mensaje de error

// === ARCHIVO: src/test/resources/features/idempotencia.feature ===
Feature: Validación de Idempotencia en Transacciones

  Scenario: Pago idempotente desde múltiples canales
    Given el usuario ha iniciado sesión
    When realiza un pago de 50 USD desde la web y luego desde la aplicación móvil con la misma clave de idempotencia
    Then solo se procesa un pago

  Scenario: Pago no idempotente
    Given el usuario ha iniciado sesión
    When realiza dos pagos consecutivos de 50 USD desde la web con claves de idempotencia diferentes
    Then se procesan ambos pagos

// === ARCHIVO: src/test/java/com/pragma/payments/runners/RunCucumberTest.java ===
package com.pragma.payments.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.pragma.payments.steps",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        }
)
public class RunCucumberTest {
}

// === ARCHIVO: src/test/java/com/pragma/payments/steps/PagoSteps.java ===
package com.pragma.payments.steps;

import com.pragma.payments.tasks.RealizarPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class PagoSteps {
    @Step("{0} realiza un pago de {1} a {2}")
    public void realizarPago(Actor actor, String monto, String cuentaDestino) {
        actor.attemptsTo(
                RealizarPago.conMontoYCuenta(monto, cuentaDestino)
        );
    }

    @Step("{0} verifica que el saldo de {1} es {2}")
    public void verificarSaldo(Actor actor, String cuenta, String saldoEsperado) {
        actor.attemptsTo(
                Ensure.that(Text.of(cuenta)).isEqualTo(saldoEsperado)
        );
    }
}

// === ARCHIVO: src/test/java/com/pragma/payments/tasks/RealizarPago.java ===
package com.pragma.payments.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarPago implements Task {

    private String monto;
    private String cuentaDestino;

    public static RealizarPago conMontoYCuenta(String monto, String cuentaDestino) {
        return instrumented(RealizarPago.class, monto, cuentaDestino);
    }

    public RealizarPago(String monto, String cuentaDestino) {
        this.monto = monto;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    @Step("#actor realiza un pago de #monto a #cuentaDestino")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://example.com/pagos"),
                Post.to("/realizarPago").with(
                        request -> request.body("{\"monto\":\"" + monto + "\",\"cuentaDestino\":\"" + cuentaDestino + "}")
                )
        );
    }
}

// === ARCHIVO: src/test/java/com/pragma/payments/questions/ElSaldoDisponible.java ===
package com.pragma.payments.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionBuilder;

public class ElSaldoDisponible implements Question<BigDecimal> {
    @Override
    public BigDecimal answeredBy(Actor actor) {
        // Implementar lógica para obtener el saldo disponible
        return null;
    }

    public static QuestionBuilder<BigDecimal> saldoDisponible() {
        return new QuestionBuilder<>();
    }
}

// === ARCHIVO: src/test/java/com/pragma/payments/interactions/LlamarAPIPagos.java ===
package com.pragma.payments.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;

public class LlamarAPIPagos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Implementar lógica para llamar a la API de pagos
    }

    public static Interaction llamarAPIPagos() {
        return new LlamarAPIPagos();
    }
}

// === ARCHIVO: src/test/java/com/pragma/payments/PagoServiceTest.java ===
package com.pragma.payments;


import com.pragma.payments.infrastructure.PagoRepository;
import com.pragma.payments.domain.PagoService;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class PagoServiceTest {

    @Mock
    private PagoRepository pagoRepository;

    @InjectMocks
    private PagoService pagoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void realizarPagoTest() {
        // Implementar lógica de prueba para realizarPago
    }

    @Test
    public void consultarSaldoTest() {
        // Implementar lógica de prueba para consultarSaldo
    }

    @Test
    public void existePagoPorIdempotenciaTest() {
        // Implementar lógica de prueba para existePagoPorIdempotencia
    }
}

// === ARCHIVO: src/test/resources/data/pagos.csv ===
id,usuarioId,cuentaOrigen,cuentaDestino,monto,moneda,fechaCreacion,canal,idempotenciaKey
1,123e4567-e89b-12d3-a456-426614174000,1234567890,9876543210,100.00,USD,2024-06-01T10:00:00,WEB,abc123
2,123e4567-e89b-12d3-a456-426614174000,1234567890,9876543210,200.00,USD,2024-06-01T10:00:00,WEB,abc123

// === ARCHIVO: src/test/java/com/pragma/payments/ValidacionSteps.java ===
package com.pragma.payments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ValidacionSteps {

    @Given("el usuario con ID {string} existe")
    public void elUsuarioConIDExiste(String usuarioId) {
        // Implementar
    }

    @When("el usuario intenta realizar un pago")
    public void elUsuarioIntentaRealizarUnPago() {
        // Implementar
    }

    @Then("se valida la informacion del usuario")
    public void seValidaLaInformacionDelUsuario() {
        // Implementar
    }

    @Then("el pago es rechazado por informacion invalida")
    public void elPagoEsRechazadoPorInformacionInvalida() {
        // Implementar
    }
}

// === ARCHIVO: src/test/java/com/pragma/payments/IdempotenciaSteps.java ===
package com.pragma.payments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class IdempotenciaSteps {

    @Given("un pago con clave de idempotencia {string} existe")
    public void unPagoConClaveDeIdempotenciaExiste(String idempotenciaKey) {
        // Implementar
    }

    @When("el usuario intenta realizar el mismo pago")
    public void elUsuarioIntentaRealizarElMismoPago() {
        // Implementar
    }

    @Then("el pago no se duplica")
    public void elPagoNoSeDuplica() {
        // Implementar
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/application/PagoController.java ===
package com.pragma.payments.application;

import com.pragma.payments.domain.PagoService;
import com.pragma.payments.models.Pago;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    private final PagoService pagoService;

    @Autowired
    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public ResponseEntity<Pago> realizarPago(@Valid @RequestBody Pago pago) {
        Pago pagoRealizado = pagoService.realizarPago(pago);
        return new ResponseEntity<>(pagoRealizado, HttpStatus.CREATED);
    }

    @GetMapping("/saldo/{cuentaId}")
    public ResponseEntity<BigDecimal> consultarSaldo(@PathVariable String cuentaId) {
        BigDecimal saldo = pagoService.consultarSaldo(cuentaId);
        return new ResponseEntity<>(saldo, HttpStatus.OK);
    }

    @GetMapping("/idempotencia/{idempotenciaKey}")
    public ResponseEntity<Boolean> existePagoPorIdempotencia(@PathVariable String idempotenciaKey) {
        boolean existe = pagoService.existePagoPorIdempotencia(idempotenciaKey);
        return new ResponseEntity<>(existe, HttpStatus.OK);
    }
}

// === ARCHIVO: serenity.conf ===
serenity = {
    project = "payments",
    outputDirectory = "target/site/serenity",
    environment = "local",
    drivers = "chrome"
}
```
