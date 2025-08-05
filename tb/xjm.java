package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.h;

/* loaded from: classes5.dex */
public class xjm implements xjn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34338a;
    private final Runnable b;
    private boolean c = false;

    private xjm(String str, Runnable runnable) {
        this.f34338a = str;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (this.c) {
            h.b("RunnableDelegate", "TaskLifeCycle#" + this.f34338a + " already ran before");
            return;
        }
        try {
            h.b("RunnableDelegate", "TaskLifeCycle#" + this.f34338a + " begin to run");
            gvt.a(this.f34338a);
            this.b.run();
        } finally {
            gvt.a();
            this.c = true;
            h.b("RunnableDelegate", "TaskLifeCycle#" + this.f34338a + " finished");
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof xjm) {
            return this.b.equals(((xjm) obj).b);
        }
        if (!(obj instanceof Runnable)) {
            return false;
        }
        return this.b.equals(obj);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.b.hashCode();
    }

    public static Runnable a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("b5c43de4", new Object[]{str, runnable}) : new xjm(str, runnable);
    }
}
