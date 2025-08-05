package com.etao.feimagesearch.mnn.realtime;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6789a;
    private boolean b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;

    static {
        kge.a(-808294974);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!q.a(this.f6789a, gVar.f6789a) || this.b != gVar.b || this.c != gVar.c || this.d != gVar.d || this.e != gVar.e || this.f != gVar.f || this.g != gVar.g || this.h != gVar.h || this.j != gVar.j || this.i != gVar.i) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        byte[] bArr = this.f6789a;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        int i2 = i * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (((((((((((((((i2 + i3) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.j) * 31;
        boolean z2 = this.i;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        return i5 + i6;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageInput(yuv=" + Arrays.toString(this.f6789a) + ", frontCam=" + this.b + ", width=" + this.c + ", height=" + this.d + ", viewWidth=" + this.e + ", viewHeight=" + this.f + ", outputWidth=" + this.g + ", outputHeight=" + this.h + ", displayRotation=" + this.j + ", needFilter=" + this.i + riy.BRACKET_END_STR;
    }

    public g(byte[] yuv, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        q.c(yuv, "yuv");
        this.f6789a = yuv;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.j = i7;
        this.i = z2;
    }

    public final byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.f6789a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.j;
    }
}
