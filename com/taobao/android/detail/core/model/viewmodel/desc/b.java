package com.taobao.android.detail.core.model.viewmodel.desc;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import tb.epf;
import tb.eph;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9744a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    public int h;

    static {
        kge.a(131141408);
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.FullTextViewModel";
    }

    public b(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f9744a = jSONObject.getString("textColor");
        this.b = jSONObject.getString("text");
        this.c = jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR);
        this.d = jSONObject.getString("fontName");
        this.g = jSONObject.getBoolean("hasDoubleLine").booleanValue();
        this.h = jSONObject.getInteger("textHeight").intValue();
        int i = this.h;
        if (i > 0) {
            this.h = epo.b(i);
        }
        if (jSONObject.containsKey("alignment")) {
            try {
                this.e = Integer.parseInt(jSONObject.getString("alignment"));
            } catch (Throwable unused) {
                this.e = 0;
            }
        }
        if (jSONObject.containsKey("fontSize")) {
            try {
                this.f = Integer.parseInt(jSONObject.getString("fontSize"));
            } catch (Throwable unused2) {
                this.f = 14;
            }
        }
        int i2 = this.f;
        if (i2 <= 0) {
            return;
        }
        this.f = epo.b(i2);
    }
}
