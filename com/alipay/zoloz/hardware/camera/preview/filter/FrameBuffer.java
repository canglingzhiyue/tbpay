package com.alipay.zoloz.hardware.camera.preview.filter;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class FrameBuffer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6248a = "FrameBuffer";
    private int g;
    private int h;
    private int i;
    private int j;
    private int[] b = new int[1];
    private int[] c = new int[1];
    private int[] d = new int[1];
    private int[] e = new int[1];
    private int[] f = new int[4];
    private ByteBuffer l = null;
    private boolean k = false;

    public void createBuffer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fb9e83", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        String str = f6248a;
        Log.d(str, " createBuffer  width : " + i + " height : " + i2);
        this.i = i;
        this.j = i2;
        a();
        this.k = true;
    }

    public void setSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e006a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.g = i;
        this.h = i2;
    }

    public Bitmap getFBOContent(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1291e529", new Object[]{this, bitmap});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (this.l == null) {
            this.l = ByteBuffer.allocateDirect((this.i * this.j) << 2);
        }
        int i = this.j;
        int i2 = i > height ? (i - 1) - height : 0;
        String str = f6248a;
        Log.d(str, " mRGBBuffer limit : " + this.l.limit() + "bmpW: " + width + "," + height);
        this.l.clear();
        GLES20.glReadPixels(0, i2, width, height, 6408, 5121, this.l);
        this.l.rewind();
        bitmap.copyPixelsFromBuffer(this.l);
        return bitmap;
    }

    public void bindFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d81fb7", new Object[]{this});
            return;
        }
        GLES20.glGetIntegerv(36006, this.e, 0);
        GLES20.glGetIntegerv(2978, this.f, 0);
        String str = f6248a;
        Log.d(str, "mOldViewPort : x : " + this.f[0] + ", " + this.f[1] + ", " + this.f[2] + ", " + this.f[3]);
        GLES20.glBindTexture(3553, this.d[0]);
        GLES20.glBindFramebuffer(36160, this.b[0]);
        String str2 = f6248a;
        StringBuilder sb = new StringBuilder();
        sb.append("frame buffer status: ");
        sb.append(GLES20.glCheckFramebufferStatus(36160));
        Log.d(str2, sb.toString());
        GLES20.glViewport(0, 0, this.i, this.j);
    }

    public void unBindFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30b819e", new Object[]{this});
            return;
        }
        GLES20.glBindRenderbuffer(36161, 0);
        GLES20.glBindFramebuffer(36160, this.e[0]);
        int[] iArr = this.f;
        if (iArr[0] < 0 || iArr[1] < 0 || iArr[0] >= iArr[2] || iArr[1] >= iArr[3]) {
            GLES20.glViewport(0, 0, this.g, this.h);
        } else {
            GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (!this.k) {
        } else {
            c();
            this.k = false;
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        GLES20.glGetIntegerv(36006, this.e, 0);
        GLES20.glGenFramebuffers(1, this.b, 0);
        GLES20.glGenRenderbuffers(1, this.c, 0);
        b();
        GLES20.glBindFramebuffer(36160, this.b[0]);
        GLES20.glBindRenderbuffer(36161, this.c[0]);
        GLES20.glRenderbufferStorage(36161, 33189, this.i, this.j);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.d[0], 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.c[0]);
        if (36053 != GLES20.glCheckFramebufferStatus(36160)) {
            return false;
        }
        unBindFrame();
        return false;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        GLES20.glGenTextures(1, this.d, 0);
        for (int i = 0; i <= 0; i++) {
            GLES20.glBindTexture(3553, this.d[i]);
            GLES20.glTexImage2D(3553, 0, 6408, this.i, this.j, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, AccsConnection.DATA_PACKAGE_MAX, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        GLES20.glDeleteRenderbuffers(1, this.c, 0);
        GLES20.glDeleteFramebuffers(1, this.b, 0);
        GLES20.glDeleteTextures(1, this.d, 0);
    }
}
