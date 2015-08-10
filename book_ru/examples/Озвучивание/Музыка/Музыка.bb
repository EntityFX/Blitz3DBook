
While Not KeyHit(1) ; цикл while (повторяется пока не нажмёшь ESC)

If ChannelPlaying(s)=False s=PlayMusic("Music.mp3")

If KeyHit(203) ;условие нажатия левой стрелки
PauseChannel s ;пауза музыки
End If ;конец условия

If KeyHit(205) ;условие нажатия правой стрелки
ResumeChannel s ;возобновление музыки
End If ;конец условия

If KeyHit(200) ;условие нажатия  стрелки вперёд
StopChannel s ;останавливает музыку и бльше не воспроизводит
End If ;конец условия

If KeyHit(208) ;условие нажатия стрелки назад
ChannelPitch s, 1 ;изменение частоты дискретизации
End If ;конец условия

If KeyHit(57) ;условие нажатия пробела
s=PlayMusic("Music.mp3") ;воиспроизводит музыку
End If ;конец условия

Wend ;конец цикла
End ;выход