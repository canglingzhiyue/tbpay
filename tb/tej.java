package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes9.dex */
public final class tej implements tei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f34057a = new ConcurrentHashMap();
    private final Map<String, Object> b = new ConcurrentHashMap();

    static {
        kge.a(348844848);
        kge.a(-375903806);
    }

    @Override // tb.tei
    public void a(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, stage});
            return;
        }
        q.d(stage, "stage");
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f34057a.put(stage, Long.valueOf(uptimeMillis));
        TMSLogger.a("InstancePerformanceMonitor", "onStage: " + stage + ", ts: " + uptimeMillis);
    }

    @Override // tb.tei
    public void a(String key, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, key, value});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        this.b.put(key, value);
        TMSLogger.a("InstancePerformanceMonitor", "onProperty: " + key + ", value: " + value);
    }

    @Override // tb.tei
    public void a(ruw<? super String, ? super Long, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        for (Map.Entry<String, Long> entry : this.f34057a.entrySet()) {
            callback.mo2423invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // tb.tei
    public void b(ruw<? super String, Object, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec484245", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        for (Map.Entry<String, Object> entry : this.b.entrySet()) {
            callback.mo2423invoke(entry.getKey(), entry.getValue());
        }
    }
}
