package com.taobao.tbliveinteractive.view.right_component;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class InteractiveComponentRightAnim implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String additionalAnimation;
    public String name;
    public JSONObject params;
    public String dxTemplate = "interact_entrance_animation";
    public String animationType = "lottery";
    public int stayDuration = 1000;
    public int apngStayDuration = 1000;
    public int dxDisAppearDuration = 200;

    static {
        kge.a(400904557);
        kge.a(-540945145);
    }

    public JSONObject parseJsonComponentRightAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("35f8c192", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) this.name);
        jSONObject.put("dxTemplate", (Object) this.dxTemplate);
        jSONObject.put("params", (Object) this.params);
        jSONObject.put("additionalAnimation", (Object) this.additionalAnimation);
        jSONObject.put("animationType", (Object) this.animationType);
        jSONObject.put("stayDuration", (Object) Integer.valueOf(this.stayDuration));
        jSONObject.put("apngStayDuration", (Object) Integer.valueOf(this.apngStayDuration));
        jSONObject.put("dxDisAppearDuration", (Object) Integer.valueOf(this.dxDisAppearDuration));
        return jSONObject;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "InteractiveComponentRightAnim{name='" + this.name + "', dxTemplate='" + this.dxTemplate + "', params='" + this.params + "', additionalAnimation='" + this.additionalAnimation + "', animationType='" + this.animationType + "', stayDuration=" + this.stayDuration + "', apngStayDuration=" + this.apngStayDuration + "', dxDisAppearDuration=" + this.dxDisAppearDuration + '}';
    }
}
