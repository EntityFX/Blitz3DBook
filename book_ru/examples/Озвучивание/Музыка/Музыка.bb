
While Not KeyHit(1) ; ���� while (����������� ���� �� ������ ESC)

If ChannelPlaying(s)=False s=PlayMusic("Music.mp3")

If KeyHit(203) ;������� ������� ����� �������
PauseChannel s ;����� ������
End If ;����� �������

If KeyHit(205) ;������� ������� ������ �������
ResumeChannel s ;������������� ������
End If ;����� �������

If KeyHit(200) ;������� �������  ������� �����
StopChannel s ;������������� ������ � ����� �� �������������
End If ;����� �������

If KeyHit(208) ;������� ������� ������� �����
ChannelPitch s, 1 ;��������� ������� �������������
End If ;����� �������

If KeyHit(57) ;������� ������� �������
s=PlayMusic("Music.mp3") ;�������������� ������
End If ;����� �������

Wend ;����� �����
End ;�����