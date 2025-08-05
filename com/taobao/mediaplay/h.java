package com.taobao.mediaplay;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile HashMap<String, JSONObject> f18022a;

    static {
        kge.a(1868672054);
    }

    public static synchronized void a(String str, JSONObject jSONObject) {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3502d8cc", new Object[]{str, jSONObject});
                return;
            }
            try {
                if (f18022a == null) {
                    f18022a = new HashMap<>();
                }
                f18022a.put(str, jSONObject);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "update the pcresult cache with videoid=" + str + ", size of cache=" + f18022a.size());
            } catch (Exception e) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updatePlayControlInfo error:" + e.toString());
            }
        }
    }

    public static synchronized JSONObject a(String str) {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2f58b020", new Object[]{str});
            } else if (f18022a == null) {
                return null;
            } else {
                JSONObject jSONObject = f18022a.get(str);
                StringBuilder sb = new StringBuilder();
                sb.append("get the pcresult cache with videoid=");
                sb.append(str);
                sb.append(", result=");
                if (jSONObject != null) {
                    z = true;
                }
                sb.append(z);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
                return jSONObject;
            }
        }
    }
}
