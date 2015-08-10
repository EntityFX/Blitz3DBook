Graphics3D 640,480 ;3D графический режим

cam=CreateCamera() ;создание камеры

cube=CreateSphere() ;создание сферы
NameEntity cube,"Vasya"
PositionEntity cube,0,0,4 ;позици€ объекта

tex=LoadTexture("texture.bmp") ;загрузка текстуры

EntityTexture cube,tex ;нат€гивание текстуры на объект(перва€ переменна€ - объект, втора€ переменна€ - текстура)

RenderWorld ;показывает мир
Text 4,4,EntityName(cube)
Flip ;обновл€ет графический буфер

WaitKey() ;ќстанавливает программу до тех пор пока не нажата люба€ клавиша

End ;выход