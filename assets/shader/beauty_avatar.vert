attribute vec4 vPosition;
attribute vec2 vCoord;
varying vec2 textureCoordinate;
uniform mat4 vMatrix;
uniform float uWidth;
uniform float uHeight;
varying float vWidth;
varying float vHeight;
void main( )
{
    gl_Position = vMatrix*vPosition;
    textureCoordinate = vCoord;

    vWidth = uWidth;
    vHeight = uHeight;
}