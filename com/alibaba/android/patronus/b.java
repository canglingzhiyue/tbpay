package com.alibaba.android.patronus;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f2406a = false;

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2407a = false;
        public boolean b = true;
        public float c = 0.675f;
        public int d = 125;
        public int e = 2;
        public int f = 384;
        public boolean g = false;
        public boolean h = true;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "{ debuggable=" + this.f2407a + ", auto=" + this.b + ", periodOfShrink=" + this.c + ", shrinkStep=" + this.d + ", periodOfCheck=" + this.e + ", lowerLimit=" + this.f + ", recordInitResult=" + this.h + " }";
        }
    }

    public static int a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3c0b865", new Object[]{context, aVar})).intValue();
        }
        if (f2406a) {
            return 0;
        }
        int a2 = _Patrons.a(context, aVar);
        if (a2 != 0) {
            z = false;
        }
        f2406a = z;
        return a2;
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : _Patrons.a(i);
    }
}
