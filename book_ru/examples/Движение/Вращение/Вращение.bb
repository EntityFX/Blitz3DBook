Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

cube=CreateCube() ;�������� ����

PositionEntity cube,0,0,4 ;������� �������

While Not KeyHit(1) ; ���� while (����������� ���� �� ������ ESC)
TurnEntity cube,1,1,1 ;������� ������
RenderWorld ;���������� ���
Flip ;��������� ����������� �����
Wend ;�����  �����
End ;�����