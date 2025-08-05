package com.taobao.taolive.sdk.configurable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ITaoLiveComponentConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject bizData;
    public List<ITaoLiveComponentConfig> cList;
    public String cName;
    public Boolean entranceHidden;
    public String objName;

    static {
        kge.a(1211717165);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = null;
        try {
            str = JSON.toJSONString(this.bizData);
        } catch (Throwable unused) {
        }
        return "ITaoLiveComponentConfig{cName = '" + this.cName + "', bizData = " + str + ", entranceHidden = " + this.entranceHidden + '}';
    }
}
