# Идентификаторы

В языке используется следующие идентификаторы - это имена переменных, констант, имена функций, типов и меток.
Их названия определяются с помощью букв латинского алфавита и цифр. Для их задания пользуются следующим правилом:

* Каждый идентификаторы начинается с буквы латинского алфавита.
* Цифры ставят только после букв латинского алфавита.
* Нельзя использовать буквы русского языка.
* Нельзя использовать специальные символы кроме "_", "%", "#", "$". Их ставят только после букв, причем, после них не должны присутствовать никакие символы. Например, символы  "%", "#", "$" играют особую роль.

Пример правильных имен идентификатор: 
```blitzbasic
a, b1, c$, in%, dat#, fr_g
```

Примеры использования идентификаторов в именах переменных, констант, имена функций, типов и меток:
```blitzbasic
;Константа типа String
Const STR_CONST$ = "STR_CONST"

;Константа типа Int
Const INT_CONST% = 98

;Константа типа Float
Const FLOAT_CONST# = 6.56

;Переменная типа String
Global strVar$ = "var"

;Переменная типа Int
Global intVar% = 98

;Переменная типа Float
Global floatVar = 6.56

;Объявление типа Employee
Type Employee
	Field userName$

	Field age%

	Field salary#

	Field handle__%
End Type

Local emp.Employee = New Employee

;Функция возвращает тип String
Function StringFunction$()
	Return "test function"
End Function

;Функция возвращает тип Int
Function IntFunction%(var)
	Return 5
End Function

;Функция возвращает тип Float
Function FloatFunction#()
	Return 7.8
End Function

;метка
.label
```
