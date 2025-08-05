package com.alibaba.triver.triver_shop.adapter;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.triver.kit.api.monitor.IPerformanceAndErrorTracker;
import com.alibaba.triver.prefetch.http.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IHttpCacheAdapter;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MINIAPP_ORI_URL_KEY = "miniapp_ori_url";

    /* renamed from: a  reason: collision with root package name */
    private static IHttpCacheAdapter f3682a;

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : c(str);
    }

    public static /* synthetic */ boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : d(str);
    }

    static {
        kge.a(1471437502);
        f3682a = new IHttpCacheAdapter() { // from class: com.alibaba.triver.triver_shop.adapter.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.adapter.IHttpCacheAdapter
            public void setHttpCacheData(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("788a3207", new Object[]{this, str, str2, str3});
                    return;
                }
                if (c.a(str2)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    a.b.a(str2, str3, true);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    ((IPerformanceAndErrorTracker) RVProxy.get(IPerformanceAndErrorTracker.class)).sendPerfStageLog("PageDataAdapter", "time cost = " + currentTimeMillis2 + " save page data , url = " + str2);
                }
                if (!c.b(str) || !com.alibaba.triver.prefetch.http.a.a(str2)) {
                    return;
                }
                a.b.a(str2, str3, true);
            }

            @Override // com.taobao.weex.adapter.IHttpCacheAdapter
            public String getHttpCacheData(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("70359cb7", new Object[]{this, str, str2});
                }
                if (c.a(str2)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = a.b.a(str2, true);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (a2 != null) {
                        ((IPerformanceAndErrorTracker) RVProxy.get(IPerformanceAndErrorTracker.class)).sendPerfStageLog("PageDataAdapter", "time cost = " + currentTimeMillis2 + " get page data , url = " + str2);
                    }
                    return a2;
                } else if (c.b(str) && com.alibaba.triver.prefetch.http.a.a(str2)) {
                    return a.b.a(str2, true);
                } else {
                    return null;
                }
            }
        };
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return str.endsWith("index.weex.js") || str.endsWith("index.weex.cmd.js");
    }

    public static IHttpCacheAdapter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHttpCacheAdapter) ipChange.ipc$dispatch("d0db0756", new Object[0]) : f3682a;
    }

    private static boolean d(String str) {
        WXSDKInstance e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (str == null || (e = e(str)) == null) {
            return false;
        }
        Object obj = e.ar().b.get(MINIAPP_ORI_URL_KEY);
        if (!(obj instanceof String)) {
            return false;
        }
        return ((String) obj).contains("fastMode");
    }

    private static WXSDKInstance e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("f737db94", new Object[]{str});
        }
        try {
            return WXSDKManager.getInstance().getAllInstanceMap().get(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
