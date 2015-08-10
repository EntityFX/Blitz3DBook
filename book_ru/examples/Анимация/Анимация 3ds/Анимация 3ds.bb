Graphics3D 640,480,0,2;3D графический режим
SetBuffer BackBuffer() ;двойная буферизация
camera=CreateCamera();создание камеры
CameraRange camera,0.01,1000 ;дистанция прорисовки (от 0.01 до 1000)
PositionEntity camera,12,11,7 ;позиция объекта
RotateEntity camera,30,130,0 ;поворот объекта
light=CreateLight() ;создание света
Object1=LoadAnimMesh("turm.3ds") ;загрузка объекта
ScaleEntity object1,0.1,0.1,0.1 ;масштаб объекта
Animate Object1,2,0.012,0,100 ;анимирование
;первое число(1-повторяется,2 - с прокруткой назад, 3 - один раз)
;второе число - скорость
;третье число - начальный фрейм анимации
;четвертое число - задержка перед анимацией
Repeat ; цикл Repeat
UpdateWorld ;обновляет анимацию и столкновения объектов
RenderWorld ;показывает мир
Flip ;очищает мир от дерьма
Cls ;очищает 2D
Until KeyHit(1) ;повторяется до тех пор пока не нажмёшь ESC
End ;выход