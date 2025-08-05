package com.alibaba.android.ultron.common.page.provider;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;
import tb.bik;
import tb.bim;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.alibaba.android.ultron.common.page.provider.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0085a {
        void a(String str, String str2, bim bimVar);

        void a(bik bikVar);
    }

    void a();

    void a(Context context, JSONObject jSONObject, JSONObject jSONObject2, InterfaceC0085a interfaceC0085a);

    void a(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map);

    void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2);

    void a(b bVar);

    void a(JSONArray jSONArray);

    JSONObject b();

    boolean c();

    void d();
}
