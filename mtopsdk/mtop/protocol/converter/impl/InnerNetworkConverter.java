package mtopsdk.mtop.protocol.converter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.kge;

/* loaded from: classes.dex */
public class InnerNetworkConverter extends AbstractNetworkConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.InnerNetworkConverter";
    private static final Map<String, String> headerConversionMap;

    static {
        kge.a(-40895147);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(64);
        headerConversionMap = concurrentHashMap;
        concurrentHashMap.put(HttpHeaderConstant.X_SID, "sid");
        headerConversionMap.put(HttpHeaderConstant.X_T, "t");
        headerConversionMap.put(HttpHeaderConstant.X_APPKEY, "appKey");
        headerConversionMap.put(HttpHeaderConstant.X_TTID, "ttid");
        headerConversionMap.put(HttpHeaderConstant.X_DEVID, "deviceId");
        headerConversionMap.put(HttpHeaderConstant.X_UTDID, "utdid");
        headerConversionMap.put(HttpHeaderConstant.X_SIGN, "sign");
        headerConversionMap.put(HttpHeaderConstant.X_NQ, "nq");
        headerConversionMap.put(HttpHeaderConstant.X_NETTYPE, "netType");
        headerConversionMap.put("x-pv", "pv");
        headerConversionMap.put(HttpHeaderConstant.X_UID, "uid");
        headerConversionMap.put(HttpHeaderConstant.X_UMID_TOKEN, "umt");
        headerConversionMap.put(HttpHeaderConstant.X_REQBIZ_EXT, "reqbiz-ext");
        headerConversionMap.put(HttpHeaderConstant.X_ROUTER_ID, "routerId");
        headerConversionMap.put(HttpHeaderConstant.X_PLACE_ID, "placeId");
        headerConversionMap.put(HttpHeaderConstant.X_OPEN_BIZ, "open-biz");
        headerConversionMap.put(HttpHeaderConstant.X_MINI_APPKEY, "mini-appkey");
        headerConversionMap.put(HttpHeaderConstant.X_REQ_APPKEY, "req-appkey");
        headerConversionMap.put(HttpHeaderConstant.X_OPEN_BIZ_DATA, "open-biz-data");
        headerConversionMap.put(HttpHeaderConstant.X_ACT, "accessToken");
        headerConversionMap.put(HttpHeaderConstant.X_MINI_WUA, HttpHeaderConstant.X_MINI_WUA);
        headerConversionMap.put(HttpHeaderConstant.X_APP_CONF_V, HttpHeaderConstant.X_APP_CONF_V);
        headerConversionMap.put(HttpHeaderConstant.X_EXTTYPE, HttpHeaderConstant.KEY_EXTTYPE);
        headerConversionMap.put(HttpHeaderConstant.X_EXTDATA, HttpHeaderConstant.KEY_EXTDATA);
        headerConversionMap.put(HttpHeaderConstant.X_FEATURES, HttpHeaderConstant.X_FEATURES);
        headerConversionMap.put(HttpHeaderConstant.X_PAGE_NAME, HttpHeaderConstant.X_PAGE_NAME);
        headerConversionMap.put(HttpHeaderConstant.X_PAGE_URL, HttpHeaderConstant.X_PAGE_URL);
        headerConversionMap.put(HttpHeaderConstant.X_PAGE_MAB, HttpHeaderConstant.X_PAGE_MAB);
        headerConversionMap.put(HttpHeaderConstant.X_APP_VER, HttpHeaderConstant.X_APP_VER);
        headerConversionMap.put(HttpHeaderConstant.X_ORANGE_Q, HttpHeaderConstant.X_ORANGE_Q);
        headerConversionMap.put("user-agent", "user-agent");
        headerConversionMap.put(HttpHeaderConstant.CLIENT_TRACE_ID, HttpHeaderConstant.CLIENT_TRACE_ID);
        headerConversionMap.put("x-falco-id", "x-falco-id");
        headerConversionMap.put("f-refer", "f-refer");
        headerConversionMap.put(HttpHeaderConstant.X_NETINFO, HttpHeaderConstant.X_NETINFO);
        headerConversionMap.put(HttpHeaderConstant.X_SIGN_CONTROL, HttpHeaderConstant.X_SIGN_CONTROL);
        headerConversionMap.put("x-sgext", "x-sgext");
        headerConversionMap.put(HttpHeaderConstant.X_ACCEPT_STREAM, HttpHeaderConstant.X_ACCEPT_STREAM);
    }

    @Override // mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter
    public Map<String, String> getHeaderConversionMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e3115b5f", new Object[]{this}) : headerConversionMap;
    }
}
