package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dsd implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-478228690);
        kge.a(-1747099954);
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        String g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        try {
            g = dro.g();
        } catch (Throwable unused) {
        }
        if (StringUtils.isEmpty(g)) {
            return hashMap;
        }
        hashMap.put("bhx", g);
        return hashMap;
    }
}
