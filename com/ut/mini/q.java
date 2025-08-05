package com.ut.mini;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static q f24147a;
    private String b = null;
    private String c = null;
    private String d = null;
    private String e = null;

    static {
        kge.a(75219906);
        f24147a = new q();
    }

    public static q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("2e62585e", new Object[0]) : f24147a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
