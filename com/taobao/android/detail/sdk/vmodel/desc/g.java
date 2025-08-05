package com.taobao.android.detail.sdk.vmodel.desc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class g extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10370a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean s;

    static {
        kge.a(1699258715);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_DIVISION_TITLE;
    }

    public g(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.DivisionTitleViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.c = jSONObject.getString("text");
        this.f10370a = jSONObject.getString("titleColor");
        this.b = jSONObject.getString("lineColor");
        this.f = jSONObject.getString("linkText");
        this.g = jSONObject.getString("linkUrl");
        this.d = jSONObject.getString("backgroundColor");
        this.e = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        this.h = jSONObject.getString("paddingBottom");
        this.s = jSONObject.getBooleanValue("isHLine");
    }

    public g() {
        super(null);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.DivisionTitleViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.c);
    }
}
