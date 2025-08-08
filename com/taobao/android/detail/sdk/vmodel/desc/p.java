package com.taobao.android.detail.sdk.vmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class p extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f10386a;
    public int b;
    public int c;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10388a;
        public int b;

        static {
            kge.a(-2022578124);
        }
    }

    static {
        kge.a(1648551839);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_PACKING_LIST;
    }

    public p(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.PackingListViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (!StringUtils.isEmpty(jSONObject.getString("maxNoMoreRows"))) {
            this.b = Integer.parseInt(jSONObject.getString("maxNoMoreRows"));
        }
        if (!StringUtils.isEmpty(jSONObject.getString("maxShowRows"))) {
            this.c = Integer.parseInt(jSONObject.getString("maxShowRows"));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("infoList");
        if (jSONArray == null) {
            return;
        }
        this.f10386a = com.taobao.android.detail.sdk.utils.c.a(jSONArray, new com.taobao.android.detail.sdk.utils.g<a>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.vmodel.desc.p$a, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("4abdf90a", new Object[]{this, obj});
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                a aVar = new a();
                aVar.f10388a = jSONObject2.getString("name");
                aVar.b = jSONObject2.getInteger("number").intValue();
                return aVar;
            }
        });
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ArrayList<a> arrayList = this.f10386a;
        return arrayList == null || arrayList.isEmpty();
    }
}
