package com.taobao.alimama.cpm;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class CpmAdvertiseBundle implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "ads")
    public Map<String, CpmAdvertise> advertises;
    @JSONField(name = "cache_time_in_millis")
    public long cacheTimeInMillis;
    @JSONField(name = "time_stamp")
    public long timeStamp;
    @JSONField(name = "user_nick")
    public String userNick;

    static {
        kge.a(-1699024620);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    /* renamed from: clone */
    public CpmAdvertiseBundle m827clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmAdvertiseBundle) ipChange.ipc$dispatch("8dd1cc81", new Object[]{this});
        }
        try {
            CpmAdvertiseBundle cpmAdvertiseBundle = (CpmAdvertiseBundle) super.clone();
            cpmAdvertiseBundle.advertises = new HashMap();
            for (Map.Entry<String, CpmAdvertise> entry : this.advertises.entrySet()) {
                cpmAdvertiseBundle.advertises.put(entry.getKey(), entry.getValue().m826clone());
            }
            return cpmAdvertiseBundle;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
