package com.taobao.share.ui.engine.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareBusiness;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.nyy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_STATE_EVENT = "dataStateEvent";
    public static final JSONObject EMPTY_EVENT;
    public static final String GET_CONTACTS_INFO_EVENT = "TBWeexShare.getContactsInfo";
    public static final String HIDE_BUBBLE_EVENT = "hideBubbleEvent";
    public static final String REGISTER_SHARE_LISTENER_EVENT = "TBWeexShare.registerWeexShareListener";
    public static final String SHARE_CONTENT_KEY = "shareContent";
    public static final String SHARE_UT_ARGS_EVENT = "shareUTArgs";
    public static final String SHOW_BUBBLE_EVENT = "showBubbleEvent";
    public static final String SHOW_COVER_EVENT = "showGuideEvent";
    public static final String SHOW_GIFT_EVENT = "shareGiftEvent";
    public static final String SHOW_TIPS_EVENT = "showTipsEvent";

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f19677a;
    private ConcurrentHashMap<String, JSONObject> b;

    /* renamed from: com.taobao.share.ui.engine.jsbridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0814a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f19678a;

        static {
            kge.a(-1346535590);
            f19678a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a06ed9c0", new Object[0]) : f19678a;
        }
    }

    static {
        kge.a(-1348877177);
        EMPTY_EVENT = new JSONObject();
    }

    private a() {
        this.b = new ConcurrentHashMap<>();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a06ed9c0", new Object[0]) : C0814a.a();
    }

    public void a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
            return;
        }
        this.f19677a = wVCallBackContext;
        try {
            if (this.f19677a != null && this.b.size() > 0) {
                for (Map.Entry<String, JSONObject> entry : this.b.entrySet()) {
                    String str = "";
                    this.f19677a.fireEvent(entry.getKey(), entry.getValue() == null ? str : entry.getValue().toJSONString());
                    StringBuilder sb = new StringBuilder();
                    sb.append("fireEvent wvCallbackContext not null, fire cache eventName: ");
                    sb.append(entry.getKey());
                    sb.append(", eventParam: ");
                    if (entry.getValue() != null) {
                        str = entry.getValue().toJSONString();
                    }
                    sb.append(str);
                    nyy.b("EventCenter", sb.toString());
                    if (REGISTER_SHARE_LISTENER_EVENT.equals(entry.getKey())) {
                        ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_PULL_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
                        a().b();
                    }
                }
            }
        } catch (Exception e) {
            nyy.b("EventCenter", "fireEvent wvCallbackContext not null, fire cache event err: " + e.getMessage());
            e.printStackTrace();
        } finally {
            this.b.clear();
            nyy.b("EventCenter", "fireEvent wvCallbackContext not null, fire cache event finally: clear");
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f19677a;
        if (wVCallBackContext != null) {
            String str2 = "";
            wVCallBackContext.fireEvent(str, jSONObject == null ? str2 : jSONObject.toJSONString());
            StringBuilder sb = new StringBuilder();
            sb.append("fireEvent wvCallbackContext not null, fire eventName: ");
            sb.append(str);
            sb.append(", eventParam: ");
            if (jSONObject != null) {
                str2 = jSONObject.toJSONString();
            }
            sb.append(str2);
            nyy.b("EventCenter", sb.toString());
            return;
        }
        this.b.put(str, jSONObject);
        nyy.b("EventCenter", "fireEvent wvCallbackContext null, cache eventName: " + str);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        r rVar = new r();
        rVar.a(SHARE_CONTENT_KEY, jSONObject.toJSONString());
        WVCallBackContext wVCallBackContext = this.f19677a;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(rVar);
        nyy.b("EventCenter", "callback wvCallbackContext not null, data: " + rVar.d());
        ShareBusiness.sShareUTArgs.put(ShareBusiness.NATIVE_PUSH_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        a().b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.BIZ_CONFIG_END_KEY) || !ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.CC_LIST_END_KEY) || !ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.WEEX_RENDER_END_KEY) || !ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.WEEX_LOAD_END_KEY)) {
        } else {
            if (!ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.NATIVE_PUSH_KEY) && !ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.WEEX_PULL_KEY)) {
                return;
            }
            a("shareUTArgs", ShareBusiness.sShareUTArgs);
            nyy.c("TIMECOST", "total time: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime) + ", detail: " + ShareBusiness.sShareUTArgs.toJSONString());
        }
    }
}
