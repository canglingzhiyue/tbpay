package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.a;
import android.taobao.windvane.config.j;
import android.taobao.windvane.export.network.e;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.Request;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVPrefetchTrigger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVPrefetchTrigger";
    public static int connectTimeout;
    private static final Map<String, WVPrefetchNetworkAdapter> mPrefetchNetwork;
    private static volatile WVPrefetchTrigger mWVPrefetchTrigger;
    public static int readTimeout;
    public static int retryTimes;

    static {
        kge.a(-1811941116);
        mPrefetchNetwork = new ConcurrentHashMap();
        retryTimes = 1;
        connectTimeout = 10000;
        readTimeout = 10000;
    }

    private WVPrefetchTrigger() {
    }

    public static WVPrefetchTrigger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPrefetchTrigger) ipChange.ipc$dispatch("da8701af", new Object[0]);
        }
        if (mWVPrefetchTrigger == null) {
            synchronized (WVPrefetchTrigger.class) {
                if (mWVPrefetchTrigger == null) {
                    mWVPrefetchTrigger = new WVPrefetchTrigger();
                }
            }
        }
        return mWVPrefetchTrigger;
    }

    public void preloadMainHtml(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eefdede", new Object[]{this, context, str});
            return;
        }
        j.a();
        preloadMainHtml(context, str, j.commonConfig.aH);
    }

    public void preloadMainHtml(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0c73a6", new Object[]{this, context, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        m.b(TAG, "preloadMainHtml url=" + str);
        HashMap hashMap = new HashMap();
        mockHeaders(str, hashMap);
        WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter = new WVPrefetchNetworkAdapter(context, ABGlobal.isFeatureOpened(context, "WVPrefetchNetType") ? 2 : 0, j, formatAliRequest(str, "GET", false, hashMap, null, null, null, 0L, 4, 0, true, "windvane"));
        mPrefetchNetwork.put(p.e(str), wVPrefetchNetworkAdapter);
        m.b(TAG, "use time =" + (System.currentTimeMillis() - currentTimeMillis));
        wVPrefetchNetworkAdapter.sendRequest();
    }

    private void mockHeaders(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0375fb8", new Object[]{this, str, map});
            return;
        }
        map.put("Cookie", a.a(str));
        map.put(HttpRequest.HEADER_ACCEPT, "*/*");
        map.put("X-Requested-With", "com.taobao.taobao");
        StringBuilder sb = new StringBuilder();
        j.a();
        if (!StringUtils.isEmpty(j.commonConfig.aJ)) {
            j.a();
            sb.append(j.commonConfig.aJ);
        }
        String h = android.taobao.windvane.config.a.a().h();
        String i = android.taobao.windvane.config.a.a().i();
        if (!StringUtils.isEmpty(h) && !StringUtils.isEmpty(i)) {
            sb.append(" AliApp(");
            sb.append(h);
            sb.append("/");
            sb.append(i);
            sb.append(riy.BRACKET_END_STR);
        }
        if (!StringUtils.isEmpty(android.taobao.windvane.config.a.a().b())) {
            sb.append(" TTID/");
            sb.append(android.taobao.windvane.config.a.a().b());
        }
        sb.append(android.taobao.windvane.config.a.DEFAULT_UA);
        map.put(HttpConstant.USER_AGENT, sb.toString());
        map.put("Accept-Encoding", e.ACCEPTENCODING);
        map.put(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, "zh-CN,zh-CN;q=0.9,en-US;q=0.8");
    }

    public boolean hasPrefetchUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb020d13", new Object[]{this, str})).booleanValue() : mPrefetchNetwork.containsKey(p.e(str));
    }

    public WVPrefetchNetworkAdapter getPrefetchNetworkAdapter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVPrefetchNetworkAdapter) ipChange.ipc$dispatch("e640b03b", new Object[]{this, str}) : mPrefetchNetwork.get(p.e(str));
    }

    private Request formatAliRequest(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2, boolean z2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("5a4b0f59", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2), new Boolean(z2), str3});
        }
        try {
            RequestImpl requestImpl = new RequestImpl(str);
            requestImpl.setFollowRedirects(false);
            requestImpl.setBizId(str3);
            requestImpl.setRetryTime(retryTimes);
            requestImpl.setConnectTimeout(connectTimeout);
            requestImpl.setReadTimeout(readTimeout);
            requestImpl.setMethod(str2);
            if (map != null) {
                requestImpl.addHeader("f-refer", "wv_h5");
                UCNetworkDelegate.getInstance().onSendRequest(map, str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    requestImpl.addHeader(key, value);
                    m.b(TAG, "AliRequestAdapter from uc header key=" + key + ",value=" + value);
                }
            }
            return requestImpl;
        } catch (Exception e) {
            m.e(TAG, " AliRequestAdapter formatAliRequest Exception" + e.getMessage());
            return null;
        }
    }
}
