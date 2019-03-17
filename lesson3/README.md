# Class Lesson3_Collections SBT homeWork3
* Исходные данные: текстовый файл со средней длиной строки равной 10
  символам (файл или прошить текст в коде).
### Слова в файле:
*       a aa aaa aaaa
        a aa aaa bbbb
        cc cc cc cc, soba11ka
        dag dog. pito44n
        smallwwww
        smollwwww
        smallww soba11ka 
### Задание 1: Подсчитайте количество различных слов в файле:
* different words in file: 14
### Задание 2: Выведите на экран список различных слов файла:
     отсортированный по возрастанию их длины (компаратор сначала по длине
     слова, потом по тексту):
*   sorted words : [a, aa, aaa, aaaa, bbbb, cc, cc,, dag, dog., pito44n, smallww, smallwwww, smollwwww, soba11ka]
### Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле:
*       for word: aa - 2 times
        for word: aaa - 2 times
        for word: cc - 3 times
        for word: a - 2 times
        for word: pito44n - 1 times
        for word: smallwwww - 1 times
        for word: dag - 1 times
        for word: aaaa - 1 times
        for word: cc, - 1 times
        for word: bbbb - 1 times
        for word: smallww - 1 times
        for word: soba11ka - 2 times
        for word: smollwwww - 1 times
        for word: dog. - 1 times
### Задание 4: Выведите на экран все строки файла в обратном порядке:
*       [smallww soba11ka, smollwwww, smallwwww, dag dog. pito44n, cc cc cc cc, soba11ka, a aa aaa bbbb, a aa aaa aaaa]
### Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке:
*       iterator words : 
        smallww soba11ka
        smollwwww
        smallwwww
        dag dog pito44n
        cc cc cc cc soba11ka
        a aa aaa bbbb
        a aa aaa aaaa       
### Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке numberString(fileName, 2,1,7):    
*       number of words : 
        a aa aaa bbbb
        a aa aaa aaaa
        smallww soba11ka