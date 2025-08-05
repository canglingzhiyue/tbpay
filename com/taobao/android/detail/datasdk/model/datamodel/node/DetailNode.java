package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class DetailNode implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject data;

    static {
        kge.a(1878568096);
        kge.a(1028243835);
    }

    public DetailNode() {
    }

    public DetailNode(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.data = jSONObject;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }
}
