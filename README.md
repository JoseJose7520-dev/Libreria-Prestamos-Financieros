# 💰LibreriaPrestamos📚

**PrestamosFinancieros** es una librería desarrollada en Java para realizar cálculos financieros de manera sencilla y eficiente. Permite calcular **interés simple**, **interés compuesto**, **montos finales** y **pagos mensuales**, siendo ideal para:

- Simuladores de créditos y préstamos.
- Aplicaciones de gestión financiera.
- Aprendizaje de matemáticas financieras en programación.

# 📝Explicación del código

1. **Clase: PrestamosFinancieros** ✒️
- Es una clase pública que contiene métodos estáticos para cálculos financieros.
- No requiere instanciar objetos para usar sus métodos, ya que todos son static.

2. **Metodos**📌

| Método                                                                        | Descripción                                                          |
| ----------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `calcularInteresSimple(double capital, double tasa, int tiempo)`              | Calcula el interés simple de un préstamo.                            |
| `calcularInteresCompuesto(double capital, double tasa, int tiempo)`           | Calcula el interés compuesto acumulado.                              |
| `calcularMontoFinalInteresSimple(double capital, double tasa, int tiempo)`    | Retorna el monto final sumando el interés simple al capital inicial. |
| `calcularMontoFinalInteresCompuesto(double capital, double tasa, int tiempo)` | Retorna el monto final aplicando interés compuesto.                  |
| `calcularPagoMensual(double capital, double tasaMensual, int numeroMeses)`    | Calcula el pago mensual fijo de un préstamo (cuota).                 |
| `convertirTasaAnualAMensual(double tasaAnual)`                                | Convierte una tasa de interés anual a su equivalente mensual.        |

3.- **Variables y parámetros**

| Variable / Parámetro | Tipo   | Descripción                                                               |
| -------------------- | ------ | ------------------------------------------------------------------------- |
| `capital`            | double | Monto inicial del préstamo o inversión.                                   |
| `tasa`               | double | Tasa de interés en formato decimal (ej. 0.12 para 12%).                   |
| `tiempo`             | int    | Tiempo del préstamo en años (o meses según contexto de uso).              |
| `tasaMensual`        | double | Tasa de interés mensual en decimal.                                       |
| `numeroMeses`        | int    | Número total de meses para pagar el préstamo.                             |
| `interes`            | double | Variable interna que guarda el resultado del cálculo de interés.          |
| `montoFinal`         | double | Variable interna que guarda el monto total después de aplicar el interés. |
| `pagoMensual`        | double | Resultado del cálculo de cuota mensual fija.                              |

4.- **Validaciones**

| Método                     | Descripción                                                                                                                                         |
| -------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `validarCapitalTasaTiempo` | Verifica que el capital sea mayor a cero, la tasa no sea negativa y el tiempo sea mayor a cero para los métodos que reciben estos parámetros.       |
| `validarCapitalTasaMeses`  | Verifica que el capital sea mayor a cero, la tasa mensual no sea negativa y el número de meses sea mayor a cero para el cálculo de pagos mensuales. |

# 📦Instrucciones para importar el .jar en otro proyecto

1. Descarga el archivo **`LibreriaPrestamosFinancieros.jar`** desde este repositorio.
2. Abre tu proyecto Java en NetBeans o VSCode.
3. Haz clic derecho en **Libraries → Add JAR/Folder**.
4. Selecciona el archivo `.jar` descargado y haz clic en **Add**.
5. Importa la clase en tu código Java:

## 📄 Documentación Javadoc

Puedes ver la documentación completa aquí:  
[Ver documentación Javadoc](javadoc/Libreria/PrestamosFinancieros.html)

# 📷Capturas del Uso en una clase Main y JFrame Form
<img width="500" height="323" alt="imagen" src="https://github.com/user-attachments/assets/ef3c3fd1-0d43-4270-834b-bc7e057f5f74" />
<img width="603" height="563" alt="imagen" src="https://github.com/user-attachments/assets/e480f42b-1267-4ced-a1d9-a65f4c014d23" />
<img width="602" height="555" alt="imagen" src="https://github.com/user-attachments/assets/aeed3acf-6e9c-448e-807a-5fe0cfaeca35" />
<img width="603" height="562" alt="imagen" src="https://github.com/user-attachments/assets/d75da99a-d4cd-424d-a37c-f4473045d94b" />


