package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.utils.HprofDumpUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jey implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29512a;
    private final jdv b;

    public jey(jdy jdyVar) {
        this.f29512a = jdyVar;
        this.b = jdyVar.d();
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        String message;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        Throwable a2 = jgt.a(th);
        if (!(a2 instanceof OutOfMemoryError)) {
            return null;
        }
        if (this.b.a("dumpHeap", false) && ((message = a2.getMessage()) == null || message.contains("Failed to allocate"))) {
            b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("threads list", a());
        return hashMap;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : jgs.a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            HprofDumpUtils.a(this.f29512a, "oom.hprof");
        }
    }
}
