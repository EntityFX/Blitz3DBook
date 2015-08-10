Graphics3D 640,480 ;3D графический режим

cam=CreateCamera() ;создание камеры

sp=CreateSphere() ;создание шара

PositionEntity sp,0,0,4 ;позиция объекта

l=CreateLight() ;создание света 

RotateEntity l,90,0,0 ;поворот света

LightColor l,0,255,0 ;цвет света 

RenderWorld ;показывает мир
Flip ;обновляет графический буфер

WaitKey() ;Останавливает программу до тех пор пока не нажата любая клавиша

End ;выход
