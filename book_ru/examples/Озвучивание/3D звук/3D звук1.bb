Graphics3D 640,480 
cam=CreateCamera() 
x=CreateCube()
CreateListener (cam,0.5,1) ;создаём слушателя
s=Load3DSound("fly.wav") ;загружаем 3D звук
PositionEntity x,2,0,-100
LoopSound s ;делаем звук зацикленным 
EmitSound s,x ;объект x воспроизводит звук s
While Not KeyHit(1)
MoveEntity x,0,0,1
RenderWorld
Flip
Wend
End