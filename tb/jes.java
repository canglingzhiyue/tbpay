package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jes implements AnrUncaughtListener, JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29509a;

    public jes(Context context) {
        this.f29509a = context;
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th}) : a();
    }

    @Override // com.taobao.android.tcrash.AnrUncaughtListener
    public Map<String, Object> onAnrUncaught() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this}) : a();
    }

    private Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        try {
            HashMap hashMap = new HashMap();
            String a2 = jgv.a(this.f29509a, "build_id");
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("bid", a2);
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }
}
