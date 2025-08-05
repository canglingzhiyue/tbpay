package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import tb.kge;
import tb.noa;

/* loaded from: classes5.dex */
public class f extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLANK = 100;
    public static final int TYPE_NO_LINE_TEXT = 102;
    public static final int TYPE_TEXT = 101;

    /* renamed from: a  reason: collision with root package name */
    public String f10871a;
    public int b;
    public int c;
    public String d;

    static {
        kge.a(-1157302056);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 1570701201) {
            return super.h();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public f() {
        super(null);
        this.f10871a = "#eeeeee";
        this.b = 9;
        this.c = 100;
    }

    public f(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("bgcolor")) {
            this.f10871a = jSONObject.getString("bgcolor");
        } else {
            this.f10871a = "#eeeeee";
        }
        if (jSONObject.containsKey("height")) {
            this.b = jSONObject.getIntValue("height");
        } else {
            this.b = 0;
        }
        if (jSONObject.containsKey("text")) {
            this.d = jSONObject.getString("text");
        }
        String string = jSONObject.getString("type");
        if (noa.VALUE_CLICK_AREA_BLANK.equals(string)) {
            this.c = 100;
        } else if ("text".equals(string)) {
            this.c = 101;
        } else if ("noLineText".equals(string)) {
            this.c = 102;
        } else {
            this.c = 100;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.c == 100) {
            return this.l;
        }
        return super.h();
    }
}
