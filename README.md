# Java 学习笔记

大二 Java 课程练习，按教材小节编号组织，覆盖基础语法、面向对象、异常、IO、网络与 Stream。

## 目录

| 路径 | 内容 |
|------|------|
| `1.1.2/` | 包与类的基础练习（`myPackage`，含 Cat / Dog 等类） |
| `1.2.1/`、`1.2.2/` | 变量、数据类型与运算符 |
| `1.2.4数组/` | 数组 |
| `1.2.5异常处理/` | 异常处理入门 |
| `1.3.1顺序/` | 顺序结构 |
| `1.3.1 循环（for）/`、`1.3.1 循环（while）/`、`1.3.1 循环（break和continue）/` | 循环与跳转 |
| `1.4方法/` | 方法定义与调用 |
| `1/` | 第一个 Java 程序 |
| `2.1类和对象/` | 类与对象 |
| `javaTest/test1/` | 控制台输入输出 |
| `javaTest/test2/` | 流程控制：`switch`、循环、跳转 |
| `javaTest/test3/` | 类、封装与继承：`Student`、`Animal`、员工体系等 |
| `javaTest/test4/` | 抽象类（`abstract_test`）与接口（`jiekou`） |
| `javaTest/test5/` | 异常、文件与 IO、Socket 通信、Stream |

## 运行方式

- 顶层 `X.Y.Z/` 与 `2.1类和对象/` 是独立的 IntelliJ IDEA 工程，用 IDEA 打开对应目录，运行其中的 `main` 方法即可。
- `javaTest/` 下是普通源码，可直接编译运行：

```bash
javac javaTest/test1/InputOutput.java
java -cp javaTest/test1 InputOutput
```

## 说明

- 仓库中提交了 `out/`、`*.class`、`*.iml`、`.vscode/` 等编译和 IDE 产物，属于历史遗留。后续新增代码时建议用 `.gitignore` 排除，只保留 `.java` 源码。
- 各目录按教材小节命名，方便对照课本复习；`javaTest/` 则按主题重新组织。

## 环境

- JDK 8 及以上
- IntelliJ IDEA（推荐）或任意文本编辑器 + `javac`
