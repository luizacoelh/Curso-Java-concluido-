// código incremento 

| Sintaxe      | Nome técnico   | O que faz                                       |
| ------------ | -------------- | ----------------------------------------------- |
| `contador++` | pós-incremento | **Usa o valor primeiro**, depois **incrementa** |
| `++contador` | pré-incremento | **Incrementa primeiro**, depois **usa o valor** |
```
int contador = 5;

System.out.println(contador++); // Imprime 5, depois contador vira 6
System.out.println(++contador); // Incrementa para 7, e imprime 7

````


| Linha                             | Valor impresso | Valor de `contador` depois |
| --------------------------------- | -------------- | -------------------------- |
| `System.out.println(contador++);` | 5              | 6                          |
| `System.out.println(++contador);` | 7              | 7                          |

· Em laços como for, geralmente não faz diferença:

``for (int i = 0; i < 10; i++) { ... } // i++ ou ++i aqui = mesmo efeito
``
