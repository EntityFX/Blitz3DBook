Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

sp=CreateSphere() ;�������� ����

PositionEntity sp,0,0,4 ;������� �������

l=CreateLight(3) ;�������� ����� (���� � ������� ����� 3 , ������ ���� ����� ����� ����)

LightColor l,0,0,255 ;���� ����� 

LightConeAngles l,5,10 ;��������� ����(������ ����� - ������� � ������ �����, ������ ����� - ������� ����� �� �������)(����� �� 0 �� 90)

LightRange l,25;������� �����(�� 0 �� 255)


RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����
