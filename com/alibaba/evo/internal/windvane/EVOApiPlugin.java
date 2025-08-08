package com.alibaba.evo.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.windvane.WVActivateApiResponseData;
import com.alibaba.ut.abtest.internal.windvane.WVApiResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cex;
import tb.kge;
import tb.nrh;

/* loaded from: classes2.dex */
public class EVOApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "WVEvoApi";
    private static final String TAG = "EVOApiPlugin";

    static {
        kge.a(-536789132);
    }

    public static /* synthetic */ Object ipc$super(EVOApiPlugin eVOApiPlugin, String str, Object... objArr) {
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
            b.a("EVOApiPlugin.execute", e);
            if (wVCallBackContext != null) {
                try {
                    wVCallBackContext.success(new WVApiResponse(1000).toJsonString());
                } catch (Throwable th) {
                    b.a("EVOApiPlugin.execute.success", th);
                }
            }
        }
        if (StringUtils.equals(nrh.TYPE_ACTIVATE, str)) {
            activate(str2, wVCallBackContext);
            return true;
        } else if (StringUtils.equals(b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, str)) {
            activateServer(str2, wVCallBackContext);
            return true;
        } else {
            if (StringUtils.equals("getPageActivateTrackIds", str)) {
                getPageActivateTrackIds(str2, wVCallBackContext);
                return true;
            }
            return false;
        }
    }

    private void activate(String str, WVCallBackContext wVCallBackContext) throws Exception {
        HashMap hashMap;
        JSONArray names;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67059481", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str)) {
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
        } else {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("namespace");
            String optString2 = jSONObject.optString("key");
            if (StringUtils.isEmpty(optString) || StringUtils.isEmpty(optString2)) {
                if (wVCallBackContext == null) {
                    return;
                }
                wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
            if (optJSONObject == null || (names = optJSONObject.names()) == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    hashMap.put(string, optJSONObject.get(string));
                }
            }
            VariationSet activateSync = EVO.activateSync(optString, optString2, hashMap, this.mContext);
            HashMap hashMap2 = new HashMap();
            for (Variation variation : activateSync) {
                hashMap2.put(variation.getName(), variation.getValue(null));
            }
            WVActivateApiResponseData wVActivateApiResponseData = new WVActivateApiResponseData();
            if (activateSync.getExperimentBucketId() <= 0 && hashMap2.isEmpty()) {
                if (wVCallBackContext == null) {
                    return;
                }
                wVCallBackContext.success(new WVApiResponse(1000).toJsonString());
                return;
            }
            wVActivateApiResponseData.setExperimentBucketId(activateSync.getExperimentBucketId());
            wVActivateApiResponseData.setExperimentId(activateSync.getExperimentId());
            wVActivateApiResponseData.setExperimentReleaseId(activateSync.getExperimentReleaseId());
            wVActivateApiResponseData.setVariations(hashMap2);
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success(new WVApiResponse(wVActivateApiResponseData).toJsonString());
        }
    }

    private void activateServer(String str, WVCallBackContext wVCallBackContext) throws Exception {
        JSONArray names;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f485e4", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str)) {
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
        } else {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("data");
            if (StringUtils.isEmpty(optString)) {
                if (wVCallBackContext == null) {
                    return;
                }
                wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
                return;
            }
            HashMap hashMap = null;
            JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
            if (optJSONObject != null && (names = optJSONObject.names()) != null) {
                hashMap = new HashMap();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    hashMap.put(string, optJSONObject.get(string));
                }
            }
            EVO.activateServerSync(optString, hashMap, this.mContext);
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success(new WVApiResponse(0).toJsonString());
        }
    }

    private void getPageActivateTrackIds(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1e59b3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        String a2 = cex.a().k().a();
        HashMap hashMap = new HashMap();
        hashMap.put("trackIds", a2);
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(new WVApiResponse(hashMap).toJsonString());
    }
}
