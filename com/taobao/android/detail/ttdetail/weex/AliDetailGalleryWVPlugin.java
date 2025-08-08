package com.taobao.android.detail.ttdetail.weex;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.sdc;

/* loaded from: classes5.dex */
public class AliDetailGalleryWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_PICGALLERY = "getPicGallery";
    private static final String ACTION_OPEN_SKU = "openSKU";
    private static final String KEY_COMPONENT_ID = "voName";
    public static final String KEY_PARAMS_ASYNC_BRIDGE_DATA = "asyncBridgeData";
    public static final String KEY_PARAMS_BRIDGE_DATA = "bridgeData";
    private static final String MODULE_NAME = "NewPicGalleryBridge";
    private static final String TAG = "AliDetailGalleryBridge";
    private static final Map<String, JSONObject> s_Params_Map;

    public static /* synthetic */ Object ipc$super(AliDetailGalleryWVPlugin aliDetailGalleryWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1669740528);
        s_Params_Map = new ConcurrentHashMap();
    }

    public static boolean registerCurrentModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4ab6ed", new Object[0])).booleanValue();
        }
        try {
            q.a(MODULE_NAME, (Class<? extends e>) AliDetailGalleryWVPlugin.class);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void registerComponentParams(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279ffebf", new Object[]{str, jSONObject});
        } else if (str == null || jSONObject == null) {
        } else {
            s_Params_Map.put(str, jSONObject);
        }
    }

    public static void removeComponentParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3b0910", new Object[]{str});
        } else if (str == null) {
        } else {
            s_Params_Map.remove(str);
        }
    }

    private JSONObject getDataFromParams(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1ed17e3", new Object[]{this, jSONObject, str});
        }
        if (jSONObject != null && !StringUtils.isEmpty(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("openSKU".equalsIgnoreCase(str)) {
            return openSku();
        }
        if (ACTION_GET_PICGALLERY.equalsIgnoreCase(str) && wVCallBackContext != null) {
            return getPicGallery(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean openSku() {
        Context context = getContext();
        if ((context instanceof sdc) && ((sdc) context).a()) {
            c.a(context, new h("openSKU", new JSONObject(), new RuntimeAbilityParam[0]));
            return true;
        }
        try {
            f.a(context, (Event) Class.forName("com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent").getConstructor(new Class[0]).newInstance(new Object[0]));
            return true;
        } catch (Throwable th) {
            i.a(TAG, "openSku error", th);
            return false;
        }
    }

    private boolean getPicGallery(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbd98430", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            String string = JSONObject.parseObject(str).getString("voName");
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("voName is empty");
                return false;
            }
            JSONObject jSONObject = s_Params_Map.get(string);
            if (jSONObject == null) {
                wVCallBackContext.error("voName not put data");
                return false;
            }
            JSONObject dataFromParams = getDataFromParams(jSONObject, "bridgeData");
            if (dataFromParams == null) {
                wVCallBackContext.error("voNamecan not find bridgeData");
                return false;
            }
            JSONObject dataFromParams2 = getDataFromParams(jSONObject, "asyncBridgeData");
            if (dataFromParams2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putAll(dataFromParams);
                jSONObject2.putAll(dataFromParams2);
                dataFromParams = jSONObject2;
            }
            wVCallBackContext.success(dataFromParams.toJSONString());
            return true;
        } catch (Throwable th) {
            i.a(TAG, "getPicGallery error:", th);
            wVCallBackContext.error("unknown exception");
            return false;
        }
    }
}
