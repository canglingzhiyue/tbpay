package tb;

import android.content.Context;
import com.alibaba.android.ultron.event.base.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.bizevent.a;
import com.taobao.android.sku.bizevent.b;
import com.taobao.android.sku.bizevent.d;
import com.taobao.android.sku.bizevent.e;
import com.taobao.android.sku.bizevent.g;
import com.taobao.android.sku.bizevent.h;
import com.taobao.android.sku.bizevent.i;
import com.taobao.android.sku.c;

/* loaded from: classes6.dex */
public class iya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f29403a;
    private c b;
    private f c;
    private iyb d;

    static {
        kge.a(2138810630);
    }

    public iya(Context context, c cVar, f fVar) {
        this.f29403a = context;
        this.b = cVar;
        this.c = fVar;
        this.d = new iyb(this.b);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a(b.EVENT_TYPE, new b());
        a(a.EVENT_TYPE, new a());
        a(i.EVENT_TYPE, new i());
        a(g.EVENT_TYPE, new g());
        a(h.EVENT_TYPE, new h());
        a(com.taobao.android.sku.bizevent.f.EVENT_TYPE, new com.taobao.android.sku.bizevent.f());
        this.c.b(e.EVENT_TYPE, new e());
        this.c.b(d.EVENT_TYPE, new d());
        this.c.b(com.taobao.android.sku.bizevent.c.EVENT_TYPE, new com.taobao.android.sku.bizevent.c(this.d));
    }

    public void a(String str, iyd iydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e83ceee", new Object[]{this, str, iydVar});
        } else {
            this.c.b(str, new iyc(this.d, iydVar));
        }
    }

    public f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("725af6e2", new Object[]{this}) : this.c;
    }

    public iyb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iyb) ipChange.ipc$dispatch("16b7d78b", new Object[]{this}) : this.d;
    }
}
