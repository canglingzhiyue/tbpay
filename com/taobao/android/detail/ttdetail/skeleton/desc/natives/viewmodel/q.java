package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class q extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f10887a;
    public int b;
    public ArrayList<a> c;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10890a;
        public String b;
        public ArrayList<String> c;

        static {
            kge.a(-538546692);
        }
    }

    static {
        kge.a(-1890730060);
    }

    public q(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f10887a = jSONObject.getIntValue("maxNoMoreRows");
        this.b = jSONObject.getIntValue("maxShowRows");
        JSONArray jSONArray = jSONObject.getJSONArray("infoList");
        if (jSONArray == null) {
            return;
        }
        this.c = com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.i.a(jSONArray, new com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k<a>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q$a, java.lang.Object] */
            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("347d7160", new Object[]{this, obj});
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                a aVar = new a();
                aVar.f10890a = jSONObject2.getString("name");
                aVar.b = jSONObject2.getString("content");
                aVar.c = com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.i.a(jSONObject2.getJSONArray("image"), new com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k<String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
                    public /* synthetic */ String b(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("eeb6464d", new Object[]{this, obj2}) : a(obj2);
                    }

                    public String a(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("8a5b32dc", new Object[]{this, obj2}) : (String) obj2;
                    }
                });
                return aVar;
            }
        });
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ArrayList<a> arrayList = this.c;
        return arrayList == null || arrayList.isEmpty();
    }
}
