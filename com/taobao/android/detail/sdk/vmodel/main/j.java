package com.taobao.android.detail.sdk.vmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class j extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10429a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public String i;
    public ArrayList<ResourceNode.SalePromotion.Memo> j;

    static {
        kge.a(-1539672556);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_ENTRANCE;
    }

    public j(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.f10429a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 1;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.EntranceViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        this.f10429a = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        this.b = jSONObject.getString("title");
        this.c = jSONObject.getString("level");
        this.d = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
        this.e = jSONObject.getString("icon");
        this.f = jSONObject.getString("bgUrl");
        this.i = jSONObject.getString("guidePicUrl");
        if (jSONObject.containsKey("logoType")) {
            this.g = jSONObject.getIntValue("logoType");
        }
        if (jSONObject.containsKey("iconType")) {
            this.h = jSONObject.getIntValue("iconType");
        }
        if (!jSONObject.containsKey("attributedTitle")) {
            return;
        }
        try {
            this.j = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getJSONArray("attributedTitle"), new com.taobao.android.detail.sdk.utils.g<ResourceNode.SalePromotion.Memo>() { // from class: com.taobao.android.detail.sdk.vmodel.main.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ResourceNode$SalePromotion$Memo, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ ResourceNode.SalePromotion.Memo b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ResourceNode.SalePromotion.Memo a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ResourceNode.SalePromotion.Memo) ipChange.ipc$dispatch("91b7c5b2", new Object[]{this, obj}) : new ResourceNode.SalePromotion.Memo((JSONObject) obj);
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        ArrayList<ResourceNode.SalePromotion.Memo> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f10429a) && TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.f) && (((arrayList = this.j) == null || arrayList.size() == 0) && this.g < 3)) {
            return false;
        }
        return super.isValid();
    }
}
