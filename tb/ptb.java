package tb;

import android.support.v4.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.s;
import tb.mon;

/* loaded from: classes7.dex */
public class ptb implements mon.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private qpi f32874a;
    private IPage b;

    public static /* synthetic */ qpi a(ptb ptbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpi) ipChange.ipc$dispatch("d06bc922", new Object[]{ptbVar}) : ptbVar.f32874a;
    }

    public void a(qpi qpiVar, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a9ea29", new Object[]{this, qpiVar, iPage});
            return;
        }
        this.f32874a = qpiVar;
        this.b = iPage;
        if (qpiVar == null) {
            return;
        }
        qpiVar.a(this);
    }

    @Override // tb.mon.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TraceCompat.beginSection("apm.onWindowFocusChanged:" + z);
        if (this.b != null) {
            s.f18233a.a(this.b.c()).b("windowFirstFocus", h.a());
            mpi.a("WindowFirstFocus", this.b.c(), this.b.i());
        }
        TraceCompat.endSection();
        e.a().j().post(new Runnable() { // from class: tb.ptb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ptb.a(ptb.this) == null) {
                } else {
                    ptb.a(ptb.this).b(ptb.this);
                }
            }
        });
    }
}
