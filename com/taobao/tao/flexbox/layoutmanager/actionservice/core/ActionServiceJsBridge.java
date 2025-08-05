package com.taobao.tao.flexbox.layoutmanager.actionservice.core;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;

/* loaded from: classes8.dex */
public class ActionServiceJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2076880122);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!str.equals("dispatch")) {
            return false;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject.getString("actionName").equals("$.init") && !(wVCallBackContext.getWebview() instanceof BackgroundWebview) && !(wVCallBackContext.getWebview() instanceof BackgroundUCWebview)) {
            return true;
        }
        dispatch(parseObject, wVCallBackContext);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.alibaba.fastjson.JSON] */
    public void dispatch(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106dd0cc", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        Object obj = jSONObject.get("args");
        JSONObject jSONObject2 = jSONObject.getJSONObject("context");
        if (obj instanceof JSON) {
            jSONArray = (JSON) obj;
        } else {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.add(obj);
            jSONArray = jSONArray2;
        }
        com.taobao.tao.flexbox.layoutmanager.actionservice.a a2 = com.taobao.tao.flexbox.layoutmanager.actionservice.a.a(wVCallBackContext.getWebview());
        if (a2 == null) {
            a.a(wVCallBackContext.getWebview().getContext());
            a2 = com.taobao.tao.flexbox.layoutmanager.actionservice.a.c();
        }
        a2.a(jSONObject.getString("actionName"), new a.b(wVCallBackContext.getWebview() == null ? null : wVCallBackContext.getWebview().getContext(), jSONObject2.getString("source")), (JSON) jSONArray, false, new a.InterfaceC0830a() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.core.ActionServiceJsBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.InterfaceC0830a
            public void a(a.b bVar, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("349f918d", new Object[]{this, bVar, obj2});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                if (obj2 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("data", obj2);
                    wVCallBackContext.success(jSONObject3.toJSONString());
                    return;
                }
                wVCallBackContext2.success();
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.InterfaceC0830a
            public void a(a.b bVar, a.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("81a090d9", new Object[]{this, bVar, cVar});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                if (cVar != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("errorCode", (Object) cVar.f19948a);
                    jSONObject3.put("errorMsg", (Object) ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
                    jSONObject3.put("result", cVar.c);
                    if (cVar.c instanceof JSONObject) {
                        JSONObject jSONObject4 = (JSONObject) cVar.c;
                        if (!TextUtils.isEmpty(jSONObject4.getString("errorCode"))) {
                            jSONObject3.put("errorCode", (Object) jSONObject4.getString("errorCode"));
                        }
                        if (!TextUtils.isEmpty(jSONObject4.getString("errorMsg"))) {
                            jSONObject3.put("errorMsg", (Object) jSONObject4.getString("errorMsg"));
                        }
                        if (jSONObject4.containsKey("result")) {
                            jSONObject3.put("result", jSONObject4.get("result"));
                        }
                    }
                    wVCallBackContext.error(jSONObject3.toJSONString());
                    return;
                }
                wVCallBackContext2.error();
            }
        });
    }
}
