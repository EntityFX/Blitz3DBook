Graphics3D 640,480 
cam=CreateCamera() 
x=CreateCube()
CreateListener (cam,0.5,1) ;������ ���������
s=Load3DSound("fly.wav") ;��������� 3D ����
PositionEntity x,2,0,-100
LoopSound s ;������ ���� ����������� 
EmitSound s,x ;������ x ������������� ���� s
While Not KeyHit(1)
MoveEntity x,0,0,1
RenderWorld
Flip
Wend
End