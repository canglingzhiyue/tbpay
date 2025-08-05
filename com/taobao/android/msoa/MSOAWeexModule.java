package com.taobao.android.msoa;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.util.b;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MSOAWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSOA_WEEX_MODULE_NAME = "MSOA";

    @WXModuleAnno
    public void requestService(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2de141", new Object[]{this, str, str2});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", "msoa_error_invalid_param");
            hashMap.put("errorMsg", "invalid parameter");
            hashMap.put("isMSOAFail", true);
            if (this.mWXSDKInstance == null) {
                return;
            }
            WXSDKEngine.callback(this.mWXSDKInstance.N(), str2, hashMap);
            return;
        }
        String string = parseObject.getString("serviceId");
        String string2 = parseObject.getString("version");
        String string3 = parseObject.getString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName);
        JSONObject parseObject2 = JSON.parseObject(parseObject.getString("params"));
        HashMap hashMap2 = null;
        if (parseObject2 != null) {
            hashMap2 = new HashMap();
            for (Map.Entry<String, Object> entry : parseObject2.entrySet()) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap2.put("MSOA_START_UPTIME", Long.valueOf(System.currentTimeMillis()));
        b.a a2 = b.a(string, string2, hashMap2);
        String str3 = a2.f14446a;
        Map<String, Object> a3 = b.a(a2.b, parseObject);
        b.a(string, a3, this.mWXSDKInstance);
        c.a().a(new g(string, str3, "msoa.taobao.privilege.weex", string3, a3, MSOAServiceDefinition.Platform.WEEX.value()), new MSOAServiceListener() { // from class: com.taobao.android.msoa.MSOAWeexModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("data", new JSONObject(map).toJSONString());
                if (MSOAWeexModule.this.mWXSDKInstance == null) {
                    return;
                }
                WXSDKEngine.callback(MSOAWeexModule.this.mWXSDKInstance.N(), str2, hashMap3);
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str4, String str5, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str4, str5, new Boolean(z), map});
                    return;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("errorCode", str4);
                hashMap3.put("errorMsg", str5);
                hashMap3.put("isMSOAFail", Boolean.valueOf(z));
                if (MSOAWeexModule.this.mWXSDKInstance == null) {
                    return;
                }
                WXSDKEngine.callback(MSOAWeexModule.this.mWXSDKInstance.N(), str2, hashMap3);
            }
        });
    }
}
