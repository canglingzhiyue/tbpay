package com.taobao.search.musie.lottie;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f19262a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private final float f;

    static {
        kge.a(706627403);
    }

    public a(JSONObject jSONObject) {
        String str = (jSONObject == null || (str = jSONObject.getString("mode")) == null) ? "playOnce" : str;
        int hashCode = str.hashCode();
        int i = 1;
        if (hashCode == 3327652) {
            if (str.equals("loop")) {
                this.f19262a = -1;
            }
            this.f19262a = 0;
        } else if (hashCode != 1099846370) {
            if (hashCode == 1878614997 && str.equals("playOnce")) {
                this.f19262a = 0;
            }
            this.f19262a = 0;
        } else {
            if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse)) {
                this.f19262a = -1;
                i = 2;
            }
            this.f19262a = 0;
        }
        this.b = i;
        this.c = a("fromFrame", jSONObject, 0);
        this.d = a("toFrame", jSONObject, -1);
        this.e = a("fromProgress", jSONObject, 0) / 100.0f;
        this.f = a("toProgress", jSONObject, 100) / 100.0f;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f19262a;
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

    public final float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.e;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : this.f;
    }

    private final int a(String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("608255b8", new Object[]{this, str, jSONObject, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        Object obj = jSONObject.get(str);
        return obj instanceof Integer ? ((Number) obj).intValue() : i;
    }
}
