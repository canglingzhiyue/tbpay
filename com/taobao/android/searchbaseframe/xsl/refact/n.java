package com.taobao.android.searchbaseframe.xsl.refact;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f15042a;
    private final int b;
    private final int c;
    private final int d;

    static {
        kge.a(-1112316410);
    }

    public n(JSONObject styleObj) {
        int i;
        kotlin.jvm.internal.q.c(styleObj, "styleObj");
        this.f15042a = a("topRadius", styleObj);
        this.b = a("bottomRadius", styleObj);
        try {
            i = Color.parseColor(styleObj.getString("backgroundColor"));
        } catch (Exception unused) {
            i = 0;
        }
        this.c = i;
        this.d = a("paddingTop", styleObj);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f15042a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    private final int a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6635bcf1", new Object[]{this, str, jSONObject})).intValue();
        }
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        try {
            return (int) com.taobao.android.weex_framework.util.i.a(string);
        } catch (Exception unused) {
            return 0;
        }
    }
}
