package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter;

/* loaded from: classes9.dex */
public class scg extends AbstractNetworkConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f33469a;

    static {
        kge.a(2088688343);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(64);
        f33469a = concurrentHashMap;
        concurrentHashMap.put(HttpHeaderConstant.X_SID, "sid");
        f33469a.put(HttpHeaderConstant.X_T, "t");
        f33469a.put(HttpHeaderConstant.X_APPKEY, "appKey");
        f33469a.put(HttpHeaderConstant.X_TTID, "ttid");
        f33469a.put(HttpHeaderConstant.X_DEVID, "deviceId");
        f33469a.put(HttpHeaderConstant.X_UTDID, "utdid");
        f33469a.put(HttpHeaderConstant.X_SIGN, "sign");
        f33469a.put(HttpHeaderConstant.X_NQ, "nq");
        f33469a.put(HttpHeaderConstant.X_NETTYPE, "netType");
        f33469a.put("x-pv", "pv");
        f33469a.put(HttpHeaderConstant.X_UID, "uid");
        f33469a.put(HttpHeaderConstant.X_UMID_TOKEN, "umt");
        f33469a.put(HttpHeaderConstant.X_REQBIZ_EXT, "reqbiz-ext");
        f33469a.put(HttpHeaderConstant.X_ROUTER_ID, "routerId");
        f33469a.put(HttpHeaderConstant.X_PLACE_ID, "placeId");
        f33469a.put(HttpHeaderConstant.X_OPEN_BIZ, "open-biz");
        f33469a.put(HttpHeaderConstant.X_MINI_APPKEY, "mini-appkey");
        f33469a.put(HttpHeaderConstant.X_REQ_APPKEY, "req-appkey");
        f33469a.put(HttpHeaderConstant.X_OPEN_BIZ_DATA, "open-biz-data");
        f33469a.put(HttpHeaderConstant.X_ACT, "accessToken");
        f33469a.put(HttpHeaderConstant.X_MINI_WUA, HttpHeaderConstant.X_MINI_WUA);
        f33469a.put(HttpHeaderConstant.X_APP_CONF_V, HttpHeaderConstant.X_APP_CONF_V);
        f33469a.put(HttpHeaderConstant.X_EXTTYPE, HttpHeaderConstant.KEY_EXTTYPE);
        f33469a.put(HttpHeaderConstant.X_EXTDATA, HttpHeaderConstant.KEY_EXTDATA);
        f33469a.put(HttpHeaderConstant.X_FEATURES, HttpHeaderConstant.X_FEATURES);
        f33469a.put(HttpHeaderConstant.X_PAGE_NAME, HttpHeaderConstant.X_PAGE_NAME);
        f33469a.put(HttpHeaderConstant.X_PAGE_URL, HttpHeaderConstant.X_PAGE_URL);
        f33469a.put(HttpHeaderConstant.X_PAGE_MAB, HttpHeaderConstant.X_PAGE_MAB);
        f33469a.put(HttpHeaderConstant.X_APP_VER, HttpHeaderConstant.X_APP_VER);
        f33469a.put(HttpHeaderConstant.X_ORANGE_Q, HttpHeaderConstant.X_ORANGE_Q);
        f33469a.put("user-agent", "user-agent");
        f33469a.put(HttpHeaderConstant.CLIENT_TRACE_ID, HttpHeaderConstant.CLIENT_TRACE_ID);
        f33469a.put("x-falco-id", "x-falco-id");
        f33469a.put("f-refer", "f-refer");
        f33469a.put(HttpHeaderConstant.X_NETINFO, HttpHeaderConstant.X_NETINFO);
    }

    @Override // mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter
    public Map<String, String> getHeaderConversionMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e3115b5f", new Object[]{this}) : f33469a;
    }
}
