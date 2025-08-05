package com.alipay.zoloz.hardware.camera.preview;

import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class RectDrawer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f6246a = "attribute vec4 a_Position;\nattribute vec4 a_Color;\nvarying vec4 v_Color;\nvoid main() {\n    v_Color = a_Color;\n    gl_Position = a_Position;\n}";
    public static String b = "precision mediump float;\nvarying vec4 v_Color;\nvoid main() {\n    gl_FragColor = v_Color;\n}";
    private List<float[]> f = new ArrayList(3);
    private List<FloatBuffer> g = new ArrayList(3);
    private int h = 0;
    private int e = ShaderHelper.linkProgram(ShaderHelper.compileVertexShader(f6246a), ShaderHelper.compileFragmentShader(b));
    private int c = GLES20.glGetAttribLocation(this.e, "a_Position");
    private int d = GLES20.glGetAttribLocation(this.e, "a_Color");

    public synchronized void update(List<RectF> list, Rect rect, int i, int i2, int i3, int i4) {
        float[] fArr;
        FloatBuffer floatBuffer;
        float f;
        float f2;
        float f3;
        List<RectF> list2 = list;
        int i5 = i;
        int i6 = i2;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            int i7 = 3;
            int i8 = 2;
            int i9 = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("557fb878", new Object[]{this, list2, rect, new Integer(i5), new Integer(i6), new Integer(i3), new Integer(i4)});
                return;
            }
            int width = rect.width();
            int height = rect.height();
            this.h = list2 == null ? 0 : list.size();
            int i10 = 1;
            while (i10 <= this.h) {
                int i11 = i10 - 1;
                RectF rectF = list2.get(i11);
                if (i10 > this.f.size()) {
                    if (i10 == i9) {
                        f = 0.9372549f;
                        f2 = 0.75686276f;
                        f3 = 0.07058824f;
                    } else if (i10 == i8) {
                        f = 0.827451f;
                        f2 = 0.14901961f;
                        f3 = 0.2627451f;
                    } else if (i10 != i7) {
                        f = 0.22352941f;
                        f2 = 0.59607846f;
                        f3 = 0.96862745f;
                    } else {
                        f = 0.99215686f;
                        f2 = 0.58431375f;
                        f3 = 0.2901961f;
                    }
                    fArr = new float[60];
                    fArr[0] = -1.0f;
                    fArr[i9] = 1.0f;
                    fArr[i8] = f;
                    fArr[3] = f2;
                    fArr[4] = f3;
                    fArr[5] = -1.0f;
                    fArr[6] = 1.0f;
                    fArr[7] = f;
                    fArr[8] = f2;
                    fArr[9] = f3;
                    fArr[10] = -1.0f;
                    fArr[11] = 1.0f;
                    fArr[12] = f;
                    fArr[13] = f2;
                    fArr[14] = f3;
                    fArr[15] = -1.0f;
                    fArr[16] = 1.0f;
                    fArr[17] = f;
                    fArr[18] = f2;
                    fArr[19] = f3;
                    fArr[20] = -1.0f;
                    fArr[21] = 1.0f;
                    fArr[22] = f;
                    fArr[23] = f2;
                    fArr[24] = f3;
                    fArr[25] = -1.0f;
                    fArr[26] = 1.0f;
                    fArr[27] = f;
                    fArr[28] = f2;
                    fArr[29] = f3;
                    fArr[30] = -1.0f;
                    fArr[31] = 1.0f;
                    fArr[32] = f;
                    fArr[33] = f2;
                    fArr[34] = f3;
                    fArr[35] = -1.0f;
                    fArr[36] = 1.0f;
                    fArr[37] = f;
                    fArr[38] = f2;
                    fArr[39] = f3;
                    fArr[40] = -1.0f;
                    fArr[41] = 1.0f;
                    fArr[42] = f;
                    fArr[43] = f2;
                    fArr[44] = f3;
                    fArr[45] = -1.0f;
                    fArr[46] = 1.0f;
                    fArr[47] = f;
                    fArr[48] = f2;
                    fArr[49] = f3;
                    fArr[50] = -1.0f;
                    fArr[51] = 1.0f;
                    fArr[52] = f;
                    fArr[53] = f2;
                    fArr[54] = f3;
                    fArr[55] = -1.0f;
                    fArr[56] = 1.0f;
                    fArr[57] = f;
                    fArr[58] = f2;
                    fArr[59] = f3;
                    this.f.add(fArr);
                    floatBuffer = ByteBuffer.allocateDirect(fArr.length << i8).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    floatBuffer.put(fArr);
                    this.g.add(floatBuffer);
                } else {
                    fArr = this.f.get(i11);
                    floatBuffer = this.g.get(i11);
                }
                float f4 = i5;
                float f5 = width;
                float f6 = ((((rectF.left * f4) - rect.left) / f5) * 2.0f) - 1.0f;
                float f7 = i6;
                float f8 = height;
                float f9 = 1.0f - ((((rectF.top * f7) - rect.top) / f8) * 2.0f);
                int i12 = width;
                float f10 = ((((rectF.right * f4) - rect.left) / f5) * 2.0f) - 1.0f;
                float f11 = 1.0f - ((((rectF.bottom * f7) - rect.top) / f8) * 2.0f);
                float f12 = 50.0f / i3;
                float f13 = 50.0f / i4;
                fArr[0] = f6;
                float f14 = f9 - f13;
                fArr[1] = f14;
                fArr[5] = f6;
                fArr[6] = f9;
                float f15 = f6 + f12;
                fArr[10] = f15;
                fArr[11] = f9;
                float f16 = f10 - f12;
                fArr[15] = f16;
                fArr[16] = f9;
                fArr[20] = f10;
                fArr[21] = f9;
                fArr[25] = f10;
                fArr[26] = f14;
                fArr[30] = f10;
                float f17 = f11 + f13;
                fArr[31] = f17;
                fArr[35] = f10;
                fArr[36] = f11;
                fArr[40] = f16;
                fArr[41] = f11;
                fArr[45] = f15;
                fArr[46] = f11;
                fArr[50] = f6;
                fArr[51] = f11;
                fArr[55] = f6;
                fArr[56] = f17;
                floatBuffer.clear();
                floatBuffer.put(fArr);
                i10++;
                list2 = list;
                i5 = i;
                i6 = i2;
                width = i12;
                i9 = 1;
                i7 = 3;
                i8 = 2;
            }
        }
    }

    public synchronized void draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea46fcb", new Object[]{this});
            return;
        }
        ShaderHelper.validateProgram(this.e);
        GLES20.glUseProgram(this.e);
        for (int i = 0; i < this.h; i++) {
            FloatBuffer floatBuffer = this.g.get(i);
            floatBuffer.position(0);
            GLES20.glEnableVertexAttribArray(this.c);
            GLES20.glVertexAttribPointer(this.c, 2, 5126, false, 20, (Buffer) floatBuffer);
            floatBuffer.position(2);
            GLES20.glEnableVertexAttribArray(this.d);
            GLES20.glVertexAttribPointer(this.d, 3, 5126, false, 20, (Buffer) floatBuffer);
            GLES20.glLineWidth(2.0f);
            GLES20.glDrawArrays(1, 0, 2);
            GLES20.glDrawArrays(1, 1, 2);
            GLES20.glDrawArrays(1, 3, 2);
            GLES20.glDrawArrays(1, 4, 2);
            GLES20.glDrawArrays(1, 6, 2);
            GLES20.glDrawArrays(1, 7, 2);
            GLES20.glDrawArrays(1, 9, 2);
            GLES20.glDrawArrays(1, 10, 2);
            GLES20.glDisableVertexAttribArray(this.c);
            GLES20.glDisableVertexAttribArray(this.d);
        }
        GLES20.glUseProgram(0);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        GLES20.glDeleteProgram(this.e);
        this.e = -1;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RectDrawer{mProgramId=" + this.e + ", mData=" + this.f + '}';
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.h = 0;
        }
    }
}
