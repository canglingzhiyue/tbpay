package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.h;

/* loaded from: classes5.dex */
public class oka implements Choreographer.FrameCallback, Runnable, sfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sxs f32133a;
    private int b = -1;

    public oka(sxs sxsVar) {
        this.f32133a = sxsVar;
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
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        nso.a("LowEndMessageLoopPreparer", "prepare", i);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f32133a.j() == 10) {
            h.b("LowEndMessageLoopPreparer", "LAUNCH.mainHandlerCallback, interrupted before, do nothing here");
        } else {
            int i = this.b;
            if (i == 1) {
                gvt.a("LAUNCH.mainHandlerCallback");
                gvt.a();
                this.b = 2;
                this.f32133a.a(this);
            } else if (i != 2) {
            } else {
                gvt.a("LAUNCH.mainHandlerCallback once again");
                gvt.a();
                this.b = 3;
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (this.f32133a.j() == 10) {
            h.b("LowEndMessageLoopPreparer", "LAUNCH.doFrameCallback, interrupted before, do nothing here");
        } else {
            int i = this.b;
            if (i == 0) {
                gvt.a("LAUNCH.doFrameCallback.beforeAction");
                this.f32133a.b().run();
                gvt.a();
                this.f32133a.a(this);
                this.b = 1;
            } else if (i != 3) {
            } else {
                this.f32133a.h().run();
                this.b = 4;
                h.b("LowEndMessageLoopPreparer", "finished prepare");
            }
        }
    }
}
