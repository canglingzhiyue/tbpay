package com.taobao.android.detail.core.model.viewmodel.desc;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import tb.epf;
import tb.eph;
import tb.kge;

/* loaded from: classes4.dex */
public class l extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9760a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        kge.a(1193262263);
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.epf
    public eph b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eph) ipChange.ipc$dispatch("16b5e500", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.ServiceViewModel";
    }

    public l(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f9760a = jSONObject.getString("iconUrl");
        this.b = jSONObject.getString("title");
        this.c = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
        this.d = jSONObject.getString("tips");
        this.e = jSONObject.getString("jumpUrl");
    }
}
