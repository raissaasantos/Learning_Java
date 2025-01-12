# Learning Java 8

## Table of contents

- [Comentários](#1)
- [Tipos Primitivos](#2)
- [Operadores](#3)
- [Operador Ternario](#4)
- [Arrays](#5)

##
<a name="1">
<h1>Comentários</h1>
</a>
Os métodos públicos na sua classe devem ter um comentário javadoc
<br/>

```
/**
* Comentário javadoc
* /
```

<a name="2">
<h1>Tipos Primitivos</h1>
</a>

```
public class TiposPrimitivos {
    public static void main(String[] args){
        //int, double, float, boolean,char, byte, short, long
        int age = 18;
        long bigNumber = 10000;
        float salaryFloat = 2500;
        double salaryDouble = 2500;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte ageByte = -128;
        char character = '\u0041'; //unicode
        String name = "Raissa";
    }
}
```

<a name="3">
<h1>Operadores</h1>
</a>

```
// + - / *
// %
// < > <= >= != ==
// && (AND) || (OR) ! (NOT)
// = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2; // bonus = bonus * 2
        bonus /= 2; // bonus = bonus / 2
        bonus %= 2; // bonus = bonus % 2
        System.out.println(bonus);

        // Unary ++ --
        int count = 0;
        count ++; // ++count;
        count --;
        System.out.println(count);
```

<a name="4">
<h1>Operador Ternario</h1>
</a>

```
  // if salary > 2000 "buy laptop" "don't buy laptop"
        double salary = 35880;
        String shouldBuyMessage = "buy laptop";
        String shouldNotBuyMessage = "don't buy laptop";
        // (condition) ? <true> : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);
```

<a name="5">
<h1>Arrays</h1>
</a>
- Arrays are considered a object in the memory
- You can not access a nonexistent position

![Captura de tela 2025-01-12 173611](https://github.com/user-attachments/assets/0f4c1f09-cc8e-4337-8055-dfd74bb2326c)

