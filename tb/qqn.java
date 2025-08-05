package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public abstract class qqn implements qqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f f33035a;
    public final ITMSPage b;
    public volatile boolean r;

    static {
        kge.a(-549955538);
        kge.a(-320735435);
    }

    @Override // tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.qqq
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // tb.qqq
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        }
    }

    @Override // tb.qqq
    public void a(String target, String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c98f3", new Object[]{this, target, event, json});
            return;
        }
        q.d(target, "target");
        q.d(event, "event");
    }

    @Override // tb.qqq
    public void b(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, event, json});
        } else {
            q.d(event, "event");
        }
    }

    @Override // tb.qqq
    public void b(qqp qqpVar, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f559a1ca", new Object[]{this, qqpVar, qqoVar});
        }
    }

    @Override // tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // tb.qqq
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        }
    }

    @Override // tb.qqq
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        }
    }

    @Override // tb.qqq
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        }
    }

    @Override // tb.qqq
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        }
    }

    public qqn(ITMSPage mPage) {
        q.d(mPage, "mPage");
        this.b = mPage;
        this.f33035a = this.b.b();
    }

    @Override // tb.qqq
    public void a(qqo listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd46229", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        s sVar = s.f18233a;
        q.b(sVar, "ProcedureManagerProxy.PROXY");
        sVar.d().a("tmsRenderType", d());
    }

    @Override // tb.qqq
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.r = true;
        }
    }
}
