package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10867a;
    public String b;
    public String c;
    public String d;
    public String e;
    public JSONObject f;
    public int g;
    public int h;

    static {
        kge.a(394103805);
    }

    public a(ComponentModel componentModel) {
        super(componentModel);
        this.g = Color.parseColor("#333333".trim());
        this.h = Color.parseColor("#ffffff");
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (this.s != null && this.s.mapping != null) {
            JSONObject jSONObject2 = this.s.mapping;
            try {
                this.c = jSONObject2.getString("icon");
                this.f10867a = jSONObject2.getString("title");
                this.b = jSONObject2.getString("text");
                this.d = jSONObject2.getString("jumpUrl");
                this.e = jSONObject2.getString("spm");
                this.f = jSONObject2.getJSONObject("utParams");
            } catch (Exception e) {
                com.taobao.android.detail.ttdetail.utils.i.a("CharityrViewModel", "fail to parse data", e);
            }
        }
        if (this.s == null || this.s.otherMapping == null) {
            return;
        }
        JSONObject jSONObject3 = this.s.otherMapping;
        try {
            String string = jSONObject3.getString("titleColor");
            String string2 = jSONObject3.getString("backgroundColor");
            this.g = Color.parseColor(string);
            this.h = Color.parseColor(string2);
        } catch (Exception e2) {
            com.taobao.android.detail.ttdetail.utils.i.a("CharityrViewModel", "fail to parse titleColor or backgroundColor", e2);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.f10867a) && StringUtils.isEmpty(this.b);
    }
}
