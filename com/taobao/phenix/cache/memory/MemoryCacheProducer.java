package com.taobao.phenix.cache.memory;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.h;
import com.taobao.phenix.request.ImageStatistics;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.esr;
import tb.gvt;
import tb.kge;
import tb.neb;
import tb.nec;
import tb.nhx;
import tb.nhy;
import tb.niw;
import tb.njb;
import tb.njd;
import tb.nmv;
import tb.nmx;

/* loaded from: classes.dex */
public class MemoryCacheProducer extends nmx<e, njb, com.taobao.phenix.request.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final h.a f18876a;
    private final com.taobao.phenix.cache.c<String, b> b;
    private final LimitedQueue<String> c;
    private final LimitedConcurrentHashMap<String, Integer> d;

    public static /* synthetic */ Object ipc$super(MemoryCacheProducer memoryCacheProducer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-163630786);
        f18876a = new h.a() { // from class: com.taobao.phenix.cache.memory.MemoryCacheProducer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.cache.memory.h.a
            public void a(h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("185b79a4", new Object[]{this, hVar});
                    return;
                }
                nhy a2 = com.taobao.phenix.intf.b.h().r().a();
                if (a2 == null) {
                    return;
                }
                a2.a(hVar);
            }
        };
    }

    public MemoryCacheProducer(com.taobao.phenix.cache.c<String, b> cVar) {
        super(1, 1);
        com.taobao.tcommon.core.b.a(cVar);
        this.b = cVar;
        this.c = new LimitedQueue<>(1024);
        this.d = new LimitedConcurrentHashMap<>(1024);
    }

    private static e a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("23e1dccb", new Object[]{bVar, new Boolean(z)});
        }
        return bVar.a(z, com.taobao.phenix.intf.b.h().n() != null ? com.taobao.phenix.intf.b.h().n().getResources() : null);
    }

    public static e a(com.taobao.phenix.cache.c<String, b> cVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("525a7dfa", new Object[]{cVar, str, new Boolean(z)});
        }
        b d = cVar.d(str);
        if (d == null) {
            return null;
        }
        e a2 = a(d, z);
        if (a2 == null) {
            return a2;
        }
        a2.c(true);
        Bitmap bitmap = a2.getBitmap();
        if (bitmap == null || !bitmap.isRecycled()) {
            return a2;
        }
        cVar.b(str);
        niw.c("MemoryCache", "remove image(exist cache but bitmap is recycled), key=%s, releasable=%b", str, Boolean.valueOf(z));
        return null;
    }

    public static e b(com.taobao.phenix.cache.c<String, b> cVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9a59dc59", new Object[]{cVar, str, new Boolean(z)});
        }
        b d = cVar.d(str);
        if (d == null) {
            return null;
        }
        e a2 = a(d, z);
        if (a2 == null) {
            return a2;
        }
        a2.c(true);
        Bitmap bitmap = a2.getBitmap();
        if (bitmap == null || !bitmap.isRecycled()) {
            return a2;
        }
        cVar.b(str);
        niw.c("MemoryCache", "remove image(exist cache but bitmap is recycled), key=%s, releasable=%b", str, Boolean.valueOf(z));
        return null;
    }

    private void f(nmv<e, com.taobao.phenix.request.b> nmvVar) {
        ImageStatistics b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0fc966", new Object[]{this, nmvVar});
        } else if (com.taobao.phenix.intf.b.h().m() == null || (b = nmvVar.e().b()) == null) {
        } else {
            b.Q = true;
            com.taobao.phenix.intf.b.h().m().b(b);
        }
    }

    @Override // tb.nmy
    public boolean a(nmv<e, com.taobao.phenix.request.b> nmvVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        long j = 0;
        com.taobao.phenix.request.b e = nmvVar.e();
        gvt.a("phenix_mem_read " + e.H());
        nhx.b(e.b());
        if (nmvVar.e().h()) {
            niw.a("Phenix", "start & end ", e, true);
            return false;
        }
        if (com.taobao.phenix.intf.b.h().F()) {
            j = System.currentTimeMillis();
        } else {
            niw.a("Phenix", "start", e, true);
        }
        d(nmvVar);
        String u = e.u();
        boolean e2 = e.e();
        e a2 = a(this.b, u, e2);
        boolean z = a2 != null;
        niw.a("MemoryCache", e, "read from memcache, result=%B, key=%s", Boolean.valueOf(z), u);
        boolean k = e.k();
        if (!z && !k) {
            String[] strArr = esr.WHITE_LIST_FUZZY_CACHE;
            int length = strArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = strArr[i];
                int i2 = length;
                if (TextUtils.equals(e.b().b, str)) {
                    niw.d("MemoryCache", e, "read from fuzzy memcache, biz=%s, key=%s", str, u);
                    k = true;
                    break;
                }
                i++;
                length = i2;
            }
        }
        if (!z && com.taobao.phenix.intf.b.h().C() && k) {
            String v = e.v();
            if (!TextUtils.isEmpty(v)) {
                Iterator<String> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(v) && next.contains(v)) {
                        e b = b(this.b, next, e2);
                        if (b != null) {
                            if (com.taobao.phenix.intf.b.h().M() && !e.S() && !e.T()) {
                                Integer num = this.d.get(next);
                                if (num != null && (num.intValue() == 0 || (e.R() != 0 && (num.intValue() >= e.R() || e.R() - num.intValue() <= 60)))) {
                                    z = true;
                                }
                                niw.d("MemoryCache", e, "read from isFuzzyMatchCache, result=%B, ori_size=%d, current_size=%d", Boolean.valueOf(z), num, Integer.valueOf(e.R()));
                            }
                            if (e.k() || z) {
                                e.b().d(true);
                            }
                        }
                        a2 = b;
                    }
                }
                if (!z && !e.k()) {
                    a2 = null;
                }
            }
        }
        if (!z && a2 == null && e.A() != null) {
            String a3 = e.A().a();
            a2 = a(this.b, a3, e2);
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(a2 != null);
            objArr[1] = a3;
            niw.a("MemoryCache", e, "secondary read from memcache, result=%B, key=%s", objArr);
            if (a2 != null) {
                a2.b(true);
                e.z();
            }
        }
        if (z) {
            f(nmvVar);
        }
        a(nmvVar, z);
        if (a2 != null) {
            nmvVar.b(a2, z);
            e.b().c(true);
        } else {
            e.b().c(false);
        }
        gvt.a();
        if (!z && a2 == null && e.f()) {
            nmvVar.b(new MemOnlyFailedException());
            niw.a("Phenix", "End MemOnlyFailedException", e, true);
            f(nmvVar);
            return true;
        }
        if (com.taobao.phenix.intf.b.h().F()) {
            niw.a("Phenix", "End, duration = " + (System.currentTimeMillis() - j), e, true);
        } else {
            niw.a("Phenix", "End", e, z);
        }
        return z;
    }

    private static b a(com.taobao.phenix.request.b bVar, njb njbVar, h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1628562c", new Object[]{bVar, njbVar, aVar});
        }
        com.taobao.phenix.request.c y = bVar.y();
        if (njbVar.f()) {
            return new h(njbVar.c(), njbVar.d(), y.a(), y.c(), y.d(), bVar.l()).a(aVar);
        }
        return new a(njbVar.e(), y.a(), y.c(), y.d(), bVar.l());
    }

    @Override // tb.nmx
    public void a(nmv<e, com.taobao.phenix.request.b> nmvVar, boolean z, njb njbVar) {
        boolean z2;
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a063299d", new Object[]{this, nmvVar, new Boolean(z), njbVar});
            return;
        }
        com.taobao.phenix.request.b e = nmvVar.e();
        gvt.a("phenix_mem_write " + e.H());
        boolean e2 = e.e();
        String u = e.u();
        b bVar = null;
        e a3 = e.h() ? null : a(this.b, u, e2);
        boolean z3 = a3 == null;
        nec c = njbVar.b() != null ? njbVar.b().c() : null;
        boolean z4 = com.taobao.phenix.intf.b.f18927a && Build.VERSION.SDK_INT == 28 && c != null && (c.a(neb.WEBP) || c.a(neb.WEBP_A));
        if (z3) {
            if (z4) {
                a2 = a(e, njbVar, (h.a) null);
            } else {
                a2 = a(e, njbVar, f18876a);
            }
            bVar = a2;
            a3 = a(bVar, e2);
            z2 = e.M() && z && njbVar.a();
            if (!z2 && njbVar.i()) {
                a3.e(true);
            }
            njd b = njbVar.b();
            if (b != null) {
                a3.d(b.e);
                a3.b(b.j);
                if (!z) {
                    b.h();
                }
            }
        } else {
            if (e.M()) {
                niw.b("MemoryCache", e, "found existing cache before new CachedRootImage with pipeline consume result, key=%s", u);
            }
            z2 = false;
        }
        e.a(System.currentTimeMillis());
        nhx.e(e.b());
        niw.a("Phenix", "Dispatch Image to UI Thread.", e, true);
        gvt.a();
        nmvVar.b(a3, z);
        if (z2) {
            boolean a4 = this.b.a(e.j(), u, bVar);
            this.c.add(u);
            this.d.put(u, Integer.valueOf(e.R()));
            niw.a("MemoryCache", e, "write into memcache with priority=%d, result=%B, value=%s", Integer.valueOf(e.j()), Boolean.valueOf(a4), bVar);
        } else if (!z3 || !z || !njbVar.a()) {
        } else {
            niw.b("MemoryCache", e, "skip to write into memcache cause the request is not pipeline, key=%s", u);
        }
    }

    /* loaded from: classes.dex */
    public class LimitedQueue<E> extends ConcurrentLinkedQueue<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int limit;

        static {
            kge.a(-403978915);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object ipc$super(LimitedQueue limitedQueue, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -667118713) {
                if (hashCode != 195222152) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.add(objArr[0]));
            }
            return super.remove();
        }

        public LimitedQueue(int i) {
            this.limit = i;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
            }
            boolean add = super.add(e);
            while (add && size() > this.limit) {
                super.remove();
            }
            return add;
        }
    }
}
