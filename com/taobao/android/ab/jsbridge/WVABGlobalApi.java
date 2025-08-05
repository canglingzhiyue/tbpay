package com.taobao.android.ab.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.ab.api.a;
import com.taobao.android.ab.api.b;
import com.taobao.android.ab.api.c;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.djy;
import tb.dka;
import tb.dkf;
import tb.dkg;

/* loaded from: classes.dex */
public class WVABGlobalApi extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_VARIATIONS = "getVariations";
    private static final String ACTION_IS_FEATURE_OPENED = "isFeatureOpened";
    private static final String ACTION_MOCK_VALUES = "mockValues";
    private static final String JSON_KEY_VARIATION_NAME = "variationName";
    public static final String PLUGIN_NAME = "WVABGlobalApi";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_MOCK_VALUES.equals(str)) {
            return mockValues(str2, wVCallBackContext);
        }
        if (ACTION_GET_VARIATIONS.equals(str)) {
            return getVariations(str2, wVCallBackContext);
        }
        if (!ACTION_IS_FEATURE_OPENED.equals(str)) {
            return false;
        }
        return isFeatureOpened(str2, wVCallBackContext);
    }

    private static boolean isFeatureOpened(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe9ccb07", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            String string = new JSONObject(str).getString(JSON_KEY_VARIATION_NAME);
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(wVCallBackContext.getWebview().getContext(), string);
            r rVar = new r();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(string, isFeatureOpened);
            rVar.a("data", jSONObject);
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
        return true;
    }

    private static boolean getVariations(String str, WVCallBackContext wVCallBackContext) {
        JSONObject createSingleData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945be888", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean optBoolean = new JSONObject(str).optBoolean("debugging", false);
            r rVar = new r();
            if (optBoolean) {
                createSingleData = createComposedData(wVCallBackContext.getWebview().getContext(), true);
            } else {
                createSingleData = createSingleData(wVCallBackContext.getWebview().getContext());
            }
            rVar.a("data", createSingleData);
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
        return true;
    }

    private static JSONObject createComposedData(Context context, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d3cf3c39", new Object[]{context, new Boolean(z)}) : djy.a(a.b(context), new dka() { // from class: com.taobao.android.ab.jsbridge.WVABGlobalApi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dka
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
                }
                return false;
            }
        }, z);
    }

    private static JSONObject createSingleData(Context context) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1fe99721", new Object[]{context});
        }
        c a2 = ABGlobal.a(context);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<b> a3 = a2.a();
        while (a3.hasNext()) {
            b next = a3.next();
            jSONObject3.put(next.a(), next.b());
        }
        jSONObject2.put(djy.SERIALIZE_EXP_VARIATIONS, jSONObject3);
        jSONObject.put("variationSet", jSONObject2);
        return jSONObject;
    }

    private static boolean mockValues(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd140f9e", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject(djy.SERIALIZE_EXP_VARIATIONS);
            dkf a2 = dkg.a();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.a(wVCallBackContext.getWebview().getContext(), next, jSONObject2.getBoolean(next));
            }
            r rVar = new r();
            rVar.a("data", jSONObject);
            rVar.a("msg", "mock success, please restart app");
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
        return true;
    }
}
