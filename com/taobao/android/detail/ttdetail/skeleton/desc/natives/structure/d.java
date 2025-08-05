package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes5.dex */
public class d implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, RuleModel> f10858a;
    public HashMap<String, ActionModel> b;
    private Context c;

    static {
        kge.a(1384574950);
        kge.a(-413437597);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.l
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ID";
    }

    public d(Context context) {
        this.c = context;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.f10858a = i.a(jSONObject, new k<RuleModel>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.RuleModel, java.lang.Object] */
                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
                public /* synthetic */ RuleModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RuleModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RuleModel) ipChange2.ipc$dispatch("edbe5d52", new Object[]{this, obj}) : new RuleModel((JSONObject) obj);
                }
            });
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.b = i.a(jSONObject, new k<ActionModel>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel] */
                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
                public /* synthetic */ ActionModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ActionModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("e065400c", new Object[]{this, obj}) : new ActionModel((JSONObject) obj);
                }
            });
        }
    }

    public DescModel a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("d638895b", new Object[]{this, jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        DescModel descModel = new DescModel();
        descModel.components = new ArrayList<>();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            descModel.components.add(new ComponentModel((JSONObject) it.next(), this));
        }
        return descModel;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.l
    public RuleModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleModel) ipChange.ipc$dispatch("726d9d1a", new Object[]{this, str, str2});
        }
        if (a.a(this.f10858a) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return this.f10858a.get(str2);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.l
    public ActionModel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionModel) ipChange.ipc$dispatch("d2bb9c5e", new Object[]{this, str});
        }
        if (a.a(this.b) || TextUtils.isEmpty(str)) {
            return null;
        }
        return new ActionModel(this.b.get(str));
    }
}
