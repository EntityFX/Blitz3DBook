Graphics 640,480,0,1 ;����������� �����

fen=LoadImage("Cursor.bmp") ;��������� ��������

While Not KeyHit(1) ; ����������� ����(����������� ���� �� ������ ESC)
DrawImage fen,MouseX(),MouseY() ;������ �������� 
;mouseX() � mouseY() ��������� ������� ������� � �����
Flip ;��������� ����������� �����
Cls ;������� 2D
Wend ;����� ������������ �����
End ;�����