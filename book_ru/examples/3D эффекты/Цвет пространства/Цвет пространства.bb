Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

cube=CreateCube() ;�������� ����

PositionEntity cube,0,0,4 ;������� �������

CameraClsColor cam,255,255,0 ;������������ ������������ � ����� ����


RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����
