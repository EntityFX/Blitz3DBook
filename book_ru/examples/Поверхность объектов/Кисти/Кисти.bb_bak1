Graphics3D 800,600
SetBuffer BackBuffer()
l=CreateLight()
LightColor l,255,0,0
RotateEntity l,45,45,0
cam=CreateCamera()
sphere=CreateSphere(50)
PositionEntity sphere,0,0,5
brush=CreateBrush(255,255,25)
BrushShininess brush,1
PaintEntity sphere, brush
RenderWorld
Flip
WaitKey() : End 