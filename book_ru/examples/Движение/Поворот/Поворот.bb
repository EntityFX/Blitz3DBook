Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

cube=CreateCube() ;�������� ����

PositionEntity cube,0,0,4 ;������� �������

RotateEntity cube,45,0,0 ;������������ ������ 

RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����
