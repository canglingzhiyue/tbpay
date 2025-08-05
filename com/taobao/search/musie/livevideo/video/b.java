package com.taobao.search.musie.livevideo.video;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19258a;
    private String b;
    private JSONObject c;
    private String d;
    private String e;
    private boolean f = true;
    private boolean g = true;
    private boolean h = true;
    private boolean i = true;
    private boolean j = false;

    static {
        kge.a(205076841);
    }

    public b(String str, String str2, JSONObject jSONObject, String str3) {
        this.f19258a = str;
        this.b = str2;
        this.c = jSONObject;
        this.d = str3;
    }

    public void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else if (bool == null) {
        } else {
            this.j = bool.booleanValue();
        }
    }

    public void b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66488c4", new Object[]{this, bool});
        } else if (bool == null) {
        } else {
            this.f = bool.booleanValue();
        }
    }

    public void c(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26617a3", new Object[]{this, bool});
        } else if (bool == null) {
        } else {
            this.g = bool.booleanValue();
        }
    }

    public void d(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae67a682", new Object[]{this, bool});
        } else if (bool == null) {
        } else {
            this.h = bool.booleanValue();
        }
    }

    public void e(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa693561", new Object[]{this, bool});
        } else if (bool == null) {
        } else {
            this.i = bool.booleanValue();
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f19258a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }
}
