Graphics 640,480,0,1 ;графический режим

fen=LoadImage("Cursor.bmp") ;загружает картинку

While Not KeyHit(1) ; бесконечный цикл(повторяется пока не нажмёшь ESC)
DrawImage fen,MouseX(),MouseY() ;рисует картинку 
;mouseX() и mouseY() сканируют позицию курсора в число
Flip ;обновляет графический буфер
Cls ;очищает 2D
Wend ;конец бесконечного цикла
End ;выход