package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.d;
import com.taobao.phenix.cache.memory.MemoryCacheProducer;
import com.taobao.phenix.intf.event.c;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.b;
import com.taobao.rxm.schedule.f;
import com.taobao.rxm.schedule.g;
import com.taobao.rxm.schedule.j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class nir implements nnb<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.phenix.intf.event.a<c> f31488a;
    private final nio b;
    private final b c;
    private g d;
    private j e;
    private Map<String, Long> f = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f31490a;
        public ImageStatistics.FromType b;

        static {
            kge.a(1467376450);
        }

        public a(String str, ImageStatistics.FromType fromType) {
            this.f31490a = str;
            this.b = fromType;
        }
    }

    static {
        kge.a(1839027850);
        kge.a(-844702288);
    }

    public static /* synthetic */ b a(nir nirVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f97b787c", new Object[]{nirVar}) : nirVar.c;
    }

    public static /* synthetic */ com.taobao.phenix.intf.event.a b(nir nirVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.event.a) ipChange.ipc$dispatch("6d5065e3", new Object[]{nirVar}) : nirVar.f31488a;
    }

    public nir(b bVar, com.taobao.phenix.intf.event.a<c> aVar, nio nioVar) {
        this.f31488a = aVar;
        this.c = bVar;
        this.b = nioVar;
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b745ec", new Object[]{this, jVar});
        } else {
            this.e = jVar;
        }
    }

    private a a(Class cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3e1c8a73", new Object[]{this, cls, new Boolean(z)});
        }
        if (cls == MemoryCacheProducer.class) {
            return new a(ImageStatistics.KEY_READ_MEMORY_CACHE, ImageStatistics.FromType.FROM_MEMORY_CACHE);
        }
        if (cls == com.taobao.phenix.loader.file.c.class) {
            return new a(ImageStatistics.KEY_READ_LOCAL_FILE, ImageStatistics.FromType.FROM_LOCAL_FILE);
        }
        if (cls == d.class) {
            return new a(ImageStatistics.KEY_READ_DISK_CACHE, ImageStatistics.FromType.FROM_DISK_CACHE);
        }
        if (cls == com.taobao.phenix.loader.network.c.class) {
            return new a(z ? "download" : "connect", ImageStatistics.FromType.FROM_NETWORK);
        } else if (cls == nhz.class) {
            return new a(z ? ImageStatistics.KEY_BITMAP_PROCESS : ImageStatistics.KEY_BITMAP_SCALE, z ? ImageStatistics.FromType.FROM_UNKNOWN : ImageStatistics.FromType.FROM_LARGE_SCALE);
        } else if (cls != com.taobao.phenix.decode.a.class) {
            return null;
        } else {
            return new a("decode", ImageStatistics.FromType.FROM_UNKNOWN);
        }
    }

    @Override // tb.nnb
    public void a(b bVar, Class cls, boolean z, boolean z2) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47af3da", new Object[]{this, bVar, cls, new Boolean(z), new Boolean(z2)});
        } else if ((z && !z2) || (a2 = a(cls, z)) == null || a2.f31490a == null) {
        } else {
            this.f.put(a2.f31490a, Long.valueOf(0 - System.currentTimeMillis()));
            nio nioVar = this.b;
            if (nioVar == null || cls != com.taobao.phenix.decode.a.class) {
                return;
            }
            nioVar.a(bVar.H(), bVar.p());
        }
    }

    @Override // tb.nnb
    public void a(b bVar, Class cls, boolean z, boolean z2, boolean z3) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae43a3a", new Object[]{this, bVar, cls, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a(cls, z, z2);
        if ((z && !z3) || (a2 = a(cls, z)) == null || a2.f31490a == null) {
            return;
        }
        Long l = this.f.get(a2.f31490a);
        if (l != null && l.longValue() < 0) {
            this.f.put(a2.f31490a, Long.valueOf(currentTimeMillis + l.longValue()));
        }
        if (z2 && a2.b != ImageStatistics.FromType.FROM_UNKNOWN) {
            this.c.b().a(a2.b);
        }
        nio nioVar = this.b;
        if (nioVar == null || cls != com.taobao.phenix.decode.a.class) {
            return;
        }
        nioVar.b(bVar.H(), bVar.p());
    }

    private void a(Class cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9e0115", new Object[]{this, cls, new Boolean(z), new Boolean(z2)});
        } else if (this.f31488a == null || z || z2 || cls != MemoryCacheProducer.class) {
        } else {
            j jVar = this.e;
            if (jVar != null && (!jVar.b() || !com.taobao.tcommon.core.c.a())) {
                if (this.d == null) {
                    this.d = new g(3, null, null) { // from class: tb.nir.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.rxm.schedule.g
                        public void a(nmv nmvVar, f fVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d6a83457", new Object[]{this, nmvVar, fVar});
                                return;
                            }
                            c cVar = new c(nir.a(nir.this).m());
                            cVar.setUrl(nir.a(nir.this).p());
                            nir.b(nir.this).onHappen(cVar);
                        }
                    };
                }
                this.e.a(this.d);
                return;
            }
            this.f31488a.onHappen(new c(this.c.m()));
        }
    }

    public Map<String, Long> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f;
    }
}
