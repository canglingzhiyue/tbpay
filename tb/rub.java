package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.h;

/* loaded from: classes5.dex */
public class rub implements Runnable, sfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sxs f33383a;
    private int b = -1;

    public rub(sxs sxsVar) {
        this.f33383a = sxsVar;
    }

    @Override // tb.sfp
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int i = this.b;
        if (i == -1) {
            this.b = 0;
            guh.a("LowEndSkiMessageLoopPreparer", this, 2000L);
            return;
        }
        nso.a("LowEndSkiMessageLoopPreparer", "prepare", i);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f33383a.j() == 10) {
            h.b("LowEndSkiMessageLoopPreparer", "LAUNCH.mainHandlerCallback, interrupted before, do nothing here");
        } else {
            int i = this.b;
            if (i == 0) {
                gvt.a("LAUNCH.mainHandlerIdleCallback");
                gvt.a();
                this.b = 1;
                this.f33383a.b(this);
            } else if (i != 1) {
            } else {
                gvt.a("LAUNCH.mainHandlerIdleCallback.main.action");
                this.f33383a.b().run();
                this.f33383a.h().run();
                gvt.a();
                this.b = 2;
                h.b("LowEndSkiMessageLoopPreparer", "finished prepare");
            }
        }
    }
}
