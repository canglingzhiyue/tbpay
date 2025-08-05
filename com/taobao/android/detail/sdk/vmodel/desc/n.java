package com.taobao.android.detail.sdk.vmodel.desc;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class n extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<String> f10383a;
    public int b;
    public int c;

    static {
        kge.a(203740763);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_MULTI_PIC_CONTAINER;
    }

    public n(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.MultiPicContainerModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("picList");
        if (jSONArray == null) {
            return;
        }
        try {
            this.f10383a = com.taobao.android.detail.sdk.utils.c.a(jSONArray, new com.taobao.android.detail.sdk.utils.g<String>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.n.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                }
            });
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("size");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                this.b = jSONObject2.getIntValue("width");
                this.c = jSONObject2.getIntValue("height");
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ArrayList<String> arrayList = this.f10383a;
        return arrayList == null || arrayList.isEmpty();
    }
}
