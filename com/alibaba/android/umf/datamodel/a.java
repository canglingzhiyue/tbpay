package com.alibaba.android.umf.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2837a;
    private String b;
    private Throwable c;

    static {
        kge.a(-2115582932);
    }

    public a(String str, String str2) {
        this.f2837a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UMFError{mCode='" + this.f2837a + "', mMessage='" + this.b + "', mThrowable=" + this.c + '}';
    }
}
