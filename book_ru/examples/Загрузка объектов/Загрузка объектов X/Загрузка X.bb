Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

ob=LoadMesh("camel.x") ;�������� X �������

PositionEntity ob,0,0,4 ;������� �������

RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����
