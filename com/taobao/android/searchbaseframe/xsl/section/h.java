package com.taobao.android.searchbaseframe.xsl.section;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.i;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f15052a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;

    static {
        kge.a(-670766014);
    }

    public h(JSONObject jSONObject) {
        this.f15052a = -1;
        boolean z = false;
        this.b = 0;
        this.c = false;
        try {
            this.f15052a = Color.parseColor(jSONObject.getString("backgroundColor"));
        } catch (Exception unused) {
            this.f15052a = 0;
        }
        this.b = a("stickyTop", jSONObject);
        this.c = jSONObject.getBooleanValue("sectionClip");
        if (this.c) {
            this.d = a("sectionClipThreshold", jSONObject);
        }
        this.e = a("halfStickyOffset", jSONObject);
        Boolean bool = jSONObject.getBoolean("sticky");
        this.f = (bool == null || bool.booleanValue()) ? true : z;
    }

    private h(int i, int i2, boolean z, int i3, int i4, boolean z2) {
        this.f15052a = -1;
        this.b = 0;
        this.c = false;
        this.f15052a = i;
        this.f = z2;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = i4;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    private int a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6635bcf1", new Object[]{this, str, jSONObject})).intValue();
        }
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        try {
            return (int) i.a(string);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.e;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f15052a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.d;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f15052a = i;
        }
    }

    public h g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("7464dc5", new Object[]{this}) : new h(this.f15052a, this.b, this.c, this.d, this.e, this.f);
    }
}
