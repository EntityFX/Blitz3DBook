Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

cube=CreateSphere() ;�������� �����
NameEntity cube,"Vasya"
PositionEntity cube,0,0,4 ;������� �������

tex=LoadTexture("texture.bmp") ;�������� ��������

EntityTexture cube,tex ;����������� �������� �� ������(������ ���������� - ������, ������ ���������� - ��������)

RenderWorld ;���������� ���
Text 4,4,EntityName(cube)
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����