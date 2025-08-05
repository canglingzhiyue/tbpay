package com.taobao.android.detail.core.detail.popup;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AsyncRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API = "api";
    public static final String PARAMS = "params";
    public static final String TRADE_UNIT = "tradeUnit";
    public static final String VERSION = "version";
    private String api;
    private boolean isTradeUnit;
    private boolean isValid;
    private JSONObject params;
    private String version;

    static {
        kge.a(22491669);
        kge.a(-1214933880);
    }

    public AsyncRequestParams(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            return;
        }
        this.api = jSONObject.getString("api");
        this.version = jSONObject.getString("version");
        if (TextUtils.isEmpty(this.api) || TextUtils.isEmpty(this.version)) {
            return;
        }
        this.isTradeUnit = jSONObject.getBooleanValue(TRADE_UNIT);
        this.params = jSONObject.getJSONObject("params");
        this.isValid = true;
        emu.a("com.taobao.android.detail.core.detail.popup.AsyncRequestParams");
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.isValid;
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.api;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public boolean isTradeUnit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a680489", new Object[]{this})).booleanValue() : this.isTradeUnit;
    }

    public JSONObject getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this}) : this.params;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        if (this.params == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.putAll((Map) JSONObject.toJavaObject(this.params, Map.class));
        return hashMap;
    }
}
