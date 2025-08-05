package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jee implements JvmUncaughtCrashListener, UncaughtCrashHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f29497a = new HashMap();

    @Override // com.taobao.android.tcrash.UncaughtCrashHeader
    public void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f29497a) {
            if (str2 == null) {
                this.f29497a.remove(str);
            } else {
                this.f29497a.put(str, str2);
            }
        }
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        synchronized (this.f29497a) {
            hashMap = new HashMap(this.f29497a);
        }
        return hashMap;
    }
}
