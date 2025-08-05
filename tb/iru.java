package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.b;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;

/* loaded from: classes6.dex */
public class iru<DS extends a<? extends BaseSearchResult, ?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private irt<DS> f29263a;
    private DS b;

    static {
        kge.a(-881790506);
    }

    public iru(irt<DS> irtVar, DS ds) {
        this.f29263a = irtVar;
        this.b = ds;
        ds.c().a(new isc() { // from class: tb.iru.1
        });
        String c = irtVar.c();
        if (ds.getBundleUrl() == null) {
            ds.setBundleUrl(c);
        }
    }

    public <T extends hte> T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f05ab65", new Object[]{this}) : (T) this.f29263a.a((b) this.b);
    }

    public void a(hte hteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9e7f5f", new Object[]{this, hteVar});
        } else {
            this.f29263a.a(hteVar);
        }
    }

    public void a(b bVar, hte hteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41978ba", new Object[]{this, bVar, hteVar});
        } else {
            this.f29263a.a(bVar, hteVar);
        }
    }

    public DS b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DS) ipChange.ipc$dispatch("b272a76e", new Object[]{this}) : this.f29263a.e();
    }

    public DS c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DS) ipChange.ipc$dispatch("3f5fbe8d", new Object[]{this}) : this.f29263a.d();
    }

    public DS d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DS) ipChange.ipc$dispatch("cc4cd5ac", new Object[]{this}) : this.b;
    }

    public irt<DS> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (irt) ipChange.ipc$dispatch("2dccaf8f", new Object[]{this}) : this.f29263a;
    }

    public com.taobao.android.searchbaseframe.context.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.context.a) ipChange.ipc$dispatch("ada654c5", new Object[]{this}) : this.f29263a.f();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.b == this.f29263a.e();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.f29263a.h();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f29263a.d(z);
        this.f29263a.c(z);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.f29263a.k();
    }
}
