package com.taobao.android.abilitykit.ability.pop.model;

import android.content.pm.ActivityInfo;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dmo;
import tb.kge;

/* loaded from: classes4.dex */
public final class a extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String i;
    private String j;
    private int m;
    private boolean n;
    private ActivityInfo o;
    private boolean p;
    private boolean q;

    static {
        kge.a(707073856);
    }

    public a(JSONObject jSONObject) {
        super(jSONObject);
        this.m = -1;
        this.q = true;
        if (this.f != null) {
            this.i = dmo.a(this.f, "fragmentClass", (String) null);
            this.j = dmo.a(this.f, "droidFragmentTag", (String) null);
            this.m = dmo.a(this.f, "showNativeWithCode", -1);
            this.p = dmo.a(this.f, "recreateOnSysChanged", false);
            this.n = dmo.a(this.f, "recoverWindow", false);
            this.q = dmo.a(this.f, "enablePadActTransition", true);
        }
        if (this.e == null) {
            this.e = new JSONObject(0);
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.i;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.j;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.n;
    }

    public final void a(ActivityInfo activityInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1fdba0", new Object[]{this, activityInfo});
        } else {
            this.o = activityInfo;
        }
    }

    public final ActivityInfo f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActivityInfo) ipChange.ipc$dispatch("3b089f25", new Object[]{this}) : this.o;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.p;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.q;
    }
}
