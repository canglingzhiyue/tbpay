package tb;

import android.support.v4.os.TraceCompat;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.i;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.util.h;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class mnv implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<mou> f31146a;
    private i b;

    public static /* synthetic */ WeakReference a(mnv mnvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("64bbe211", new Object[]{mnvVar}) : mnvVar.f31146a;
    }

    public static /* synthetic */ WeakReference a(mnv mnvVar, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("78c50c09", new Object[]{mnvVar, weakReference});
        }
        mnvVar.f31146a = weakReference;
        return weakReference;
    }

    public static /* synthetic */ i b(mnv mnvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("2e496afd", new Object[]{mnvVar}) : mnvVar.b;
    }

    public mnv(mou mouVar) {
        this.f31146a = new WeakReference<>(mouVar);
        m a2 = f.a(a.PAGE_FIRST_FRAME_DISPATCHER);
        if (a2 instanceof i) {
            this.b = (i) a2;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e.a().j().postAtFrontOfQueue(new Runnable() { // from class: tb.mnv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mou mouVar = (mou) mnv.a(mnv.this).get();
                    if (mouVar == null) {
                        return;
                    }
                    mnv.a(mnv.this, null);
                    long a2 = h.a();
                    mouVar.c(a2);
                    if (mnv.b(mnv.this) == null) {
                        return;
                    }
                    mnv.b(mnv.this).a(mouVar, a2);
                }
            });
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            return;
        }
        TraceCompat.beginSection("apm.firstFrame");
        mou mouVar = this.f31146a.get();
        if (mouVar == null) {
            TraceCompat.endSection();
            return;
        }
        b();
        mpi.a("doFrame", mouVar.c(), mouVar.i());
        TraceCompat.endSection();
    }
}
