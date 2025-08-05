package com.etao.feimagesearch.util;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.com;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aj f7020a;

    public static /* synthetic */ aj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aj) ipChange.ipc$dispatch("d565ac36", new Object[0]) : f7020a;
    }

    static {
        kge.a(1822097076);
        f7020a = new aj(com.b());
    }

    public static c a(byte[] bArr, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e09f28a", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)}) : new b(bArr, 1, i, i2, i3, z);
    }

    /* loaded from: classes4.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f7022a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        static {
            kge.a(-210958918);
        }

        public abstract int a();

        public abstract Bitmap a(RectF rectF, boolean z);

        public abstract int b();

        public abstract int c();

        public c(int i, int i2, int i3, boolean z, int i4) {
            this.f7022a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = i4;
        }

        public d b(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6ac57c72", new Object[]{this, new Integer(i), new Integer(i2)}) : new d(this, i, i2, true);
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f7022a;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.b;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.c;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.d;
        }

        public int h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.e;
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : a() % 180 == 0;
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATA_TYPE_YUV = 1;

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f7021a;
        private final int b;

        static {
            kge.a(-1744015551);
        }

        public b(byte[] bArr, int i, int i2, int i3, int i4, boolean z) {
            super(i2, i3, z ? 90 : 270, z, i4);
            this.f7021a = bArr;
            this.b = i;
        }

        @Override // com.etao.feimagesearch.util.f.c
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            if (g()) {
                return ((h() - f()) + 360) % 360;
            }
            return (720 - (h() + f())) % 360;
        }

        @Override // com.etao.feimagesearch.util.f.c
        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : i() ? d() : e();
        }

        @Override // com.etao.feimagesearch.util.f.c
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : i() ? e() : d();
        }

        @Override // com.etao.feimagesearch.util.f.c
        public Bitmap a(RectF rectF, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("91ee5c59", new Object[]{this, rectF, new Boolean(z)});
            }
            Bitmap a2 = f.a().a(a(), d(), e(), this.f7021a, rectF, b(), c());
            return (!g() || !z) ? a2 : com.etao.feimagesearch.util.d.a(a2, -1.0f, 1.0f);
        }
    }

    /* loaded from: classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final c f7023a;
        private final RectF b;
        private final int c;
        private final int d;
        private final boolean e;

        static {
            kge.a(132124341);
        }

        private d(c cVar, int i, int i2, boolean z) {
            this.f7023a = cVar;
            PointF pointF = new PointF(cVar.b(), cVar.c());
            PointF a2 = aa.a(new PointF(i, i2), pointF);
            float f = (pointF.x - a2.x) / 2.0f;
            float f2 = (pointF.y - a2.y) / 2.0f;
            this.b = new RectF(f / pointF.x, f2 / pointF.y, (f + a2.x) / pointF.x, (f2 + a2.y) / pointF.y);
            this.c = i;
            this.d = i2;
            this.e = z;
        }

        public Bitmap a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : this.f7023a.a(this.b, this.e);
        }
    }
}
