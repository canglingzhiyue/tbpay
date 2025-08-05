package com.taobao.android.detail.sdk.vmodel.desc;

import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class m extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10379a;
    public ArrayList<a> b;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10381a;
        public ArrayList<Pair<String, String>> b;

        static {
            kge.a(483675796);
        }

        public a(JSONObject jSONObject) {
            this.f10381a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("title"));
            this.b = com.taobao.android.detail.sdk.utils.c.a(JSON.parseArray(jSONObject.getString("wearData")), new com.taobao.android.detail.sdk.utils.g<Pair<String, String>>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.m.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [android.util.Pair<java.lang.String, java.lang.String>, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ Pair<String, String> b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public Pair<String, String> a(Object obj) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Pair) ipChange.ipc$dispatch("4f747b8e", new Object[]{this, obj});
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    return new Pair<>(com.taobao.android.detail.sdk.utils.c.a(jSONObject2.getString("name")), com.taobao.android.detail.sdk.utils.c.a(jSONObject2.getString("content")));
                }
            });
        }
    }

    static {
        kge.a(-1642756514);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_MODEL_WEAR;
    }

    public m(ComponentModel componentModel) {
        super(componentModel);
        this.f10379a = "";
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.ModelWearViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("title")) {
            this.f10379a = jSONObject.getString("title");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        if (jSONArray == null) {
            return;
        }
        this.b = com.taobao.android.detail.sdk.utils.c.a(jSONArray, new com.taobao.android.detail.sdk.utils.g<a>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.vmodel.desc.m$a, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("4abc9bed", new Object[]{this, obj}) : new a((JSONObject) obj);
            }
        });
    }
}
