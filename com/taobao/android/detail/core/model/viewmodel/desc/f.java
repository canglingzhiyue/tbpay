package com.taobao.android.detail.core.model.viewmodel.desc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import java.util.ArrayList;
import tb.epf;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class f extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f9749a;
    public int b;
    public int c;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9751a;
        public int b;

        static {
            kge.a(590731086);
        }
    }

    static {
        kge.a(-914719675);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.PackingListViewModel";
    }

    public f(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
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
        this.f9749a = epw.a(jSONArray, new epy<a>() { // from class: com.taobao.android.detail.core.model.viewmodel.desc.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.core.model.viewmodel.desc.f$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("f899ed7a", new Object[]{this, obj});
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                a aVar = new a();
                aVar.f9751a = jSONObject2.getString("name");
                aVar.b = jSONObject2.getInteger("number").intValue();
                return aVar;
            }
        });
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ArrayList<a> arrayList = this.f9749a;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // tb.epf
    public String E_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this});
        }
        return this.s + "";
    }
}
