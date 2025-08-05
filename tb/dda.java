package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerService;
import com.taobao.adaemon.e;
import com.taobao.adaemon.j;
import com.taobao.adaemon.l;

/* loaded from: classes.dex */
public class dda extends dcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Intent f26705a;
    private boolean b;

    static {
        kge.a(-1198075831);
    }

    public dda(String str, int i) {
        super(str, i);
    }

    @Override // tb.dcw
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.f26705a = Intent.parseUri(str, 0);
            this.b = str.contains(TriggerService.class.getName());
            e.b("StartServiceAction", "parse", "limit", Boolean.valueOf(this.b), "mIntent", this.f26705a);
        } catch (Throwable th) {
            e.a("StartServiceAction", "parse err", th, new Object[0]);
        }
    }

    @Override // tb.dcw
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f26705a != null) {
            if (this.b) {
                if (l.a(l.e(), "command", "ac_ssa_day", "ac_ssa_times", "ac_ssa_minute") >= j.a().w()) {
                    e.b("StartServiceAction", "execute limit", new Object[0]);
                    c();
                    return;
                }
                l.a(l.e(), "ac_ssa_day", "ac_ssa_times", "ac_ssa_minute");
            }
            dcd.a(l.e(), this.f26705a);
            b();
        } else {
            c();
        }
    }
}
