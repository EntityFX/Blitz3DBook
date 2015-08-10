Graphics3D 640,480 ;3D графический режим

cam=CreateCamera() ;создание камеры

ob=LoadMesh("asteroid.3ds") ;загрузка 3DS объекта

PositionEntity ob,0,0,4 ;позиция объекта

ScaleEntity ob,0.1,0.1,0.1 ;размер объекта

RenderWorld ;показывает мир
Flip ;обновляет графический буфер

WaitKey() ;Останавливает программу до тех пор пока не нажата любая клавиша

End ;выход
