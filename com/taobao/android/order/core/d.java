package com.taobao.android.order.core;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes6.dex */
public interface d {
    View a(Context context);

    ViewGroup a(View view);

    void a(View view, int i, String str);

    void a(View view, boolean z);

    void a(JSONObject jSONObject);

    RecyclerView b(View view);

    void b(View view, int i, String str);

    LinearLayout c(View view);

    LinearLayout d(View view);

    ViewGroup e(View view);
}
