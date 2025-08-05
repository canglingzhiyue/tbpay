package com.taobao.mrt.openapi;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.e;
import com.taobao.mrt.f;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class MRTOpenApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OpenApiTask";
    private static MRTOpenApi mInstance;

    public static boolean isServiceAllowed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350103d2", new Object[]{str})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-1944543853);
        mInstance = new MRTOpenApi();
    }

    private MRTOpenApi() {
    }

    public static MRTOpenApi getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MRTOpenApi) ipChange.ipc$dispatch("83532c10", new Object[0]) : mInstance;
    }

    public static boolean findService(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cfb37c51", new Object[]{str})).booleanValue() : f.a().a(str) != null;
    }

    public static Map<String, Object> python_api(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18e22ee8", new Object[]{str, str2, map});
        }
        e a2 = f.a().a(str);
        if (a2 != null) {
            return a2.a(str2, map);
        }
        return null;
    }
}
