package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10873a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    public int h;

    static {
        kge.a(1587820475);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public g g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4487d8dd", new Object[]{this});
        }
        return null;
    }

    public h(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f10873a = jSONObject.getString("textColor");
        this.b = jSONObject.getString("text");
        this.c = jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR);
        this.d = jSONObject.getString("fontName");
        this.g = jSONObject.getBoolean("hasDoubleLine").booleanValue();
        this.h = jSONObject.getInteger("textHeight").intValue();
        int i = this.h;
        if (i > 0) {
            this.h = com.taobao.android.detail.ttdetail.utils.f.a(i);
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
        this.f = com.taobao.android.detail.ttdetail.utils.f.a(i2);
    }
}
