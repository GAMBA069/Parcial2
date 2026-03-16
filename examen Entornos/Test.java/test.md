// ...existing code...
# TESTING - Análisis de caja negra para Empleado

## Parámetros
| Parámetro | Tipo | Restricción |
|---|---:|---|
| nombre | String | No nulo, no vacío, al menos 2 palabras |
| cargo | Cargo | Debe estar en el enum Cargo |
| salario | double | No NaN, >= 0 y >= Constantes.MIN_SALARIO_CONVENIO |

## Casos válidos
| Caso | nombre | cargo | salario |
| V1 | "Ana María" | DESARROLLADOR | MIN_SALARIO_CONVENIO |
| V2 | "Juan Pérez" | GERENTE | 50000 |

## Casos no válidos
| Caso | nombre | cargo | salario |
| N1 | "" | DESARROLLADOR | MIN_SALARIO_CONVENIO |
| N2 | "Carlos" | GERENTE | MIN_SALARIO_CONVENIO |
| N3 | "Luis Pérez" | null | MIN_SALARIO_CONVENIO |
| N4 | "Laura Ruiz" | DISENADORA | -1 |
| N5 | "Luis Martínez" | DISENADORA | MIN_SALARIO_CONVENIO - 1 |
