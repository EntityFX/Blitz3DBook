
f=WriteFile("1.txt") ;�������� ����� ��� ������
WriteByte(f,255) ;������ ��������� ��������
WriteInt(f,6500) ;������ ������ ��������
WriteFloat(f,0.1) ;������ ������������� ��������
WriteString(f,"file") ;������ ���������� ��������
CloseFile(f) ;�������� �����

f=OpenFile("1.txt") ;�������� ����� ��� ������
Print ReadByte( f ) ;������ ��������� �������� 
Print ReadInt( f ) ;������ ������ ��������
Print ReadFloat( f ) ;������ ������������� ��������
Print ReadString( f ) ;������ ���������� ��������
CloseFile(f) ;�������� �����

WaitKey() ;�������� ������� ����� �������
End ;����� �� ���������