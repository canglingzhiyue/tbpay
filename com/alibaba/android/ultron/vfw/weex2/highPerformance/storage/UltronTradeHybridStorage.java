package com.alibaba.android.ultron.vfw.weex2.highPerformance.storage;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cew;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronTradeHybridStorage extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mExpireDuration;
    private long mGenerateTimestamp;
    private String mKey;

    static {
        kge.a(1865326468);
    }

    public UltronTradeHybridStorage(String str, JSONObject jSONObject, long j) {
        this.mKey = "";
        this.mExpireDuration = cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
        this.mGenerateTimestamp = 0L;
        this.mKey = str;
        this.mExpireDuration = j;
        this.mGenerateTimestamp = System.currentTimeMillis();
        if (jSONObject != null) {
            putAll(jSONObject);
        }
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.mKey;
    }

    public boolean isExpired() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue() : System.currentTimeMillis() - this.mGenerateTimestamp > this.mExpireDuration;
    }

    public void update(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90396420", new Object[]{this, jSONObject});
            return;
        }
        clear();
        if (jSONObject != null) {
            putAll(jSONObject);
        }
        this.mGenerateTimestamp = System.currentTimeMillis();
    }

    public void update(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f396a4", new Object[]{this, jSONObject, new Long(j)});
            return;
        }
        update(jSONObject);
        this.mExpireDuration = j;
    }
}
