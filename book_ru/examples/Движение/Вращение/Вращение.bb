Graphics3D 640,480 ;3D графический режим

cam=CreateCamera() ;создание камеры

cube=CreateCube() ;создание куба

PositionEntity cube,0,0,4 ;позиция объекта

While Not KeyHit(1) ; цикл while (повторяется пока не нажмёшь ESC)
TurnEntity cube,1,1,1 ;вращает фигуру
RenderWorld ;показывает мир
Flip ;обновляет графический буфер
Wend ;конец  цикла
End ;выход