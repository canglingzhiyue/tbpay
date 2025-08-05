package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.jni.PailitaoCUtil;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class ak {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RESULT_NOT_STAND_YET = 0;
    public static final int RESULT_RESET = -1;
    public static final int RESULT_STAND = 1;

    /* renamed from: a  reason: collision with root package name */
    private final int f7011a;
    private final int b;
    private final int c;
    private final long d;
    private final boolean[] e;
    private final byte[] f;
    private final int[] g;

    static {
        kge.a(-1193665932);
    }

    public ak(int i, int i2, int i3, long j) {
        this.f7011a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        int i4 = this.f7011a;
        this.e = new boolean[i4 * i4];
        this.f = new byte[((i4 * i4) * 3) / 2];
        this.g = new int[i4 * i4];
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this) {
            int i = this.f7011a * this.f7011a;
            for (int i2 = 0; i2 < i; i2++) {
                this.e[i2] = false;
                this.g[i2] = 0;
            }
        }
    }

    public boolean a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb6ab7d3", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).booleanValue();
        }
        try {
            PailitaoCUtil.a(bArr, i, i2, 0, 0, i, i2, 0, this.f, this.f7011a, this.f7011a);
            synchronized (this) {
                int i3 = this.f7011a * this.f7011a;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    byte b = this.f[i5];
                    i4 += b;
                    this.g[i5] = b;
                }
                int i6 = i4 / i3;
                int i7 = 0;
                for (int i8 = 0; i8 < i3; i8++) {
                    if (this.e[i8] != (this.g[i8] >= i6)) {
                        i7++;
                    }
                }
                if (i7 > this.b) {
                    for (int i9 = 0; i9 < i3; i9++) {
                        this.e[i9] = this.g[i9] >= i6;
                    }
                }
                if (i7 >= this.b) {
                    z = false;
                }
            }
            return z;
        } catch (Exception e) {
            cot.a("YuvDiffChecker", "sameWithLast", e);
            return false;
        }
    }
}
