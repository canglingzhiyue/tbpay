package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.Map;

/* loaded from: classes6.dex */
public class jfa implements AnrUncaughtListener, JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.tcrash.AnrUncaughtListener
    public Map<String, Object> onAnrUncaught() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this});
        }
        jgj.a("CatcherManager", "anr");
        return null;
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\tat " + stackTraceElement);
        }
        jgj.a("CatcherManager", thread.getName(), sb.toString());
        return null;
    }
}
