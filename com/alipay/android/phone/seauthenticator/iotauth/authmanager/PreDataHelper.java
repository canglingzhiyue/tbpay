package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PreDataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FAILURE = -1;
    public static final int SUCCESS = 0;
    private static Map<String, String> f;
    private static PreDataHelper g;

    /* renamed from: a  reason: collision with root package name */
    private String f5135a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public static PreDataHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreDataHelper) ipChange.ipc$dispatch("7e17cee1", new Object[0]);
        }
        if (g == null) {
            g = new PreDataHelper();
        }
        return g;
    }

    public int initData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e007bde", new Object[]{this, str})).intValue();
        }
        a();
        return a(str);
    }

    public int initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1ae4854", new Object[]{this})).intValue();
        }
        a();
        return 0;
    }

    public int initClientText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbfff14c", new Object[]{this, str})).intValue();
        }
        a();
        if (!TextUtils.isEmpty(str)) {
            f = b(str);
        }
        return 0;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f = null;
        this.c = null;
        this.b = null;
        this.f5135a = null;
        this.d = 0;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        AuthenticatorLOG.fpInfo(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(DataHelper.FP_CHALLENGE_KEY)) {
                this.f5135a = jSONObject.getString(DataHelper.FP_CHALLENGE_KEY);
            } else if (jSONObject.has("renderData")) {
                this.f5135a = jSONObject.getString("renderData");
            } else {
                TrackEvent.getIns().addMonitorKey("predata", "renderData is null");
                return -1;
            }
            if (jSONObject.has("uiType")) {
                this.e = jSONObject.getInt("uiType");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("bioData");
            if (jSONObject2.has(Constants.VI_ENGINE_VERIFYID)) {
                this.b = jSONObject2.getString(Constants.VI_ENGINE_VERIFYID);
            }
            if (jSONObject2.has("token")) {
                this.c = jSONObject2.getString("token");
            }
            this.d = jSONObject2.getInt(aw.PARAM_PRODUCT_TYPE);
            JSONObject jSONObject3 = null;
            JSONObject jSONObject4 = jSONObject2.has("clientTexts") ? jSONObject2.getJSONObject("clientTexts") : null;
            if (jSONObject.has("micClientTexts")) {
                jSONObject3 = jSONObject.getJSONObject("micClientTexts");
            }
            f = a(jSONObject4, jSONObject3);
            return 0;
        } catch (JSONException e) {
            TrackEvent.getIns().addMonitorKey("predata", "Failed to parse predata");
            AuthenticatorLOG.fpInfo(e);
            return -1;
        }
    }

    private HashMap<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("30adc416", new Object[]{this, str});
        }
        AuthenticatorLOG.fpInfo("clientTestJsonStr: " + str);
        HashMap<String, String> hashMap = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                hashMap = (HashMap) JSON.parseObject(str, HashMap.class);
            }
        } catch (Exception unused) {
        }
        if (hashMap == null) {
            TrackEvent.getIns().addMonitorKey("predata", "clientTextError");
        }
        return hashMap;
    }

    private Map<String, String> a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3d3795d", new Object[]{this, jSONObject, jSONObject2});
        }
        HashMap<String, String> hashMap = null;
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        HashMap<String, String> b = jSONObject2 != null ? b(jSONObject2.toString()) : null;
        if (jSONObject != null) {
            hashMap = b(jSONObject.toString());
        }
        if (b == null || hashMap == null) {
            return b == null ? hashMap : b;
        }
        for (Map.Entry<String, String> entry : b.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public String getClientText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b8642e1", new Object[]{this, str});
        }
        Map<String, String> map = f;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public String getRenderData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("140b7e63", new Object[]{this}) : this.f5135a;
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.c;
    }

    public int getProductType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4bf8a8d", new Object[]{this})).intValue() : this.d;
    }

    public String getVerifyId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8b1b04f", new Object[]{this}) : this.b;
    }

    public int getUiType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f5b3d5e", new Object[]{this})).intValue() : this.e;
    }

    public void setUiType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4272566c", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }
}
