# 🦸 Universidade UA – Jornada de Heróis em Java

![Midnight](./assets/img/prof.midnight.png)
---

# 📚 Treinamento U.A. – Dia 3: Anotações & Varargs (Java 5)

> _“Elegância e precisão… essa é a assinatura da Midnight.”_ – **Prof. Midnight**

---

## 📝 Conteúdo Heroico

### 🏷️ Anotações (Annotations)

- São **metadados** que informam o compilador ou ferramentas externas sobre a estrutura do código.
- Exemplos comuns: `@Override`, `@Deprecated`, `@SuppressWarnings`
- **Vantagens**:
    - Previnem erros
    - Melhoram a legibilidade
    - Podem ser processadas por reflexão ou bibliotecas externas

#### ✅ Exemplo com @Override:

```java
class Heroina {
    public void apresentar() {
        System.out.println("Sou uma heroína.");
    }
}

class Midnight extends Heroina {
    @Override
    public void apresentar() {
        System.out.println("Midnight pronta para ensinar e controlar. 💋");
    }
}
```

---

### 🧪 Criando sua própria annotation

```java

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Heroico {
    String valor() default "Desconhecido";
}
```

#### Leitura via reflexão:

```java
Method m = Classe.class.getMethod("metodo");
Heroico h = m.getAnnotation(Heroico.class);
System.out.

println(h.valor());
```

---

## ✨ Missão Extra (Plus Ultra)

Criar a annotation `@Missao` com os campos:

- `nivel()` – Ex: "S", "A", "B"
- `urgente()` – booleano

---

## 🧩 Varargs (Java 5)

- Usado quando não se sabe **quantos argumentos** serão passados

```java
public void listar(String... itens) {
    for (String item : itens) {
        System.out.println(item);
    }
}
```

- Regras:
    - Apenas um por método
    - Sempre no final dos parâmetros

---

## 💬 Resumo de hoje

| Tema        | Aprendizado Chave                                      |
|-------------|--------------------------------------------------------|
| Annotations | Enriquecem o código com metadados e evitam bugs        |
| Varargs     | Flexibilizam a entrada de dados                        |
| Criação     | `@interface`, `@Retention`, `@Target` são essenciais   |
| Reflexão    | Permite ler annotations em tempo de execução (RUNTIME) |

---

## ⏰ Tempo de treinamento

- **Início**: 20:47
- **Duração**: ~1h
- **Status**: 💯 CONCLUÍDO COM ÊXITO

---

**Continue treinando, Midoriya. O seu código… está ficando mais heroico a cada linha.**  
– *Prof. Midnight* 💋
