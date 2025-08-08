package com.taobao.themis.ability_taobao;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.a;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.i;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class TMSUserTrackerBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1357320494);
        kge.a(-86622547);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void handleLoggingAction(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c937fd", new Object[]{this, apiContext, jSONObject, bridgeCallback});
            return;
        }
        TMSLogger.b("TMSUserTracker", "handleLoggingAction invoke params : " + jSONObject);
        if (jSONObject == null || jSONObject.isEmpty()) {
            TMSLogger.c("TMSUserTracker", "invalid params " + jSONObject);
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "params is null"));
            }
        }
        a(apiContext.d(), jSONObject, bridgeCallback);
    }

    private void a(ITMSPage iTMSPage, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7807345f", new Object[]{this, iTMSPage, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "type");
        String a3 = i.a(jSONObject, "subType");
        Map<String, Object> a4 = i.a(i.a(jSONObject, AgooConstants.MESSAGE_EXT, new JSONObject()), new HashMap());
        if (!"behavior".equals(a2)) {
            if (bridgeCallback == null) {
                return;
            }
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "type invalid"));
        } else if (!a(iTMSPage, a3, a4) || bridgeCallback == null) {
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    private boolean a(ITMSPage iTMSPage, String str, Map<String, Object> map) {
        Activity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2efe0cc", new Object[]{this, iTMSPage, str, map})).booleanValue();
        }
        if (iTMSPage == null || (o = iTMSPage.b().o()) == null || StringUtils.isEmpty(str)) {
            return false;
        }
        if ("updatePageName".equals(str)) {
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).updatePageName(o, map.get("pageName").toString());
            return true;
        } else if (m.UPDATE_PAGEURL.equals(str)) {
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).updatePageUrl(o, map.get("pageUrl").toString());
            return true;
        } else if (m.UPDATE_PAGE_PROPERTIES.equals(str)) {
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).updatePageProperties(o, a(map));
            return true;
        } else if (m.UPDATE_NEXT_PAGE_PROPERTIES.equals(str)) {
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).updateNextPageProperties(a(map));
            return true;
        } else if (m.UPDATE_PAGE_UTPARAM.equals(str)) {
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).updatePageUtParam(o, b(map));
            return true;
        } else if ("updateNextPageUtparam".equals(str)) {
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).updateNextPageUtParam(b(map));
            return true;
        } else if (!m.CUSTOM_ADVANCE.equals(str)) {
            return false;
        } else {
            String str2 = (String) map.get("eventId");
            String str3 = (String) map.get("pageName");
            String str4 = (String) map.get("arg1");
            String str5 = (String) map.get("arg2");
            String str6 = (String) map.get("arg3");
            Map<String, String> a2 = i.a((JSONObject) map.get("args"), new HashMap());
            if (iTMSPage.b() != null) {
                try {
                    String h = iTMSPage.b().h();
                    if (StringUtils.isEmpty(h)) {
                        a2.put("miniapp_id", h);
                    }
                } catch (Exception e) {
                    TMSLogger.d("CUSTOM_ADVANCE add common args error", e.getMessage());
                }
            }
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).customAdvance(str2, str3, str4, str5, str6, a2);
            return true;
        }
    }

    private HashMap<String, String> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a289da40", new Object[]{this, map});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            hashMap.put(str, obj != null ? obj.toString() : "");
        }
        return hashMap;
    }

    private JSONObject b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6501a39c", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            jSONObject.put(str, (Object) (obj != null ? obj.toString() : ""));
        }
        return jSONObject;
    }
}
