package com.taobao.android.detail.core.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.epi;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class f extends epi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9769a;
    public String b;
    public boolean c;

    static {
        kge.a(-1029168883);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue();
        }
        return 100.0d;
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.ShopInfoItemViewModel";
    }

    public f(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        this.f9769a = epw.a(jSONObject.getString("title"), "");
        this.b = epw.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE), "");
        if (!jSONObject.containsKey("transferToShort")) {
            return;
        }
        this.c = jSONObject.getBooleanValue("transferToShort");
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f9769a) && !StringUtils.isEmpty(this.b)) {
            return super.isValid();
        }
        return false;
    }

    public f(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        this.f9769a = epw.a(fields.getString("title"), "");
        this.b = epw.a(fields.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE), "");
        if (!fields.containsKey("transferToShort")) {
            return;
        }
        this.c = fields.getBooleanValue("transferToShort");
    }
}
