package com.taobao.android.detail.sdk.vmodel.desc;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.noa;
import tb.tpc;

/* loaded from: classes4.dex */
public class f extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLANK = 100;
    public static final int TYPE_NO_LINE_TEXT = 102;
    public static final int TYPE_TEXT = 101;

    /* renamed from: a  reason: collision with root package name */
    public String f10369a;
    public int b;
    public int c;
    public String d;

    static {
        kge.a(17123629);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_DESC_DIVIDER;
    }

    public f() {
        super(null);
        this.f10369a = "#eeeeee";
        this.b = 9;
        this.c = 100;
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.DividerViewModel");
    }

    public f(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.DividerViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("bgcolor")) {
            this.f10369a = jSONObject.getString("bgcolor");
        } else {
            this.f10369a = "#eeeeee";
        }
        if (jSONObject.containsKey("height")) {
            this.b = jSONObject.getIntValue("height");
        } else {
            this.b = 9;
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
}
