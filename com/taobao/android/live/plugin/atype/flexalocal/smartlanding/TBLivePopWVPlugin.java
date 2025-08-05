package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;
import tb.kge;
import tb.psq;

/* loaded from: classes6.dex */
public class TBLivePopWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";

    static {
        kge.a(-391701644);
    }

    public static /* synthetic */ Object ipc$super(TBLivePopWVPlugin tBLivePopWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(TBLivePopWVPlugin tBLivePopWVPlugin, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f722a90", new Object[]{tBLivePopWVPlugin, str, str2, str3});
        } else {
            tBLivePopWVPlugin.trackUploadSmartLandingTask(str, str2, str3);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.taolivecontainer.jsbridge.a aVar = new com.taobao.taolivecontainer.jsbridge.a(str, str2, wVCallBackContext);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -421009492) {
            if (hashCode == 1697422195 && str.equals("popShowCallBack")) {
                c = 0;
            }
        } else if (str.equals("popCloseCallBack")) {
            c = 1;
        }
        if (c != 0) {
            if (c == 1) {
                Log.e("TBLivePopWVPlugin", "popCloseCallBack " + str2);
                aVar.a();
                return true;
            }
            aVar.a(NO_FUNCTION);
            return false;
        }
        Log.e("TBLivePopWVPlugin", "popShowCallBack " + str2);
        JSONObject b = psq.b(str2);
        JSONObject jSONObject = b != null ? b.getJSONObject("pop") : null;
        String str3 = "";
        final String string = jSONObject != null ? jSONObject.getString("popId") : str3;
        String string2 = jSONObject != null ? jSONObject.getString("scene") : str3;
        if (jSONObject != null) {
            str3 = jSONObject.getString("exParams");
        }
        if (!TextUtils.isEmpty(string)) {
            new com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.smartlanding.TBLivePopWVPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    Log.e("TBLivePopWVPlugin", "popShowCallBack onSuccess " + str2);
                    TBLivePopWVPlugin.access$000(TBLivePopWVPlugin.this, string, "success", str2);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        TBLivePopWVPlugin.access$000(TBLivePopWVPlugin.this, string, "error", str2);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }
            }).a(string, string2, str3);
        }
        aVar.a();
        return true;
    }

    private void trackUploadSmartLandingTask(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cddac64", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene_code", str);
        hashMap.put("link_node_key", "smartlanding_pop_show_callback");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str2);
        jSONObject.put("data", (Object) str3);
        hashMap.put("link_content", jSONObject.toJSONString());
        b.a(com.taobao.taolivecontainer.b.PAGE_TAOBAOLIVECONTAINER, "full_link_monitoring", hashMap);
    }
}
