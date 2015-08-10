Graphics3D 800,600
SetBuffer BackBuffer()
cam=CreateCamera()
aim=CreatePivot()
PositionEntity aim,0,0,20
sph=CreateSphere(8,aim)
PositionEntity sph,0,10,0
Repeat
x=x+1 : If x=360 Then x=0
TurnEntity aim,0,0,1
RenderWorld
Flip
Until KeyHit(1)
End
