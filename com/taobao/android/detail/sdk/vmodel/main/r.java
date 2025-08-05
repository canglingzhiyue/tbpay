package com.taobao.android.detail.sdk.vmodel.main;

import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ShippingNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class r extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ShippingNode.StageInfo> f10441a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        kge.a(-189659419);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_MULTISTAGE;
    }

    public r(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.b = Color.parseColor("#CECECE");
        this.c = Color.parseColor("#7A45E5");
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MultiStageViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject.containsKey(NWFullTracePlugin.FullTraceJSParam.STAGES)) {
            try {
                this.f10441a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getJSONArray(NWFullTracePlugin.FullTraceJSParam.STAGES), new com.taobao.android.detail.sdk.utils.g<ShippingNode.StageInfo>() { // from class: com.taobao.android.detail.sdk.vmodel.main.r.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ShippingNode$StageInfo, java.lang.Object] */
                    @Override // com.taobao.android.detail.sdk.utils.g
                    public /* synthetic */ ShippingNode.StageInfo b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public ShippingNode.StageInfo a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (ShippingNode.StageInfo) ipChange.ipc$dispatch("3f83b916", new Object[]{this, obj}) : new ShippingNode.StageInfo((JSONObject) obj);
                    }
                });
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.containsKey("normalColor")) {
            this.b = com.taobao.android.detail.sdk.utils.b.a(jSONObject.getString("normalColor"));
        }
        this.d = this.b;
        if (jSONObject.containsKey("titleNormalColor")) {
            this.d = com.taobao.android.detail.sdk.utils.b.a(jSONObject.getString("titleNormalColor"));
        }
        if (jSONObject.containsKey("selectedColor")) {
            this.c = com.taobao.android.detail.sdk.utils.b.a(jSONObject.getString("selectedColor"));
        }
        this.e = this.c;
        if (!jSONObject.containsKey("titleSelectedColor")) {
            return;
        }
        this.e = com.taobao.android.detail.sdk.utils.b.a(jSONObject.getString("titleSelectedColor"));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        ArrayList<ShippingNode.StageInfo> arrayList = this.f10441a;
        if (arrayList != null && arrayList.size() != 0) {
            return super.isValid();
        }
        return false;
    }
}
