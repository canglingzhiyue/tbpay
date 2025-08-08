package com.alibaba.ut.abtest.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.k;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.djy;
import tb.kge;
import tb.nrh;

/* loaded from: classes3.dex */
public class UTABTestApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "WVUTABTestApi";
    private static final String TAG = "UTABTestApiPlugin";

    static {
        kge.a(68770267);
    }

    public static /* synthetic */ Object ipc$super(UTABTestApiPlugin uTABTestApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
        } catch (Exception e) {
            h.d(TAG, "WindVane Api " + str + " 执行错误！", e);
            b.a("UTABTestApiPlugin.execute", e);
            if (wVCallBackContext != null) {
                try {
                    wVCallBackContext.error();
                } catch (Throwable unused) {
                    b.a("UTABTestApiPlugin.execute.error", e);
                }
            }
        }
        if (StringUtils.equals(nrh.TYPE_ACTIVATE, str)) {
            activate(str2, wVCallBackContext);
            return true;
        } else if (StringUtils.equals("getVariations", str)) {
            getVariations(str2, wVCallBackContext);
            return true;
        } else if (StringUtils.equals(b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, str)) {
            activateServer(str2, wVCallBackContext);
            return true;
        } else if (StringUtils.equals("mockSwitches", str)) {
            mockSwitches(str2, wVCallBackContext);
            return true;
        } else {
            if (StringUtils.equals("isSwitchOpened", str)) {
                isSwitchOpened(str2, wVCallBackContext);
                return true;
            }
            return false;
        }
    }

    private void activate(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67059481", new Object[]{this, str, wVCallBackContext});
        } else {
            getVariations(1, str, wVCallBackContext);
        }
    }

    private void getVariations(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945be884", new Object[]{this, str, wVCallBackContext});
        } else {
            getVariations(2, str, wVCallBackContext);
        }
    }

    private void getVariations(int i, String str, WVCallBackContext wVCallBackContext) throws Exception {
        VariationSet variations;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cab3ed", new Object[]{this, new Integer(i), str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("component");
        String optString2 = jSONObject.optString("module");
        if (StringUtils.isEmpty(optString) || StringUtils.isEmpty(optString2)) {
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error(new WVApiResponse(1001).toJsonString());
            return;
        }
        if (i == 1) {
            variations = UTABTest.activate(optString, optString2);
        } else {
            variations = UTABTest.getVariations(optString, optString2);
        }
        HashMap hashMap = new HashMap();
        for (Variation variation : variations) {
            hashMap.put(variation.getName(), variation.getValue(null));
        }
        WVActivateApiResponseData wVActivateApiResponseData = new WVActivateApiResponseData();
        wVActivateApiResponseData.setExperimentBucketId(variations.getExperimentBucketId());
        wVActivateApiResponseData.setExperimentId(variations.getExperimentId());
        wVActivateApiResponseData.setExperimentReleaseId(variations.getExperimentReleaseId());
        wVActivateApiResponseData.setVariations(hashMap);
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(new WVApiResponse(wVActivateApiResponseData).toJsonString());
    }

    private void activateServer(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f485e4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        UTABTest.activateServer(new JSONObject(str).optString("server"));
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(new WVApiResponse().toJsonString());
    }

    private void mockSwitches(String str, WVCallBackContext wVCallBackContext) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848246da", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject(djy.SERIALIZE_EXP_VARIATIONS);
        Iterator<String> keys = jSONObject2.keys();
        JSONObject jSONObject3 = new JSONObject(k.b().a("ab_mock_switches", "{}"));
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        k.b().b("ab_mock_switches", jSONObject3.toString());
        r rVar = new r();
        rVar.a("data", jSONObject);
        rVar.a("msg", "mock success, please restart app");
        wVCallBackContext.success(rVar);
    }

    private void isSwitchOpened(String str, WVCallBackContext wVCallBackContext) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28bd95", new Object[]{this, str, wVCallBackContext});
            return;
        }
        String string = new JSONObject(str).getString("switchName");
        boolean isSwitchOpened = EVO.isSwitchOpened(wVCallBackContext.getWebview().getContext(), string);
        r rVar = new r();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(string, isSwitchOpened);
        rVar.a("data", jSONObject);
        wVCallBackContext.success(rVar);
    }
}
