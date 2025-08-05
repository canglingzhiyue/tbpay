package com.alipay.zoloz.hardware.camera.preview;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class PromptMaskDrawer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] e = {-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f};
    private PointF g = new PointF();
    private int d = ShaderHelper.linkProgram(ShaderHelper.compileVertexShader("attribute vec4 a_Position;\nattribute vec4 a_Color;\nvarying vec4 v_Color;\nvarying vec2 textureCoordinate;\nvoid main() {\n    v_Color = a_Color;\n    textureCoordinate = (vec2(a_Position.x,a_Position.y)+vec2(1.0,1.0))/2.0;\n    gl_Position = a_Position;\n}"), ShaderHelper.compileFragmentShader("precision mediump float;\nvarying vec4 v_Color;\nvarying vec2 textureCoordinate;\nuniform vec2 uCornerRation;\nconst mediump vec4 uUVRange = vec4(0.0,1.0,0.0,1.0); \nvoid main() {\nif(uCornerRation.x > 0.0 || uCornerRation.y > 0.0){\nvec2 uvcenter = vec2(uUVRange.x+uUVRange.y,uUVRange.z+uUVRange.w)*0.5;\nvec2 roiSize = abs(vec2(uUVRange.x - uUVRange.y,uUVRange.z - uUVRange.w));\nvec2 uvcornerSize = roiSize*uCornerRation.x;\nvec2 relativeuv = abs(textureCoordinate - uvcenter);\nvec2 roiHalfSizeWithoutCorner = abs(roiSize - uvcornerSize*2.0)*0.5;\nfloat rx = relativeuv.x - roiHalfSizeWithoutCorner.x;\nfloat ry = relativeuv.y - roiHalfSizeWithoutCorner.y;\nfloat mx = step(roiHalfSizeWithoutCorner.x, relativeuv.x);\nfloat my = step(roiHalfSizeWithoutCorner.y, relativeuv.y);\nfloat ecclipse = step(1.0,rx*rx/(uvcornerSize.x*uvcornerSize.x) + ry*ry/(uvcornerSize.y*uvcornerSize.y));\nif(mx*my*ecclipse > 0.5) \ndiscard;}\n    gl_FragColor = vec4(0.0, 0.0, 0.0, 0.4);\n}"));

    /* renamed from: a  reason: collision with root package name */
    private int f6245a = GLES20.glGetAttribLocation(this.d, "a_Position");
    private int b = GLES20.glGetAttribLocation(this.d, "a_Color");
    private int c = GLES20.glGetUniformLocation(this.d, "uCornerRation");
    private FloatBuffer f = ByteBuffer.allocateDirect(this.e.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

    public PromptMaskDrawer(float f, float f2) {
        this.f.put(this.e);
        this.g.set(f, f2);
    }

    public void draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea46fcb", new Object[]{this});
            return;
        }
        ShaderHelper.validateProgram(this.d);
        GLES20.glUseProgram(this.d);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUniform2f(this.c, this.g.x, this.g.y);
        this.f.position(0);
        GLES20.glEnableVertexAttribArray(this.f6245a);
        GLES20.glVertexAttribPointer(this.f6245a, 2, 5126, false, 24, (Buffer) this.f);
        this.f.position(2);
        GLES20.glEnableVertexAttribArray(this.b);
        GLES20.glVertexAttribPointer(this.b, 4, 5126, false, 24, (Buffer) this.f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f6245a);
        GLES20.glDisableVertexAttribArray(this.b);
        GLES20.glUseProgram(0);
        GLES20.glDisable(3042);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        GLES20.glDeleteProgram(this.d);
        this.d = -1;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RectDrawer{mProgramId=" + this.d + ", mData=" + Arrays.toString(this.e) + '}';
    }
}
