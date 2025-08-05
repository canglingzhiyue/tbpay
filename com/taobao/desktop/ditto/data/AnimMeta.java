package com.taobao.desktop.ditto.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class AnimMeta implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String animId;
    private JSONObject renderProp;

    static {
        kge.a(2082603536);
        kge.a(1028243835);
    }

    public String getAnimId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9d2b637", new Object[]{this}) : this.animId;
    }

    public void setAnimId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02dfe1f", new Object[]{this, str});
        } else {
            this.animId = str;
        }
    }

    public JSONObject getRenderProp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a1d60e36", new Object[]{this}) : this.renderProp;
    }

    public void setRenderProp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf7040e", new Object[]{this, jSONObject});
        } else {
            this.renderProp = jSONObject;
        }
    }
}
