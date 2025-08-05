package com.taobao.taobaoavsdk.widget.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.kge;
import tb.oyu;

/* loaded from: classes8.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f21364a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = 0;
    private int i = 0;
    private boolean j = true;

    static {
        kge.a(-1552288543);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MeasureHelper setVideoSize, videoWidth=" + i + ", videoHeight=" + i2);
        int i3 = this.e;
        if ((i3 == 90 || i3 == 270) && oyu.ae) {
            this.f21364a = i2;
            this.b = i;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MeasureHelper setVideoSize:mEnableFixRotateVideo=true and set original width=" + i2 + ", height=" + i2 + " without rotation=" + this.e);
            return;
        }
        this.f21364a = i;
        this.b = i2;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MeasureHelper setVideoSize:mEnableFixRotateVideo=false and set original width=" + i2 + ", height=" + i2 + " with rotation=" + this.e);
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c = i;
        this.d = i2;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MeasureHelper setVideoRotation, rotation=" + i);
        this.e = i;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
        if (r3 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0119, code lost:
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011c, code lost:
        r6 = (int) (r10 * r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0151, code lost:
        if (r3 > r6) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.widget.media.b.c(int, int):void");
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.h;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.g;
    }

    public float d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue();
        }
        int i2 = this.f;
        if (i2 > 0 && (i = this.g) > 0) {
            return i2 / i;
        }
        return 0.0f;
    }
}
