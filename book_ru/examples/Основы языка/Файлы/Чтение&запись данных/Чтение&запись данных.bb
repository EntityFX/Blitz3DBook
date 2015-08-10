
f=WriteFile("1.txt") ;открытие файла для записи
WriteByte(f,255) ;запись байтового значения
WriteInt(f,6500) ;запись целого значения
WriteFloat(f,0.1) ;запись вещественного значения
WriteString(f,"file") ;запись строкового значения
CloseFile(f) ;закрытие файла

f=OpenFile("1.txt") ;открытие файла для чтения
Print ReadByte( f ) ;печать байтового значения 
Print ReadInt( f ) ;печать целого значения
Print ReadFloat( f ) ;печать вещественного значения
Print ReadString( f ) ;печать строкового значения
CloseFile(f) ;закрытие файла

WaitKey() ;ожидание нажатия любой клавишы
End ;выход из программы