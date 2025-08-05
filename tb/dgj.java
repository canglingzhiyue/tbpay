package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.c;

/* loaded from: classes4.dex */
public class dgj implements dgi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dgi f26723a;
    private Handler b;

    static {
        kge.a(-842017473);
        kge.a(114856148);
    }

    public static /* synthetic */ dgi a(dgj dgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dgi) ipChange.ipc$dispatch("e561a0af", new Object[]{dgjVar}) : dgjVar.f26723a;
    }

    public void a(dgi dgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e515bcd2", new Object[]{this, dgiVar});
        } else {
            this.f26723a = dgiVar;
        }
    }

    private synchronized Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new Handler(a());
        }
        return this.b;
    }

    @Override // tb.dgi
    public Looper a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("d8782f3d", new Object[]{this});
        }
        dgi dgiVar = this.f26723a;
        if (dgiVar != null && dgiVar.a() != null) {
            return this.f26723a.a();
        }
        return Looper.myLooper();
    }

    @Override // tb.dgi
    public void a(final String str, final AdMonitorType adMonitorType, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8f1b50", new Object[]{this, str, adMonitorType, cVar});
        } else if (this.f26723a == null) {
        } else {
            b().post(new Runnable() { // from class: tb.dgj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (dgj.a(dgj.this) == null) {
                    } else {
                        dgj.a(dgj.this).a(str, adMonitorType, cVar);
                    }
                }
            });
        }
    }

    @Override // tb.dgi
    public void a(final int i, final String str, final String str2, final AdMonitorType adMonitorType, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181c4cd", new Object[]{this, new Integer(i), str, str2, adMonitorType, cVar});
        } else if (this.f26723a == null) {
        } else {
            b().post(new Runnable() { // from class: tb.dgj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (dgj.a(dgj.this) == null) {
                    } else {
                        dgj.a(dgj.this).a(i, str, str2, adMonitorType, cVar);
                    }
                }
            });
        }
    }

    @Override // tb.dgi
    public void b(final int i, final String str, final String str2, final AdMonitorType adMonitorType, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9dfe96c", new Object[]{this, new Integer(i), str, str2, adMonitorType, cVar});
        } else if (this.f26723a == null) {
        } else {
            b().post(new Runnable() { // from class: tb.dgj.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (dgj.a(dgj.this) == null) {
                    } else {
                        dgj.a(dgj.this).b(i, str, str2, adMonitorType, cVar);
                    }
                }
            });
        }
    }
}
