Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

PositionEntity cam,0,1,0 ;������� �������

l=CreateLight() ;�������� �����

cube=CreateCube() ;�������� ����

PositionEntity cube,0,2,6 ;������� �������

p=CreateMirror() ;�������� �������

f=CreatePlane() ;�������� ���������

EntityAlpha f,0.5 ;��������������� ���������

t=LoadTexture("P.bmp") ;�������� ��������

EntityTexture f,t ;����������� �������� �� ������

RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����