package com.taobao.pexode;

import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.d;
import tb.kge;
import tb.qol;

/* loaded from: classes.dex */
public class c implements com.taobao.pexode.common.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18681a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private com.taobao.tcommon.core.a f;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f18682a;

        static {
            kge.a(-675926414);
            f18682a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("bc3c54e5", new Object[0]) : f18682a;
        }
    }

    static {
        kge.a(1855281131);
        kge.a(2059514477);
    }

    private int a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c11928c", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : ((i << 1) + (z ? 1 : 0)) & 1023;
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("bc3c54e5", new Object[0]) : a.a();
    }

    @Override // com.taobao.pexode.common.b
    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!d.b()) {
            this.e = a(this.e, z);
            if (b(this.e) >= 8) {
                d.a(true);
                d.a a2 = d.a();
                if (a2 != null) {
                    a2.a();
                }
            }
        }
    }

    @Override // com.taobao.pexode.common.b
    public synchronized void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.b) {
            this.d = a(this.d, z);
            if (b(this.d) >= 8) {
                this.b = true;
                qol.g(d.TAG, "auto degrading to no ashmem, history=%d", Integer.valueOf(this.d));
                d.a a2 = d.a();
                if (a2 != null) {
                    a2.b();
                }
            }
        }
    }

    @Override // com.taobao.pexode.common.b
    public synchronized void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.f18681a) {
            this.c = a(this.c, z);
            if (b(this.c) >= 8) {
                this.f18681a = true;
                qol.g(d.TAG, "auto degrading to no inBitmap, history=%d", Integer.valueOf(this.c));
                d.a a2 = d.a();
                if (a2 != null) {
                    a2.c();
                }
            }
        }
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = (i - ((i >> 1) & (-613566757))) - ((i >> 2) & 1227133513);
        return ((-954437177) & (i2 + (i2 >> 3))) % 63;
    }

    public void a(com.taobao.tcommon.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80773505", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)});
        }
        byte[] bArr = null;
        com.taobao.tcommon.core.a aVar = this.f;
        if (aVar != null) {
            bArr = aVar.a(i);
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        com.taobao.tcommon.core.a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.a(bArr);
    }

    public static boolean a(e eVar, PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9182ac20", new Object[]{eVar, pexodeOptions})).booleanValue() : (pexodeOptions.justDecodeBounds && pexodeOptions.isSizeAvailable()) || (pexodeOptions.incrementalDecode && pexodeOptions.mIncrementalStaging != null) || !(eVar == null || (eVar.f18702a == null && eVar.b == null));
    }

    public static boolean b(e eVar, PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a23878e1", new Object[]{eVar, pexodeOptions})).booleanValue() : pexodeOptions.cancelled || a(eVar, pexodeOptions);
    }

    public static void a(PexodeOptions pexodeOptions, BitmapFactory.Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74cb395", new Object[]{pexodeOptions, options});
        } else {
            pexodeOptions.setUponSysOptions(options);
        }
    }

    public static boolean a(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1276573b", new Object[]{pexodeOptions})).booleanValue() : pexodeOptions.cancelled;
    }

    public static int b(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73c8f3c9", new Object[]{pexodeOptions})).intValue() : pexodeOptions.lastSampleSize;
    }

    public static void a(PexodeOptions pexodeOptions, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5502ac", new Object[]{pexodeOptions, new Integer(i)});
        } else {
            pexodeOptions.lastSampleSize = i;
        }
    }

    public static com.taobao.pexode.entity.a c(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pexode.entity.a) ipChange.ipc$dispatch("1e80f02c", new Object[]{pexodeOptions}) : pexodeOptions.mIncrementalStaging;
    }

    public static void a(PexodeOptions pexodeOptions, com.taobao.pexode.entity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57981122", new Object[]{pexodeOptions, aVar});
        } else {
            pexodeOptions.mIncrementalStaging = aVar;
        }
    }
}
