;������ ������ ��������� �� ��������

a$="��� - ��� �����" ;��������� ����������
b$="255543.457547" ;��������� ����������

Print a$ ;����� �� ����� ��������
Print Left(a$,3) ;����� 3� �������� �����
Print Right(a$,5) ;����� 5�� �������� ������
Print Mid$(a$,7,3) ;����� 3� �������� ������� � 7��
Print Replace(a$,"�","�") ;������ ������� "�" �� "�"
Print Trim$(a$) ;����� ����� ���������� �������
Print "����� ������ - " + Len(a$) + " ��������" ;����� ����� ������
Print "--------------------------------------------------------------------------------"
Print b$ ;����� �� ����� ��������
Print Hex$ (b$) ;����� �������� ������ � ����������������� ����
Print Bin$ (b$) ;����� �������� ������ � �������� ����

WaitKey() ;�������� ������� ����� �������
End ;����� �� ���������