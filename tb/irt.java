package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.b;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class irt<DS extends a<? extends BaseSearchResult, ?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DS f29260a;
    private DS b;
    private String k;
    private com.taobao.android.searchbaseframe.context.a l;
    private hte n;
    private boolean c = false;
    private boolean d = true;
    private boolean e = false;
    private boolean f = true;
    private boolean g = true;
    private boolean h = false;
    private com.taobao.android.searchbaseframe.track.a i = new com.taobao.android.searchbaseframe.track.a();
    private final Map<String, Object> j = new HashMap();
    private Map<com.taobao.android.searchbaseframe.datasource.a, hte> m = new HashMap();

    static {
        kge.a(1328235214);
    }

    public static /* synthetic */ com.taobao.android.searchbaseframe.track.a a(irt irtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.track.a) ipChange.ipc$dispatch("b16985c9", new Object[]{irtVar}) : irtVar.i;
    }

    public static /* synthetic */ a b(irt irtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("db99769", new Object[]{irtVar}) : irtVar.f29260a;
    }

    public irt(DS ds, com.taobao.android.searchbaseframe.context.a aVar) {
        this.k = null;
        this.f29260a = ds;
        this.b = ds;
        this.l = aVar;
        if (this.f29260a.getBundleUrl() != null) {
            this.k = this.f29260a.getBundleUrl();
        }
        ds.c().a(new isc() { // from class: tb.irt.1
        });
    }

    public void a(b bVar, hte hteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41978ba", new Object[]{this, bVar, hteVar});
        } else {
            this.m.put(bVar, hteVar);
        }
    }

    public void a(hte hteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9e7f5f", new Object[]{this, hteVar});
        } else {
            this.n = hteVar;
        }
    }

    public hte a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hte) ipChange.ipc$dispatch("b3e89aaa", new Object[]{this, bVar});
        }
        hte hteVar = this.m.get(bVar);
        return hteVar == null ? this.n : hteVar;
    }

    public com.taobao.android.searchbaseframe.track.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.track.a) ipChange.ipc$dispatch("443c990e", new Object[]{this}) : this.i;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.i.e()) {
        } else {
            this.i.a(true);
            if (this.i.c() == 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            d().c().b().c("XSPerfTimestamp", "FirstCellRender: %d", Long.valueOf(currentTimeMillis));
            this.i.b(currentTimeMillis);
            if (((BaseSearchResult) this.f29260a.getTotalSearchResult()) != null) {
                this.i.b(this.f29260a.getTrackingPageName());
            } else {
                this.i.b("");
            }
            this.i.a(this.f29260a.getTrackingName());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.irt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    irt.this.d().postEvent(irt.a(irt.this));
                    irt.this.d().getCore().o().d(irt.a(irt.this));
                    ioy srpLifeCycleWatcher = irt.b(irt.this).getSrpLifeCycleWatcher();
                    if (srpLifeCycleWatcher == null) {
                        return;
                    }
                    srpLifeCycleWatcher.d();
                }
            });
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.k;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.k = str;
        if (this.f29260a.getBundleUrl() != null) {
            return;
        }
        this.f29260a.setBundleUrl(str);
    }

    public DS d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DS) ipChange.ipc$dispatch("cc4cd5ac", new Object[]{this}) : this.f29260a;
    }

    public DS e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DS) ipChange.ipc$dispatch("5939eccb", new Object[]{this}) : this.b;
    }

    public com.taobao.android.searchbaseframe.context.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.context.a) ipChange.ipc$dispatch("ada654c5", new Object[]{this}) : this.l;
    }

    public void a(a<? extends BaseSearchResult, ?> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24fb09", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.f;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.h;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.j.put(str, obj);
        }
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : this.j.get(str);
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.j.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }
}
