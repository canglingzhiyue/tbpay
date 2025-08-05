package com.taobao.android.detail.core.model.viewmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.epi;
import tb.kge;

/* loaded from: classes4.dex */
public class g extends epi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9770a;
    public String b;
    public boolean c;
    public String d;
    public int e;
    public double f;

    static {
        kge.a(-1208280027);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 100;
    }

    @Override // tb.epi, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.SysButtonViewModel";
    }

    public g(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        this.c = true;
        this.e = 10;
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        this.f9770a = jSONObject.getString("title");
        this.b = jSONObject.getString("defaultTitle");
        this.d = jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE) ? jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE) : null;
        try {
            if (jSONObject.containsKey("subTitleFontSize")) {
                this.e = Integer.parseInt(jSONObject.getString("subTitleFontSize"));
            }
        } catch (Exception unused) {
        }
        if (jSONObject.containsKey("enabled")) {
            this.c = jSONObject.getBooleanValue("enabled");
        }
        String string = this.component.mapping.getString("widthRatio");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f = Double.parseDouble(string);
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.f;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f9770a) && TextUtils.isEmpty(this.b)) {
            return false;
        }
        return super.isValid();
    }

    public g(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.c = true;
        this.e = 10;
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        this.f9770a = fields.getString("title");
        this.b = fields.getString("defaultTitle");
        this.d = fields.containsKey(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE) ? fields.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE) : null;
        try {
            if (fields.containsKey("subTitleFontSize")) {
                this.e = Integer.parseInt(fields.getString("subTitleFontSize"));
            }
        } catch (Exception unused) {
        }
        if (fields.containsKey("enabled")) {
            this.c = fields.getBooleanValue("enabled");
        }
        String string = iDMComponent.getFields().getString("widthRatio");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f = Double.parseDouble(string);
    }
}
