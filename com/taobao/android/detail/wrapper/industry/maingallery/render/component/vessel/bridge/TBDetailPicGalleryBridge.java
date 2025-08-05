package com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.trade.event.f;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.ard;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class TBDetailPicGalleryBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_PICGALLERY = "getPicGallery";
    private static final String ACTION_OPEN_SKU = "openSKU";
    private static final String KEY_ITEM_ID = "itemId";
    private static final String KEY_ORIGINAL_URL = "originalURL";
    private static final String TAG = "TBDetailPicGalleryBridge";
    public static final String TOKEN_KEY_VO_NAME = "voName";
    public static final String sParamsKeyAsyncBridgeData = "asyncBridgeData";
    public static final String sParamsKeyBridgeData = "bridgeData";
    private static final Map<String, JSONObject> sParamsMap;

    public static /* synthetic */ Object ipc$super(TBDetailPicGalleryBridge tBDetailPicGalleryBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-253641944);
        sParamsMap = new HashMap();
        emu.a("com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.bridge.TBDetailPicGalleryBridge");
    }

    public static void registerParams(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51803256", new Object[]{str, jSONObject});
        } else if (str == null || jSONObject == null) {
            ard a2 = arc.a();
            a2.c(TAG, "setBridgeData", "token=" + str + ",params=" + jSONObject);
        } else {
            sParamsMap.put(str, jSONObject);
        }
    }

    public static void removeBridgeData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114111c8", new Object[]{str});
        } else if (str == null) {
            arc.a().c(TAG, "removeBridgeData", "token is null");
        } else {
            sParamsMap.remove(str);
        }
    }

    private JSONObject getDataFromParams(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1ed17e3", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(str)) == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.putAll(jSONObject2);
        return jSONObject3;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ce157e", new Object[]{this})).booleanValue();
        }
        if (!(getContext() instanceof DetailCoreActivity)) {
            return false;
        }
        f.a((DetailCoreActivity) getContext(), new OpenSkuEvent(SkuBottomBarStyleDTO.ADD_CART_AND_BUY));
        return true;
    }

    private boolean getPicGallery(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbd98430", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String str2 = null;
        try {
            str2 = ((JSONObject) JSONObject.parse(str)).getString(TOKEN_KEY_VO_NAME);
        } catch (Exception e) {
            arc.a().c("AliSDetailPicGalleryBridge", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, e.getMessage());
        }
        if (str2 == null) {
            str2 = "";
        }
        JSONObject jSONObject = sParamsMap.get(str2);
        if (jSONObject == null) {
            wVCallBackContext.error(new r("无法找到参数，请联系客户端和服务端"));
            ard a2 = arc.a();
            a2.c(TAG, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "找不到token【" + str2 + "】对应的数据");
            return false;
        }
        JSONObject dataFromParams = getDataFromParams(jSONObject, "bridgeData");
        if (dataFromParams == null) {
            wVCallBackContext.error(new r("无法找到bridgeData，请联系客户端和服务端"));
            ard a3 = arc.a();
            a3.c(TAG, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "找不到token【" + str2 + "】对应的 bridgeData 数据");
            return false;
        }
        JSONObject dataFromParams2 = getDataFromParams(jSONObject, "asyncBridgeData");
        if (dataFromParams2 != null) {
            dataFromParams.putAll(dataFromParams2);
        }
        wVCallBackContext.success(dataFromParams.toJSONString());
        return true;
    }
}
