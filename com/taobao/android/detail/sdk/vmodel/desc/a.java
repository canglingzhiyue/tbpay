package com.taobao.android.detail.sdk.vmodel.desc;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10358a;
    public String b;
    public String c;
    public String d;
    public String e;
    public JSONObject f;
    public int g;
    public int h;

    static {
        kge.a(-1853405624);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_DESC_CHARITY;
    }

    public a(ComponentModel componentModel) {
        super(componentModel);
        this.g = Color.parseColor("#333333".trim());
        this.h = Color.parseColor("#ffffff");
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.CharityrViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (this.component != null && this.component.mapping != null) {
            JSONObject jSONObject2 = this.component.mapping;
            try {
                this.c = jSONObject2.getString("icon");
                this.f10358a = jSONObject2.getString("title");
                this.b = jSONObject2.getString("text");
                this.d = jSONObject2.getString("jumpUrl");
                this.e = jSONObject2.getString("spm");
                this.f = jSONObject2.getJSONObject("utParams");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.component == null || this.component.otherMapping == null) {
            return;
        }
        JSONObject jSONObject3 = this.component.otherMapping;
        try {
            String string = jSONObject3.getString("titleColor");
            String string2 = jSONObject3.getString("backgroundColor");
            this.g = Color.parseColor(string);
            this.h = Color.parseColor(string2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f10358a) && TextUtils.isEmpty(this.b);
    }
}
