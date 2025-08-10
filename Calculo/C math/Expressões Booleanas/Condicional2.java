//ESTRUTURAS CONDICIONAIS EM JAVA - AULA 10 
public class Condicional2 {
    public static void main(String[] args) throws Exception{
// ESTRUTURA IF SIMPLES 
System.out.println("=== ESTRUTURA IF SIMPLES ===");
int idade = 18;
if (idade >= 18) {
    System.out.println("Você é maior de idade!");
}
//ESTRUTURA IF-ELSE
System.out.println("\n=== ESTRUTURA IF-ELSE ===");
double nota = 7.5; 
if (nota >= 7.0) {
    System.out.println("Aprovado! Nota: " + nota);
} else {
    System.out.println("Reprovado! Nota: " + nota);
}
//ESTRUTURA IF-ELSE IF-ELSE 
System.out.println("\n=== ESTRUTURA IF-ELSE IF-ELSE ===");
int pontuacao = 85;
if (pontuacao >= 90) {
    System.out.println("Conceito A - Excelente!");
} else if (pontuacao >= 80){
    System.out.println("Conceito B - Muito bom!");
} else if (pontuacao >= 70){
    System.out.println("Conceito C - Bom!");
} else if (pontuacao >= 60){
    System.out.println("Conceito D - Regular!");
} else {
    System.out.println("Conceito F - Insuficiente!");
}
//OPERADORES DE COMPARAÇÃO
System.out.println("\n=== OPERADORES DE COMPARAÇÃO ===");
int a = 10; 
int b = 5;
System.out.println("a = " + a + ", b = " + b);
        System.out.println("a > b: " + (a > b));    // maior que
        System.out.println("a < b: " + (a < b));    // menor que
        System.out.println("a >= b: " + (a >= b));  // maior ou igual
        System.out.println("a <= b: " + (a <= b));  // menor ou igual
        System.out.println("a == b: " + (a == b));  // igual
        System.out.println("a != b: " + (a != b));  // diferente

//OPERADORES LÓGICOS 
System.out.println("\n=== OPERADORES DE LÓGICOS ====");
boolean temCarteiraMotorista = true;
int idadeMotorista = 20;
//Operador AND (&&)
if (temCarteiraMotorista && idadeMotorista >= 18) {
System.out.println("Pode dirigir!");
}

//Operador OR (||) 
boolean temDesconto = false;
boolean ehEstudante = true;

if (temDesconto || ehEstudante){
    System.out.println("Pode Sair sem guarda-chuva!");
}

//ESTRUTURA SWITCH-CASE
System.out.println("\n=== ESTRUTURA SWITCH-CASE ===");
int diaSemana = 3;

switch (diaSemana) {
    case 1:
    System.out.println("Segunda-feira");
    break;
    case 2:
    System.out.println("Terça-feira");
    break;
    case 3:
    System.out.println("Quarta-feira");
    break;
    case 4:
    System.out.println("Quinta-feira");
    break;
    case 5:
    System.out.println("Sexta-feira");
    break;
    case 6:
    System.out.println("Sábado");
    break;
    case 7:
    System.out.println("Domingo");
    break;
    default:
    System.out.println("Dia inválido");
}
//SWITCH COM STRINGS (Java 7+)
System.out.println("\n=== SWITCH COM STRING ===");
String mes = "Janeiro";

switch (mes) {
    case "Janeiro":
    case "Fevereiro":
    case "Março":
    System.out.println("Primeiro trimestre");
    break;
    case "Abril":
    case "Maio":
    case "Junho":
    System.out.println("Segundo trimestre");
    break;
    case "Julho":
    case "Agosto":
    case "Setembro":
    System.out.println("Terceiro trimestre");
    break;
    case "Outubro":
    case "Novembro":
    case "Dezembro":
    System.out.println("Quarto trimestre");
    break;
    default:
    System.out.println("Mês inválido");
}

//OPERADOR TERNÁRIO 
System.out.println("\n=== OPERADOR TERNÁRIO ===");
int numero = 15;
String resultado = (numero %2 == 0) ? "Par" : "Ímpar";
System.out.println("O número " + numero + " é " + resultado);

//CONDIÇÃO ANINHADAS 
System.out.println("\n=== CONDIÇÕES ANINHADAS ===");
int temperatura = 25;
boolean temSol = true;

if (temperatura > 20){
    if (temSol){
        System.out.println("Dia prfeito para ir à praia!");
    } else {
        System.out.println("Dia bom, mas sem sol.");
    }
} else {
    System.out.println("Dia frio, melhor ficar em casa.");
}

//CALCULADORA SIMPLES
System.out.println("\n=== EXEMPLO PRÁTICO CALCULADORA ===");
double num1 = 10;
double num2 = 3;
char operacao = '/';

switch (operacao) {
    case '+':
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    break;
    case '-':
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    break;
    case '*':
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    break;
    case '/':
    if (num2 != 0){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    } else {
        System.out.println("Erro: Divisão por zero!");
    }
    break;
    default:
    System.out.println("Operação inválida!");
}
    }
}


