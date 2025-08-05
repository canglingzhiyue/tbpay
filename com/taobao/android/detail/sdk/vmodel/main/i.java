package com.taobao.android.detail.sdk.vmodel.main;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.kge;
import tb.noa;
import tb.tpc;

/* loaded from: classes4.dex */
public class i extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLANK = 2;
    public static final int TYPE_IMAGE = 5;
    public static final int TYPE_LINE = 1;
    public static final int TYPE_LINE_CENTER = 1;
    public static final int TYPE_LINE_DOUBLE = 3;
    public static final int TYPE_LINE_FULL = 2;
    public static final int TYPE_LINE_NULL = 4;
    public static final int TYPE_NO_LINE_TEXT = 4;
    public static final int TYPE_TEXT = 3;
    public static final int TYPE_TEXT_HIGHLIGHT = 6;

    /* renamed from: a  reason: collision with root package name */
    public int f10428a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-559049219);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30020;
    }

    public i(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.DivisionViewModel");
        if (componentModel == null) {
            this.f10428a = 1;
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject == null) {
            return;
        }
        this.c = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("topLine"));
        if ("center".equals(this.c)) {
            this.b = 1;
        } else if ("double".equals(this.c)) {
            this.b = 3;
        } else if ("full".equals(this.c)) {
            this.b = 2;
        } else {
            this.b = 4;
        }
        this.d = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("bottomLine"));
        String a2 = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("type"), "line");
        if ("line".equals(a2)) {
            this.f10428a = 1;
        } else if (noa.VALUE_CLICK_AREA_BLANK.equals(a2)) {
            this.f10428a = 2;
        } else if ("text".equals(a2)) {
            this.f10428a = 3;
        } else if ("noLineText".equals(a2)) {
            this.f10428a = 4;
        } else if ("image".equals(a2)) {
            this.f10428a = 5;
        } else if ("textHighlight".equals(a2)) {
            this.f10428a = 6;
        }
        this.e = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("title"));
        this.f = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("iconUrl"));
        this.g = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("fgcolor"));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.component != null && this.component.mapping != null && !this.component.mapping.isEmpty() && super.isValid();
    }
}
