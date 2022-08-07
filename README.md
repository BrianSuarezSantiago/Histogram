<a href="https://www.java.com/">
    <img align="right" src="https://custom-icon-badges.herokuapp.com/badge/Java-E8E8E8.svg?logo=Java" alt="Java">
</a>

<h1 align="center">📊 Histogram 📉</h1>


<p align="center">
    <img src="./assets/Execution of Histogram.gif" alt="Histogram Execution">
    <sub>· Execution of Histogram ·</sub>
</p>


## 📚 Fundamentals

The software available in this repository allows the calculation of a histogram, that is, given an array of integer values, the frequency of occurrence of each of the values in the array is obtained.

Similarly, other versions introduce the ability to obtain a histogram from an array formed by string values, as well as, to obtain a generic implementation of this histogram independent of the data type used. The software consists of five versions where different implementations of the histogram are made using a Java *Map* type collection.


## 👨🏻‍💻 Implementation

The development of this practice consists of the creation in the first versions of a Main class that implements the histogram obtaining the number of occurrences of each of the values contained in an array of integer type and in the later versions the creation of a class called Histogram for the realization of the histogram regardless of the type of data handled, as well as, obtaining certain information related to it.

### 1️⃣ <ins>First version:</ins>

The first version performs a simple implementation of the histogram by obtaining the number of occurrences of each of the integer values contained in the array, using a *Map* collection provided by the Java API.

<img src="./diagrams/Kata 2. Version 1.png" alt="Kata 2. Version 1 Class Diagram" width="200px" height="100px">

### 2️⃣ <ins>Second Version:</ins>

The first version performs a simple implementation of the histogram by obtaining the number of occurrences of each of the integer values contained in the array, using a *Map* collection provided by the Java API. However, the significant change introduced in this version is the use of the ternary operator as a control structure to verify whether or not the array contains a certain value and thus count the occurrences of the same. The histogram keys represent the data contained in the array.

<img src="./diagrams/Kata 2. Version 2.png" alt="Kata 2. Version 2 Class Diagram" width="200px" height="100px">

### 3️⃣ <ins>Third Version:</ins>

The third version introduces the Histogram class that will be in charge of supplying the public methods necessary to create a histogram, as well as obtaining information related to it. However, the Main class is limited to the creation of a Histogram type object and the consequent call to the *getHistogram()* method of the said class to obtain a histogram.

<img src="./diagrams/Kata 2. Version 3.png" alt="Kata 2. Version 3 Class Diagram" width="250px" height="200px">

### 4️⃣ <ins>Fourth Version:</ins>

The fourth version introduces the capability of having a generic class called Histogram with the necessary public methods to create a histogram independent of the type of data to be handled, as well as for getting information related to it. However, the significant change introduced in the Main class concerning previous versions is the declaration of the array data as the wrapper of the primitive type int, that is, Integer.

<img src="./diagrams/Kata 2. Version 4.png" alt="Kata 2. Version 4 Class Diagram" width="250px" height="200px">

### 5️⃣ <ins>Fifth Version:</ins>

The fifth version takes advantage of the generic implementation of the Histogram class introduced in the fourth version and introduces as a significant change in the Main class the use of String data type to obtain a histogram whose values are literal types.

<img src="./diagrams/Kata 2. Version 5.png" alt="Kata 2. Version 5 Class Diagram" width="250px" height="200px">


## 🚀 Build the project

1. Clone the repository using git with `git clone https://github.com/BrianSuarezSantiago/Histogram.git` command or download from [Source Code.](https://github.com/BrianSuarezSantiago/Histogram/archive/refs/heads/master.zip)

2. Move to the directory where you have the code.

3. Compile using `javac -d . *.java` command followed by the `java histogram.Main` command to run and use the available software.

<hr>
<p align="center">
Made with ♥️ in Spain
</p>
