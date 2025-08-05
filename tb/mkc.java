package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mkc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VideoFrameFormatOESTexture = 4;
    public static final int VideoFrameFormatRGB = 1;
    public static final int VideoFrameFormatYUV = 2;
    public static final int VideoFrameFormatYUVTexture = 3;

    /* renamed from: a  reason: collision with root package name */
    private int f31064a;
    private int b;
    private int c;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private float[] h;

    static {
        kge.a(-961198364);
    }

    public mkc(int i, int i2, int i3) {
        this.f31064a = 3;
        this.b = 0;
        this.c = 0;
        this.f31064a = i;
        this.b = i2;
        this.c = i3;
        if (i == 4) {
            this.h = new float[16];
        }
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void a(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c197633", new Object[]{this, fArr});
        } else {
            System.arraycopy(fArr, 0, this.h, 0, 16);
        }
    }
}
