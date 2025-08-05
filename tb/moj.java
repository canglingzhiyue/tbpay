package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.os.TraceCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IPageListener;
import com.taobao.application.common.impl.b;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.q;
import com.taobao.monitor.impl.util.h;

/* loaded from: classes.dex */
public class moj extends mok {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;
    private q c;
    private int d;
    private final IPageListener e;

    public static /* synthetic */ Object ipc$super(moj mojVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public moj(mou mouVar) {
        super(mouVar);
        this.c = null;
        this.d = 1;
        this.e = b.d().g();
        this.b = mouVar.i();
        this.e.a(mouVar.i(), 0, h.a());
        m a2 = a.a(a.PAGE_RENDER_DISPATCHER);
        if (a2 instanceof q) {
            this.c = (q) a2;
        }
    }

    @Override // tb.mok
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (!f.a(this.c)) {
            this.c.a(this.f31166a, j);
        }
        this.e.a(this.b, 1, h.a());
    }

    @Override // tb.mok
    public void b(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f634ad", new Object[]{this, new Float(f), new Long(j)});
        } else if (f.a(this.c)) {
        } else {
            this.c.a(this.f31166a, f, j);
        }
    }

    @Override // tb.mok
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        if (!f.a(this.c)) {
            mpi.a("PageLifeCycle", this.f31166a.c(), this.f31166a.k(), "Visible", Long.valueOf(j - this.f31166a.t()));
            this.c.b(this.f31166a, j);
            if (!d.K) {
                this.c.a(this.f31166a, 0);
                this.d = 0;
            }
        }
        this.e.a(this.b, 2, j);
    }

    @Override // tb.mok
    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            return;
        }
        if (!f.a(this.c)) {
            this.c.d(this.f31166a, j);
            mpi.a("PageLifeCycle", this.f31166a.c(), this.f31166a.k(), "Interactive", Long.valueOf(j - this.f31166a.t()));
            if (d.K) {
                this.c.a(this.f31166a, 0);
                this.d = 0;
            }
        }
        TraceCompat.beginSection("apmInteractive-" + this.b);
        TraceCompat.endSection();
        this.e.a(this.b, 3, j);
    }

    @Override // tb.mok
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // tb.mok
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.d != 1 || f.a(this.c)) {
        } else {
            this.c.a(this.f31166a, i);
            this.d = i;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(e.a().b());
        Intent intent = new Intent("ACTIVITY_FRAGMENT_VISIBLE_ACTION");
        intent.putExtra("page_name", this.b);
        if (this.f31166a.m() != null) {
            intent.putExtra("type", "activity");
        } else if (this.f31166a.n() != null) {
            intent.putExtra("type", bgp.FRAGMENT);
        } else {
            intent.putExtra("type", "unknown");
        }
        intent.putExtra("status", 1);
        localBroadcastManager.sendBroadcastSync(intent);
    }
}
