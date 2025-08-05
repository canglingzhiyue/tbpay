package com.taobao.android.detail.core.model.viewmodel.desc;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class n extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1388375636);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.SplitableContainerModel";
    }

    public n(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public String E_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this});
        }
        if (this.A.size() > 0) {
            return this.u + "_" + this.A.get(0).u + "_" + this.A.size();
        }
        return this.u;
    }
}
