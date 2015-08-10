Graphics 800,600
SetBuffer BackBuffer()
time=MilliSecs()
i=OpenMovie("D:\фильмы\Lost.S03E07.rus.avi")

Repeat
Cls

fps=fps+1
If MilliSecs() > time + 1000
s=s+1
time=MilliSecs()
fps1=fps
fps=0
EndIf

If s=60 Then s=0:m=m+1
If m=60 Then m=0:h=h+1
If s<10 s1$="0"+s Else s1$=s
If m<10 m1$="0"+m Else m1$=m
If h<10h1$="0"+h Else h1$=h

DrawMovie(i,0,GraphicsHeight()/8,GraphicsWidth(),GraphicsHeight()-GraphicsHeight()/4)
Text 4,4,h1$+":"+m1$+":"+s1$
Text 4,14,"FPS: "+fps1
Flip

Until KeyHit(1) Or (Not MoviePlaying(i))
End