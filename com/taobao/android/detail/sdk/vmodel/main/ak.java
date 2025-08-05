package com.taobao.android.detail.sdk.vmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ak extends WidgetViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10417a;
    public String b;
    public boolean c;
    public double d;
    public String e;
    public int f;

    static {
        kge.a(45782527);
    }

    public static /* synthetic */ Object ipc$super(ak akVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public int getMiniWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13b808f3", new Object[]{this})).intValue();
        }
        return 100;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 10001;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public double getWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue() : this.d;
    }

    public ak(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.c = true;
        this.f = 10;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.SysButtonViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        this.f10417a = jSONObject.getString("title");
        this.b = jSONObject.getString("defaultTitle");
        this.e = jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE) ? jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE) : null;
        try {
            if (jSONObject.containsKey("subTitleFontSize")) {
                this.f = Integer.parseInt(jSONObject.getString("subTitleFontSize"));
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
        this.d = Double.parseDouble(string);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f10417a) && TextUtils.isEmpty(this.b)) {
            return false;
        }
        return super.isValid();
    }
}
