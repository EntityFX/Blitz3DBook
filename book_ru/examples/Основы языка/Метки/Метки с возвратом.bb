; ������ ������������� ����� � ��������� (������������)
Gosub label1 ;����� ����� 1
Gosub label2 ;����� ����� 2
WaitKey ;�������� ������� ����� �������
End ;����� �� ���������

.label1 ;����� 1
Print "�����1" ;����� �� �����
Return ;������� � ���������� ��������� ����� Gosub label1

.label2 ;����� 2
Print "�����2" ;����� �� �����
Return ;������� � ���������� ��������� ����� Gosub label2
