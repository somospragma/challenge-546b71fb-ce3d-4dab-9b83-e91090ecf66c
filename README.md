# Implementación de TDD y BDD en un Sistema de Pagos

En el contexto de un sistema de pagos en una entidad financiera, el equipo de calidad de software necesita implementar prácticas de TDD y BDD para asegurar la calidad del producto y la satisfacción del cliente. El sistema debe manejar solicitudes de pago, validar la información del usuario, consultar el saldo disponible y realizar la transacción. Los pagos pueden provenir de múltiples canales (web, móvil, API) y deben ser idempotentes para evitar duplicados. El sistema debe también notificar al sistema de auditoría cada transacción exitosa.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | TDD - Test Driven Development y BDD - Behavior Driven Development |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 15 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Casos de Prueba con BDD

**Objetivo:** Crear casos de prueba que describan el comportamiento esperado del sistema desde la perspectiva del negocio.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Identificar los casos de uso principales del sistema de pagos.
- Escribir casos de prueba en lenguaje de negocio que describan el comportamiento esperado para cada caso de uso.
- Asegurar que los casos de prueba cubran tanto el flujo principal como los casos borde.

**Entregable:** Casos de prueba en lenguaje de negocio para los principales casos de uso del sistema de pagos.

<details>
<summary>Pistas de conocimiento</summary>

- Considerar cómo el lenguaje de negocio puede ser traducido a código.
- Identificar los actores y sus interacciones en el dominio de los pagos.

</details>

### Fase 2: Implementación de TDD para Casos de Uso

**Objetivo:** Implementar los casos de prueba definidos en la fase anterior utilizando TDD para guiar el desarrollo del código.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Escribir pruebas unitarias para cada caso de prueba definido en la fase 1.
- Implementar el código necesario para hacer pasar las pruebas unitarias.
- Asegurar que el código cumple con los criterios de aceptación definidos en los casos de prueba.

**Entregable:** Código implementado con pruebas unitarias que pasan todos los casos de prueba definidos en la fase 1.

<details>
<summary>Pistas de conocimiento</summary>

- Priorizar la simplicidad y la claridad en el código.
- Utilizar refactorización para mejorar la calidad del código a medida que se implementan las pruebas.

</details>

### Fase 3: Integración y Validación del Sistema

**Objetivo:** Integrar las implementaciones de TDD y BDD y validar el sistema completo para asegurar que cumple con los requisitos del negocio.

**Tiempo estimado:** 5 horas

**Instrucciones:**

- Integrar las implementaciones de TDD y BDD en un sistema completo.
- Realizar pruebas de integración para asegurar que todos los componentes trabajan juntos correctamente.
- Validar el sistema contra los casos de prueba definidos en la fase 1 para asegurar que cumple con los requisitos del negocio.

**Entregable:** Sistema completo de pagos que pasa todas las pruebas de integración y cumple con los casos de prueba definidos en la fase 1.

<details>
<summary>Pistas de conocimiento</summary>

- Utilizar técnicas de pruebas de integración para asegurar la coherencia del sistema.
- Realizar validaciones adicionales para asegurar la calidad del producto.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es TDD y cómo se relaciona con BDD en el contexto del sistema de pagos?
- **paraQueSirve**: ¿Para qué sirve implementar TDD y BDD en un sistema de pagos?
- **comoSeUsa**: ¿Cómo se usan TDD y BDD para guiar el desarrollo y asegurar la calidad del sistema de pagos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar TDD y BDD y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de TDD y BDD en un sistema de pagos?

## Criterios de Evaluacion

- Definir casos de prueba en lenguaje de negocio que describan el comportamiento esperado del sistema.
- Implementar pruebas unitarias utilizando TDD para guiar el desarrollo del código.
- Integrar las implementaciones de TDD y BDD en un sistema completo y validar contra los casos de prueba definidos.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT). Devuelve un ZIP con el proyecto. Sirve si no tenes un agente en el IDE.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean test-compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
