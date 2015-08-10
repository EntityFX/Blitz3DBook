Graphics3D 640,480 ;3D графический режим

cam=CreateCamera() ;создание камеры

PositionEntity cam,0,1,0 ;позици€ объекта

l=CreateLight() ;создание света

cube=CreateCube() ;создание куба

PositionEntity cube,0,2,6 ;позици€ объекта

p=CreateMirror() ;создание зеркала

f=CreatePlane() ;создание плоскости

EntityAlpha f,0.5 ;полупрозрачноть плоскости

t=LoadTexture("P.bmp") ;загрузка текстуры

EntityTexture f,t ;нат€гивание текстуры на объект

RenderWorld ;показывает мир
Flip ;обновл€ет графический буфер

WaitKey() ;ќстанавливает программу до тех пор пока не нажата люба€ клавиша

End ;выход