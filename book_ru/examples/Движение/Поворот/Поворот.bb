Graphics3D 640,480 ;3D графический режим

cam=CreateCamera() ;создание камеры

cube=CreateCube() ;создание куба

PositionEntity cube,0,0,4 ;позиция объекта

RotateEntity cube,45,0,0 ;поворачивает фигуру 

RenderWorld ;показывает мир
Flip ;обновляет графический буфер

WaitKey() ;Останавливает программу до тех пор пока не нажата любая клавиша

End ;выход
