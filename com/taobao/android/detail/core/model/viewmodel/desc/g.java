package com.taobao.android.detail.core.model.viewmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.eby;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class g extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9752a;
    public int b;
    public String c;

    static {
        kge.a(1046314986);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.PicContainerModel";
    }

    public g(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.c = jSONObject.getString(eby.KEY_PIC_URL);
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            this.b = jSONObject2.getIntValue("height");
            this.f9752a = jSONObject2.getIntValue("width");
        }
        if (this.b > 0 && this.f9752a > 0) {
            return;
        }
        this.b = 1;
        this.f9752a = 1;
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.c);
    }

    @Override // tb.epf
    public String E_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this});
        }
        if (this.A.size() > 0) {
            return this.s + "";
        }
        return this.u;
    }

    public g(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
    }
}
