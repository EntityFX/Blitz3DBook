# Синтаксис программы.

В Blitz3D имеются зарезервированные ключевые слова: 

```blitzbasic
After, And, Before, Case, Const, Data, Default, Delete, Dim, Each, Else, ElseIf, End, EndIf, 
Exit, False, Field, First, Float, For, Forever, Function, Global, Gosub, Goto, If, Insert, 
Int, Last, Local, Mod, New, Next, Not, Null, Or, Pi, Read, Repeat, Restore, Return, Sar, Select, 
Shl, Shr, Step, Str, Then, To, True, Type, Until, Wend, While, Xor, Include
```

Данные названия нельзя использовать в названии индентификаторов(переменных, констант, массивов, функций, процедур и типах). 
Зарезервированные слова автоматически окрашиваются в голубой цвет.

В программный код можно добавлять комментарии. Для их добавления используется символ **;** (точка с запятой). После этого символа прописывают нужный текст пояснений. Цвет текста комментариев - желтого цвета. Можно записать несколько команд в одну строку, которые должны отделяются знаком **:**.

Пример:
```blitzbasic
x=x+1 : Print x
End;это комментарий
```
