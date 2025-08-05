package com.alipay.zoloz.hardware.camera.preview.filter;

import android.content.res.Resources;
import android.opengl.GLES20;
import android.util.SparseArray;
import com.alipay.zoloz.hardware.camera.preview.utils.MatrixUtils;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import tb.icf;

/* loaded from: classes3.dex */
public abstract class AFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean DEBUG = true;
    public static final int KEY_IN = 258;
    public static final int KEY_INDEX = 513;
    public static final int KEY_OUT = 257;
    public static final float[] OM = MatrixUtils.getOriginalMatrix();

    /* renamed from: a  reason: collision with root package name */
    public int f6247a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Resources f;
    public FloatBuffer g;
    public FloatBuffer h;
    private SparseArray<boolean[]> r;
    private SparseArray<int[]> s;
    private SparseArray<float[]> t;
    public int i = 0;
    public String j = "AFilter";
    private float[] l = Arrays.copyOf(OM, 16);
    private int m = 0;
    private int n = 0;
    private float[] o = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
    private float[] p = {-1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    public float[] k = {-1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private float[] q = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    public abstract void a();

    public int getOutputTexture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ee26f9e", new Object[]{this})).intValue();
        }
        return -1;
    }

    public abstract void onSizeChanged(int i, int i2);

    public AFilter(Resources resources) {
        this.f = resources;
        b();
    }

    public final void create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
        } else {
            a();
        }
    }

    public final void setSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e006a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            onSizeChanged(i, i2);
        }
    }

    public void draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea46fcb", new Object[]{this});
            return;
        }
        c();
        e();
        f();
        d();
    }

    public void setMatrix(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86b9315", new Object[]{this, fArr});
        } else {
            this.l = fArr;
        }
    }

    public float[] getMatrix() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("c2216ce3", new Object[]{this}) : this.l;
    }

    public final void setTextureType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af673a09", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public final int getTextureType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31eaa6b9", new Object[]{this})).intValue() : this.m;
    }

    public final int getTextureId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcda895a", new Object[]{this})).intValue() : this.n;
    }

    public final void setTextureId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66d7e88", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public void setFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9f752e", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public int getFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbfa2b5c", new Object[]{this})).intValue() : this.i;
    }

    public void setFloat(int i, float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1ce7cd", new Object[]{this, new Integer(i), fArr});
            return;
        }
        if (this.t == null) {
            this.t = new SparseArray<>();
        }
        this.t.put(i, fArr);
    }

    public void setInt(int i, int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc41a9d", new Object[]{this, new Integer(i), iArr});
            return;
        }
        if (this.s == null) {
            this.s = new SparseArray<>();
        }
        this.s.put(i, iArr);
    }

    public void setBool(int i, boolean... zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b2b4f", new Object[]{this, new Integer(i), zArr});
            return;
        }
        if (this.r == null) {
            this.r = new SparseArray<>();
        }
        this.r.put(i, zArr);
    }

    public boolean getBool(int i, int i2) {
        boolean[] zArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a27a8b", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        SparseArray<boolean[]> sparseArray = this.r;
        return sparseArray != null && (zArr = sparseArray.get(i)) != null && zArr.length > i2 && zArr[i2];
    }

    public int getInt(int i, int i2) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb67f913", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        SparseArray<int[]> sparseArray = this.s;
        if (sparseArray != null && (iArr = sparseArray.get(i)) != null && iArr.length > i2) {
            return iArr[i2];
        }
        return 0;
    }

    public float getFloat(int i, int i2) {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b17133d", new Object[]{this, new Integer(i), new Integer(i2)})).floatValue();
        }
        SparseArray<float[]> sparseArray = this.t;
        if (sparseArray != null && (fArr = sparseArray.get(i)) != null && fArr.length > i2) {
            return fArr[i2];
        }
        return 0.0f;
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.f6247a = uCreateGlProgram(str, str2);
        this.b = GLES20.glGetAttribLocation(this.f6247a, "vPosition");
        this.c = GLES20.glGetAttribLocation(this.f6247a, "vCoord");
        this.d = GLES20.glGetUniformLocation(this.f6247a, "vMatrix");
        this.e = GLES20.glGetUniformLocation(this.f6247a, "vTexture");
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            a(uRes(this.f, str), uRes(this.f, str2));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.g = allocateDirect.asFloatBuffer();
        this.g.put(this.o);
        this.g.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.h = allocateDirect2.asFloatBuffer();
        this.h.put(this.q);
        this.h.position(0);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            GLES20.glUseProgram(this.f6247a);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        GLES20.glEnableVertexAttribArray(this.b);
        GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, (Buffer) this.g);
        GLES20.glEnableVertexAttribArray(this.c);
        GLES20.glVertexAttribPointer(this.c, 2, 5126, false, 0, (Buffer) this.h);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.b);
        GLES20.glDisableVertexAttribArray(this.c);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            GLES20.glUniformMatrix4fv(this.d, 1, false, this.l, 0);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        GLES20.glActiveTexture(this.m + 33984);
        GLES20.glBindTexture(3553, getTextureId());
        GLES20.glUniform1i(this.e, this.m);
    }

    public static void glError(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e0bcb5", new Object[]{new Integer(i), obj});
        } else if (!DEBUG || i == 0) {
        } else {
            Log.e(icf.a.CONTROL_FILTER, "glError:" + i + "---" + obj);
        }
    }

    public static String uRes(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be42987", new Object[]{resources, str});
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = resources.getAssets().open(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (-1 != read) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    return sb.toString().replaceAll("\\r\\n", "\n");
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static int uCreateGlProgram(String str, String str2) {
        int uLoadShader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("656ee31c", new Object[]{str, str2})).intValue();
        }
        int uLoadShader2 = uLoadShader(35633, str);
        if (uLoadShader2 == 0 || (uLoadShader = uLoadShader(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            return glCreateProgram;
        }
        GLES20.glAttachShader(glCreateProgram, uLoadShader2);
        GLES20.glAttachShader(glCreateProgram, uLoadShader);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        glError(1, "Could not link program:" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int uLoadShader(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36aaff59", new Object[]{new Integer(i), str})).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        glError(1, "Could not compile shader:" + i);
        glError(1, "GLES20 Error:" + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        GLES20.glDeleteProgram(this.f6247a);
        this.f6247a = -1;
    }
}
