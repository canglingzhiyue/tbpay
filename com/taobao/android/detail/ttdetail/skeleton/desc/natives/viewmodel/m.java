package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class m extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f10881a;
    public int b;
    public int c;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10883a;
        public int b;

        static {
            kge.a(-2041602327);
        }
    }

    static {
        kge.a(-1338193462);
    }

    public m(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (!TextUtils.isEmpty(jSONObject.getString("maxNoMoreRows"))) {
            this.b = Integer.parseInt(jSONObject.getString("maxNoMoreRows"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("maxShowRows"))) {
            this.c = Integer.parseInt(jSONObject.getString("maxShowRows"));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("infoList");
        if (jSONArray == null) {
            return;
        }
        this.f10881a = com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.i.a(jSONArray, new com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k<a>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m$a, java.lang.Object] */
            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("347b9fe4", new Object[]{this, obj});
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                a aVar = new a();
                aVar.f10883a = jSONObject2.getString("name");
                aVar.b = jSONObject2.getInteger("number").intValue();
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
        ArrayList<a> arrayList = this.f10881a;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        return this.j + "";
    }
}
