package com.taobao.android.detail.sdk.vmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ae extends WidgetViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10410a;
    public String b;
    public boolean c;

    static {
        kge.a(1122836723);
    }

    public static /* synthetic */ Object ipc$super(ae aeVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_SHOP_INFO_ITEM;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public double getWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue();
        }
        return 100.0d;
    }

    public ae(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.ShopInfoItemViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        this.f10410a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("title"), "");
        this.b = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE), "");
        if (!jSONObject.containsKey("transferToShort")) {
            return;
        }
        this.c = jSONObject.getBooleanValue("transferToShort");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.f10410a) && !TextUtils.isEmpty(this.b)) {
            return super.isValid();
        }
        return false;
    }
}
