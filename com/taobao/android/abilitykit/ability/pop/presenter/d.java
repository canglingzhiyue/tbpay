package com.taobao.android.abilitykit.ability.pop.presenter;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.abilitykit.ability.pop.model.c;
import tb.dle;

/* loaded from: classes4.dex */
public interface d<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dle> {

    /* loaded from: classes4.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void b(JSONObject jSONObject);
    }

    void a(float f, float f2, boolean z);

    void a(JSONObject jSONObject, boolean z);

    void a(a aVar);

    void a(String str);

    boolean a(CONTEXT context, PARAMS params, View view, int i);
}
