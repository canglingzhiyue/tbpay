package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jfb implements jeo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.jeo
    public boolean a(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85272e00", new Object[]{this, thread, th})).booleanValue();
        }
        String name = thread.getName();
        return ("FinalizerDaemon".equals(name) || "FakeFinalizerDaemon".equals(name) || "FinalizerWatchdogDaemon".equals(name) || "FakeFinalizerWatchdogDaemon".equals(name)) && (th instanceof IllegalStateException) && ("not running".equals(th.getMessage()) || "already running".equals(th.getMessage()));
    }
}
