;������ � ��������
;������ � ��������

Dim a(30,20) ;���������� ���������� �������(�������) �������� 30�20

For row=0 To 20 ;1���� �� ��������
	For col=0 To 30 ;2 ���� �� �������
 	a(col,row)=Rnd(0,9) ;���������� �������� �������� ������� � ������������� ���������� ����� �� 0 �� 9
	Next ;����� 2 �����
Next  ;����� 1 �����

For row=0 To 20 ;1���� �� ��������
	For col=0 To 30  ;2 ���� �� �������
	Write a(col,row)+" " ;������ �������� � ��������
	Next ;����� 2 �����
	Print "" ;������� �� ��������� ������
Next ;����� 1 �����

WaitKey()
End ;����� �� ���������