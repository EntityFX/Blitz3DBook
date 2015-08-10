Repeat ;цикл Repeat...Until
Text 4,4,CurrentDate() +" "+ CurrentTime() ;выводит время и дату
Flip ;обновляет графический буфер
Cls ;очищает экран
Until KeyHit(1) ;до тех пор пока не нажата Esc
End ;выход из программы