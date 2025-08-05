package com.taobao.android.detail.datasdk.model.viewmodel.main;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.emu;
import tb.epw;
import tb.kge;
import tb.noa;

/* loaded from: classes4.dex */
public class a extends b {
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
    public int f10065a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-1713574276);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.main.DivisionViewModel");
        if (componentModel == null) {
            this.f10065a = 1;
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject == null) {
            return;
        }
        this.c = epw.a(jSONObject.getString("topLine"));
        if ("center".equals(this.c)) {
            this.b = 1;
        } else if ("double".equals(this.c)) {
            this.b = 3;
        } else if ("full".equals(this.c)) {
            this.b = 2;
        } else {
            this.b = 4;
        }
        this.d = epw.a(jSONObject.getString("bottomLine"));
        String a2 = epw.a(jSONObject.getString("type"), "line");
        if ("line".equals(a2)) {
            this.f10065a = 1;
        } else if (noa.VALUE_CLICK_AREA_BLANK.equals(a2)) {
            this.f10065a = 2;
        } else if ("text".equals(a2)) {
            this.f10065a = 3;
        } else if ("noLineText".equals(a2)) {
            this.f10065a = 4;
        } else if ("image".equals(a2)) {
            this.f10065a = 5;
        } else if ("textHighlight".equals(a2)) {
            this.f10065a = 6;
        }
        this.e = epw.a(jSONObject.getString("title"));
        this.f = epw.a(jSONObject.getString("iconUrl"));
        this.g = epw.a(jSONObject.getString("fgcolor"));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.component != null && this.component.mapping != null && !this.component.mapping.isEmpty() && super.isValid();
    }

    public a(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.main.DivisionViewModel");
        if (iDMComponent == null) {
            this.f10065a = 1;
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields == null) {
            return;
        }
        this.c = epw.a(fields.getString("topLine"));
        if ("center".equals(this.c)) {
            this.b = 1;
        } else if ("double".equals(this.c)) {
            this.b = 3;
        } else if ("full".equals(this.c)) {
            this.b = 2;
        } else {
            this.b = 4;
        }
        this.d = epw.a(fields.getString("bottomLine"));
        String a2 = epw.a(fields.getString("type"), "line");
        if ("line".equals(a2)) {
            this.f10065a = 1;
        } else if (noa.VALUE_CLICK_AREA_BLANK.equals(a2)) {
            this.f10065a = 2;
        } else if ("text".equals(a2)) {
            this.f10065a = 3;
        } else if ("noLineText".equals(a2)) {
            this.f10065a = 4;
        } else if ("image".equals(a2)) {
            this.f10065a = 5;
        } else if ("textHighlight".equals(a2)) {
            this.f10065a = 6;
        }
        this.e = epw.a(fields.getString("title"));
        this.f = epw.a(fields.getString("iconUrl"));
        this.g = epw.a(fields.getString("fgcolor"));
    }
}
