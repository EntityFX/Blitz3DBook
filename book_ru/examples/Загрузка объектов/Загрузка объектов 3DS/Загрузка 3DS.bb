Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

ob=LoadMesh("asteroid.3ds") ;�������� 3DS �������

PositionEntity ob,0,0,4 ;������� �������

ScaleEntity ob,0.1,0.1,0.1 ;������ �������

RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����
