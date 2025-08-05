package com.taobao.android.tschedule.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15675a;
    public int b;
    public final String c;

    static {
        kge.a(1083703511);
    }

    private k(String str, int i, String str2) {
        this.f15675a = str;
        this.b = i;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f15675a.equals(kVar.f15675a) && this.c.equals(kVar.c)) {
                return true;
            }
        }
        return false;
    }

    public static k a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("3a5efee6", new Object[]{str, new Integer(i), str2}) : new k(str, i, str2);
    }

    public static k a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("37fc42c7", new Object[]{str, str2}) : new k(str, 1, str2);
    }
}
