package com.tmall.android.dai.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.jsbridge.a;
import com.tmall.android.dai.internal.jsbridge.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class WVDaiApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SERVER_NAME = "WVDAIHandler";
    public static final int STATUS_CODE_FAILURE = 0;
    public static final int STATUS_CODE_SUCCESS = 1;
    private static final String TAG = "WVDaiApiPlugin";

    static {
        kge.a(-648080085);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : b.a(str, str2, new a() { // from class: com.tmall.android.dai.internal.windvane.WVDaiApiPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.tmall.android.dai.internal.jsbridge.a
            public void a(boolean z, HashMap<String, Object> hashMap, Map<String, Object> map, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8cff428", new Object[]{this, new Boolean(z), hashMap, map, str3});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.error(WVDaiApiPlugin.newWVResult(z, hashMap, map, str3));
            }

            @Override // com.tmall.android.dai.internal.jsbridge.a
            public void b(boolean z, HashMap<String, Object> hashMap, Map<String, Object> map, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("35bd0b47", new Object[]{this, new Boolean(z), hashMap, map, str3});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.success(WVDaiApiPlugin.newWVResult(z, hashMap, map, str3));
            }
        });
    }

    public static r newWVResult(boolean z, HashMap<String, Object> hashMap, Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("25f53a9f", new Object[]{new Boolean(z), hashMap, map, str});
        }
        r rVar = new r();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            i = 0;
        }
        try {
            jSONObject.put("code", i);
            if (hashMap != null) {
                jSONObject.put("model", new JSONObject(hashMap));
            }
            if (map != null) {
                jSONObject.put("result", new JSONObject(map));
            }
            if (!StringUtils.isEmpty(str)) {
                jSONObject.put("msg", str);
            }
        } catch (Exception e) {
            com.taobao.mrt.utils.a.b(TAG, e.getMessage(), e);
        }
        rVar.a(jSONObject);
        return rVar;
    }
}
