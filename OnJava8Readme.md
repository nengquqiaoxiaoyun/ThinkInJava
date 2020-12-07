Thinking in Java和On Java 8读书笔记（只记录了对我来说的重点）

[On Java 8](https://lingcoder.github.io/OnJava8/#/)

## 第一章 对象导论

### 1.1 抽象过程

所有编程语言都提供抽象机制。

OOP允许根据问题来描述问题，而不是根据运行解决方案的计算机来描述问题。但是它仍然与计算机有联系：每个对象看起来都有点像一台微型计算机—它具有状态，还具有操作，用户可以要求对象执行这些操作。

### 1.2 每个对象都有一个接口

所有的对象都是唯一的，但同时也是具有相同的特性和行为的对象所归属的类的一部分。

### 1.3 每个对象都提供服务

当开发或理解一个程序设计时，最好的方法是将对象想象为“服务提供者”，程序本身向用户提供服务。我们的目标就是去创建（或使用已存在的）能够提供理想的服务来解决问题的一系列对象。

人们在设计面向对象时所面临的一个问题是，将过多的功能都塞在一个对象中。

在良好的面向对象设计中，每个对象都可以很好地完成一项任务，但是它并不试图做更多的事情。

### 1.4 被隐藏的具体实现 （封装）

如果所有的类成员对任何人都是可用的，那么客户端程序员（调用方）就可以对类做任何事情。将实现隐藏起来，创建者可以任意修改而不用担心对其他人造成影响。（对他人造成影响是说，随意修改属性值可能对他人的值产生影响。公开的属性将直接拿到真正的对象，而get拿到的是对象的副本，可变类除外）

### 1.5 复用具体实现

组合（Composition）继承被视为“has a”（拥有）关系。

在建立新类时，应该优先考虑组合，因为它更加简单灵活。

### 1.7 伴随多态的可互换对象

在OOP中，程序知道运行时才能够确定代码的地址。面向对象程序设计语言使用了后期绑定的概念。当向被调用的代码发出消息时，被调用的代码直到运行时才能确定。Java使用一小段特殊的代码来替代绝对地址调用。这段代码使用在对象中存储的信息来计算方法体的地址。这样，根据这一小段代码的内容， 每个对象都可以具有不同的行为表现。当向一个对象发送消息时，该对象就能够知道对这条消息做什么。

Java的动态绑定是默认行为。

### 1.8 单继承结构

单根继承结构使垃圾回收器的实现变得容易得多。由于所有的对象都保证具有其类型信息，因此不会因为无法确定对象的类型而陷入僵局。

### 1.10 对象的创建和生命周期

垃圾回收器“知道”对象何时不再被使用，并自动释放对象占用的内存。这一点同所有对象都是继承自单根基类Object以及**只能以一种方式创建对象（在堆上创建）**这两个特性结合起来

### 1.14 总结

通常按照 Java 规范编写的程序会比面向过程程序更容易被理解。

你看到的是对象的概念，这些概念是站在“问题空间”（问题本身）的（而不是站在计算机角度的“解决方案空间”），以及发送消息给对象以指示该空间中的活动。面向对象编程的一个优点是：设计良好的 Java 程序代码更容易被人阅读理解。由于 Java 类库的复用性，通常程序要写的代码也会少得多。

## 第二章 

#### 2.2.1 存储位置

对象引用存放于栈中，对象存在堆中

基本类型取决于全局变量还是局部变量，全局变量放置堆中，局部变量放置栈中

#### 练习2

```java
/**
 * * 2.
 * * Create a class with a String field initialized
 * * at the point of definition, and another one
 * * initialized by the constructor. What is the
 * * difference between the two approaches?
 * <p>
 * 调用构造器
 * 按照属性的声明顺序
 * str 在构造器初始化前初始化了
 * conStr 被初始化为null
 * 执行构造器的主体
 * conStr 被赋值
 * conStr 更加灵活，可以通过构造器传参设置
 */
class Demo2 {
    private String str = "initialized";
    private String conStr;

    public Demo2() {
        this.conStr = "init by con";
    }

}
```

### 5.4 this关键字

为了能用简便、面向对象的语法来编写代码—即“发送消息给对象”，编译器做了一些幕后工作。它暗自把“所操作对象的引用”作为第一个参数传递给了方法。

```java
class Banana {
    void peel(int i) {
        /*...*/
    }
}
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
```

因此，上述的方法调用像这个样子

```java
Banana.peel(a, 1)
Banana.peel(b, 2)
```

但是，对象引用是被秘密地传达给编译器——并不在参数列表中。

this关键字表示对“调用方法的那个对象”的引用，this对象只能在方法内部使用。

尽管可以使用this调用一个构造器，但却不能调用两个。必须将构造器调用写在构造方法的最上面，否则编译器会报错

除了构造方法外，编译器禁止在其他任何方法中调用构造器

### 5.5 清理：终结处理和垃圾回收

一旦垃圾回收器准备好释放对象占用的存储空间，将首先调用其finalize方法，并且在下一次垃圾回收动作发生时，才会真正回收对象占用的内存。

Java里的对象并非总是被垃圾回收：

1. 对象可能不被垃圾回收
2. 垃圾回收只和内存有关

如果程序执行结束，并且垃圾回收器一直都没有释放你创建的任何对象的存储空间，则随着程序的退出，那些资源也会全部交还给操作系统。

对于与垃圾回收有关的任何行为来说（尤其是finalize方法），它们也必须同内存及其回收有关

#### 5.5.3 终结条件

finalize可以用来做”对象终结条件“的验证，如果某次finalize的动作使得可能的缺陷被发现，那么就可以根据此找出问题的所在

```java
lass Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
        new Nap(1); // One second delay
    }

}
```

### 5.7 构造器初始化

无法阻止自动初始化的进行，它将在构造器被调用之前发生。变量定义的先后顺序决定了初始化的顺序。

#### 5.7.2 静态数据的初始化

无论创建多少个对象，静态数据都只占用一分存储区域。static关键字不能应用于局部变量，因此它只能作用于域。

## 第七章 复用类

#### 7.2.1 初始化基类

即使不为子类创建构造器，编译器也会为你合成一个默认的构造器，该构造器将调用父类的构造器

## 第九章 接口

### 9.7 接口中的域

接口中的域都是被static final修饰的

在接口中定义的域不能是”空final“（在使用时初始化），但是可以被非常量表达式初始化

## 第14章 类型信息

![image-20201207091016672](assets/image-20201207091016672.png)

