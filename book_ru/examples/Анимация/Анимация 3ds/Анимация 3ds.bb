Graphics3D 640,480,0,2;3D ����������� �����
SetBuffer BackBuffer() ;������� �����������
camera=CreateCamera();�������� ������
CameraRange camera,0.01,1000 ;��������� ���������� (�� 0.01 �� 1000)
PositionEntity camera,12,11,7 ;������� �������
RotateEntity camera,30,130,0 ;������� �������
light=CreateLight() ;�������� �����
Object1=LoadAnimMesh("turm.3ds") ;�������� �������
ScaleEntity object1,0.1,0.1,0.1 ;������� �������
Animate Object1,2,0.012,0,100 ;������������
;������ �����(1-�����������,2 - � ���������� �����, 3 - ���� ���)
;������ ����� - ��������
;������ ����� - ��������� ����� ��������
;��������� ����� - �������� ����� ���������
Repeat ; ���� Repeat
UpdateWorld ;��������� �������� � ������������ ��������
RenderWorld ;���������� ���
Flip ;������� ��� �� ������
Cls ;������� 2D
Until KeyHit(1) ;����������� �� ��� ��� ���� �� ������ ESC
End ;�����