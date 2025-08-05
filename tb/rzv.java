package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HttpHeaderConstant;

/* loaded from: classes.dex */
public class rzv extends rzr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f33444a;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(64);
        f33444a = concurrentHashMap;
        concurrentHashMap.put(HttpHeaderConstant.X_SID, "sid");
        f33444a.put(HttpHeaderConstant.X_T, "t");
        f33444a.put(HttpHeaderConstant.X_APPKEY, "appKey");
        f33444a.put(HttpHeaderConstant.X_TTID, "ttid");
        f33444a.put(HttpHeaderConstant.X_UTDID, "utdid");
        f33444a.put(HttpHeaderConstant.X_SIGN, "sign");
        f33444a.put(HttpHeaderConstant.X_UID, "uid");
        f33444a.put(HttpHeaderConstant.X_UMID_TOKEN, "umt");
        f33444a.put(HttpHeaderConstant.X_MINI_WUA, HttpHeaderConstant.X_MINI_WUA);
        f33444a.put(HttpHeaderConstant.X_APP_VER, HttpHeaderConstant.X_APP_VER);
        f33444a.put("user-agent", "user-agent");
        f33444a.put("x-falco-id", "x-falco-id");
        f33444a.put("x-sgext", "x-sgext");
        f33444a.put(HttpHeaderConstant.X_SSR_PV, "ssr-pv");
        f33444a.put(HttpHeaderConstant.X_SERVICE_UNIT, HttpHeaderConstant.X_SERVICE_UNIT);
        f33444a.put(HttpHeaderConstant.X_SERVICE_DOMAIN, HttpHeaderConstant.X_SERVICE_DOMAIN);
        f33444a.put(HttpHeaderConstant.X_SERVICE_IPS, HttpHeaderConstant.X_SERVICE_IPS);
        f33444a.put(HttpHeaderConstant.X_SERVICE_TOKEN, HttpHeaderConstant.X_SERVICE_TOKEN);
        f33444a.put(HttpHeaderConstant.X_DEVICE_LEVEL, HttpHeaderConstant.X_DEVICE_LEVEL);
    }

    @Override // tb.rzr
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : f33444a;
    }
}
