package tb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.r;
import com.taobao.monitor.impl.util.h;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import tb.mon;

/* loaded from: classes7.dex */
public class qpi implements mon.a, mon.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private r f33012a;
    private mon b;
    private final Activity c;
    private final List<mon.a> d = new ArrayList();
    private final List<mon.b> e = new ArrayList();

    public qpi(Activity activity) {
        this.f33012a = null;
        this.c = activity;
        m a2 = a.a(a.WINDOW_EVENT_DISPATCHER);
        if (a2 instanceof r) {
            this.f33012a = (r) a2;
        }
    }

    public qpi a() {
        Window.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpi) ipChange.ipc$dispatch("f09b434", new Object[]{this});
        }
        Activity activity = this.c;
        if (activity == null) {
            return this;
        }
        Window window = activity.getWindow();
        if (window != null && this.b == null && (callback = window.getCallback()) != null) {
            this.b = new mon(callback);
            try {
                window.setCallback((Window.Callback) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Window.Callback.class}, this.b));
                mpi.c("WindowEventCollector", "Window.Callback proxy success.");
            } catch (Exception e) {
                e.printStackTrace();
                mpi.c("WindowEventCollector", "Window.Callback proxy fail.");
            }
        }
        mon monVar = this.b;
        if (monVar != null) {
            monVar.a((mon.a) this);
            this.b.a((mon.b) this);
        }
        return this;
    }

    public void a(mon.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c13716f", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.d.add(aVar);
        }
    }

    public void b(mon.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5eedbb0", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.d.remove(aVar);
        }
    }

    public void a(mon.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c13e5ce", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.e.add(bVar);
        }
    }

    public void b(mon.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ef500f", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.e.remove(bVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        mon monVar = this.b;
        if (monVar != null) {
            monVar.b(this);
        }
        this.d.clear();
        this.e.clear();
    }

    @Override // tb.mon.a
    public void a(int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cea8149", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
            return;
        }
        if (!f.a(this.f33012a)) {
            this.f33012a.a(this.c, i, f, f2, j);
        }
        for (mon.a aVar : this.d) {
            aVar.a(i, f, f2, j);
        }
    }

    @Override // tb.mon.a
    public void a(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8cd354", new Object[]{this, keyEvent});
            return;
        }
        if (!f.a(this.f33012a)) {
            this.f33012a.a(this.c, keyEvent, h.a());
        }
        for (mon.a aVar : this.d) {
            aVar.a(keyEvent);
        }
    }

    @Override // tb.mon.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        for (mon.b bVar : this.e) {
            bVar.a(z);
        }
    }
}
