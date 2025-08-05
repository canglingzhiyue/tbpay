package com.loc;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.MotionEventCompat;
import com.alibaba.security.realidentity.f3;
import com.loc.da;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyGenerator;
import tb.ndv;

/* loaded from: classes4.dex */
public final class es implements em {
    private static long k;

    /* renamed from: a  reason: collision with root package name */
    Context f7769a;
    dw d;
    private Handler g;
    private LocationManager h;
    private a i;
    private ArrayList<dc> f = new ArrayList<>();
    ff b = null;
    fb c = null;
    private volatile boolean j = false;
    bv e = new bv();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        private es f7771a;

        a(es esVar) {
            this.f7771a = esVar;
        }

        final void a() {
            this.f7771a = null;
        }

        final void a(es esVar) {
            this.f7771a = esVar;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                if (this.f7771a == null) {
                    return;
                }
                this.f7771a.a(location);
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends cs {
        private int b;
        private Location c;

        b(int i) {
            this.b = 0;
            this.b = i;
        }

        b(es esVar, Location location) {
            this(1);
            this.c = location;
        }

        private void b() {
            try {
                int i = 0;
                new Object[1][0] = "Cl | dl -- dc";
                if (this.c == null || !es.this.j) {
                    return;
                }
                if (fy.m(es.this.f7769a)) {
                    new Object[1][0] = "Cl | dl -- c_perm_dc";
                    return;
                }
                Bundle extras = this.c.getExtras();
                if (extras != null) {
                    i = extras.getInt("satellites");
                }
                if (fy.a(this.c, i)) {
                    return;
                }
                if (es.this.b != null && !es.this.b.s) {
                    es.this.b.f();
                }
                ArrayList<eg> a2 = es.this.b.a();
                List<dz> a3 = es.this.c.a();
                da.a aVar = new da.a();
                ef efVar = new ef();
                efVar.i = this.c.getAccuracy();
                efVar.f = this.c.getAltitude();
                efVar.d = this.c.getLatitude();
                efVar.h = this.c.getBearing();
                efVar.e = this.c.getLongitude();
                efVar.j = this.c.isFromMockProvider();
                efVar.f7757a = this.c.getProvider();
                efVar.g = this.c.getSpeed();
                efVar.l = (byte) i;
                efVar.b = System.currentTimeMillis();
                efVar.c = this.c.getTime();
                efVar.k = this.c.getTime();
                aVar.f7744a = efVar;
                aVar.b = a2;
                WifiInfo c = es.this.b.c();
                if (c != null) {
                    aVar.c = eg.a(c.getBSSID());
                }
                aVar.d = ff.A;
                aVar.f = this.c.getTime();
                aVar.g = (byte) o.i(es.this.f7769a);
                aVar.h = o.n(es.this.f7769a);
                aVar.e = es.this.b.k();
                aVar.j = fy.a(es.this.f7769a);
                aVar.i = a3;
                dc a4 = dw.a(aVar);
                if (a4 == null) {
                    return;
                }
                synchronized (es.this.f) {
                    es.this.f.add(a4);
                    if (es.this.f.size() >= 5) {
                        es.this.e();
                    }
                }
                es.this.d();
            } catch (Throwable th) {
                fr.a(th, "cl", "coll");
            }
        }

        private void c() {
            new Object[1][0] = "Cl | dl -- duts";
            if (fy.m(es.this.f7769a)) {
                new Object[1][0] = "Cl | dl -- c_perm_duts";
                return;
            }
            bl blVar = null;
            try {
                long unused = es.k = System.currentTimeMillis();
                if (es.this.e.f.c()) {
                    blVar = bl.a(new File(es.this.e.f7709a), es.this.e.b);
                    ArrayList arrayList = new ArrayList();
                    byte[] a2 = es.a(128);
                    if (a2 == null) {
                        try {
                            blVar.close();
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    List b = es.b(blVar, es.this.e, arrayList, a2);
                    if (b != null && b.size() != 0) {
                        es.this.e.f.a(true);
                        if (dw.a(x.b(dw.a(fg.a(a2), p.b(a2, dw.a(), x.c()), b)))) {
                            es.b(blVar, arrayList);
                        }
                    }
                    try {
                        blVar.close();
                        return;
                    } catch (Throwable unused3) {
                        return;
                    }
                }
                if (blVar == null) {
                    return;
                }
                try {
                    blVar.close();
                } catch (Throwable unused4) {
                }
            } catch (Throwable th) {
                try {
                    av.b(th, "leg", "uts");
                    if (blVar == null) {
                        return;
                    }
                    try {
                        blVar.close();
                    } catch (Throwable unused5) {
                    }
                } catch (Throwable th2) {
                    if (blVar != null) {
                        try {
                            blVar.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    throw th2;
                }
            }
        }

        @Override // com.loc.cs
        public final void a() {
            int i = this.b;
            if (i == 1) {
                b();
            } else if (i == 2) {
                c();
            } else if (i != 3) {
            } else {
                es.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public es(Context context) {
        this.f7769a = null;
        this.f7769a = context;
        cb.a(this.f7769a, this.e, at.k, 100, f3.d, "0");
        bv bvVar = this.e;
        int i = fq.g;
        boolean z = fq.e;
        int i2 = fq.f;
        bvVar.f = new cn(context, i, "kKey", new cl(context, z, i2, i2 * 10, "carrierLocKey"));
        this.e.e = new be();
    }

    private static int a(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] a(int i) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            if (keyGenerator == null) {
                return null;
            }
            keyGenerator.init(i);
            return keyGenerator.generateKey().getEncoded();
        } catch (Throwable unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.List<com.loc.dc> b(com.loc.bl r17, com.loc.bv r18, java.util.List<java.lang.String> r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.es.b(com.loc.bl, com.loc.bv, java.util.List, byte[]):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(bl blVar, List<String> list) {
        if (blVar != null) {
            try {
                for (String str : list) {
                    blVar.c(str);
                }
                blVar.close();
            } catch (Throwable th) {
                av.b(th, "aps", "dlo");
            }
        }
    }

    private static byte[] b(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    private static byte[] c(int i) {
        return new byte[]{(byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), (byte) (i & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            new Object[1][0] = "Cl | dl -- wtd";
            if (fy.m(this.f7769a)) {
                new Object[1][0] = "Cl | dl -- c_perm_wtd";
                return;
            }
            if (this.f != null && this.f.size() != 0) {
                ArrayList arrayList = new ArrayList();
                synchronized (this.f) {
                    arrayList.addAll(this.f);
                    this.f.clear();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] a2 = a(256);
                if (a2 == null) {
                    return;
                }
                byteArrayOutputStream.write(c(a2.length));
                byteArrayOutputStream.write(a2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dc dcVar = (dc) it.next();
                    byte[] b2 = dcVar.b();
                    if (b2.length >= 10 && b2.length <= 65535) {
                        byte[] b3 = p.b(a2, b2, x.c());
                        byteArrayOutputStream.write(c(b3.length));
                        byteArrayOutputStream.write(b3);
                        byteArrayOutputStream.write(b(dcVar.a()));
                    }
                }
                bw.a(Long.toString(System.currentTimeMillis()), byteArrayOutputStream.toByteArray(), this.e);
            }
        } catch (Throwable th) {
            fr.a(th, "clm", "wtD");
        }
    }

    @Override // com.loc.em
    public final el a(ek ekVar) {
        try {
            fl flVar = new fl();
            flVar.a(ekVar.b);
            flVar.b(ekVar.f7760a);
            flVar.a(ekVar.d);
            bo.a();
            bu a2 = bo.a(flVar);
            el elVar = new el();
            elVar.c = a2.f7708a;
            elVar.b = a2.b;
            elVar.f7761a = 200;
            return elVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (fy.m(this.f7769a)) {
            new Object[1][0] = "Cl | dl -- c_perm_spc";
            return;
        }
        try {
            if (this.i != null && this.h != null) {
                this.h.removeUpdates(this.i);
            }
            if (this.i != null) {
                this.i.a();
            }
            if (!this.j) {
                return;
            }
            g();
            this.b.a((es) null);
            this.c.a((es) null);
            this.c = null;
            this.b = null;
            this.g = null;
            this.j = false;
        } catch (Throwable th) {
            fr.a(th, "clm", "stc");
        }
    }

    public final void a(Location location) {
        try {
            if (this.g == null) {
                return;
            }
            this.g.post(new b(this, location));
        } catch (Throwable th) {
            av.b(th, "cl", "olcc");
        }
    }

    public final void a(fb fbVar, ff ffVar, Handler handler) {
        new Object[1][0] = "Cl | dl -- sc";
        if (this.j || fbVar == null || ffVar == null || handler == null) {
            return;
        }
        if (fy.m(this.f7769a)) {
            new Object[1][0] = "Cl | dl -- c_perm_sc";
            return;
        }
        this.j = true;
        this.c = fbVar;
        this.b = ffVar;
        this.b.a(this);
        this.c.a(this);
        this.g = handler;
        try {
            if (this.h == null && this.g != null) {
                this.h = (LocationManager) this.f7769a.getSystemService("location");
            }
            if (this.i == null) {
                this.i = new a(this);
            }
            this.i.a(this);
            if (this.i != null && this.h != null) {
                this.h.requestLocationUpdates(ndv.REQUEST_PASSIVE, 1000L, -1.0f, this.i);
            }
            if (this.d != null) {
                return;
            }
            this.d = new dw("6.2.0", l.f(this.f7769a), "S128DF1572465B890OE3F7A13167KLEI", l.c(this.f7769a), this);
            this.d.a(o.k()).b(o.f(this.f7769a)).c(o.a(this.f7769a)).d(o.e(this.f7769a)).e(o.n()).f(o.f()).g(Build.MODEL).h(Build.MANUFACTURER).i(Build.BRAND).a(Build.VERSION.SDK_INT).j(Build.VERSION.RELEASE).a(eg.a(o.h())).k(o.h());
            dw.b();
        } catch (Throwable th) {
            fr.a(th, "col", "init");
        }
    }

    public final void b() {
        try {
            new Object[1][0] = "Cl | dl -- uwf";
            if (this.g == null) {
                return;
            }
            this.g.post(new Runnable() { // from class: com.loc.es.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (es.this.d == null || es.this.b == null) {
                            return;
                        }
                        dw.b(es.this.b.a());
                    } catch (Throwable th) {
                        fr.a(th, "cl", "upwr");
                    }
                }
            });
        } catch (Throwable th) {
            fr.a(th, "cl", "upw");
        }
    }

    public final void c() {
        try {
            new Object[1][0] = "Cl | dl -- uc";
            if (this.d == null || this.c == null) {
                return;
            }
            dw.a(this.c.a());
        } catch (Throwable th) {
            fr.a(th, "cl", "upc");
        }
    }

    public final void d() {
        try {
            if (fy.m(this.f7769a)) {
                new Object[1][0] = "Cl | dl -- c_perm_uts";
            } else if (System.currentTimeMillis() - k < 60000) {
            } else {
                cr.a().b(new b(2));
            }
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        try {
            cr.a().b(new b(3));
        } catch (Throwable unused) {
        }
    }
}
