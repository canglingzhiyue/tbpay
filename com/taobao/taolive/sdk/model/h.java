package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.i;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.pns;

/* loaded from: classes8.dex */
public abstract class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f21855a;
    public int b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public i.a h;
    public WeakReference<pns> i;

    static {
        kge.a(1176947682);
    }

    public abstract boolean a();

    public h(String str, int i, String str2, String str3, boolean z, String str4, String str5, i.a aVar, pns pnsVar) {
        this.d = "";
        this.f21855a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = aVar;
        this.i = new WeakReference<>(pnsVar);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f21855a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        WeakReference<pns> weakReference = this.i;
        return (weakReference == null || weakReference.get() == null || this.f21855a == null || this.g == null) ? false : true;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.e;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageServiceTask{topic='" + this.f21855a + "', mBizCode=" + this.b + ", mChannel='" + this.c + "', nick='" + this.d + "', isFandom=" + this.e + '}';
    }
}
