Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

sp=CreateSphere() ;�������� ����

PositionEntity sp,0,0,4 ;������� �������

l=CreateLight() ;�������� ����� 

RotateEntity l,90,0,0 ;������� �����

LightColor l,0,255,0 ;���� ����� 

RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����
